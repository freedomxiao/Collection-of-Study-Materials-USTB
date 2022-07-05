#include <stdint.h>
#include <assert.h>
#include "async_server.h"
#include "async_handler.h"
#include "../lib/fileio.h"
#include "../lib/hsy_time.h"
#include "../rbtree/rbtree.h"
#include "conn_ctx.h"
#include "../lib/buffer.h"
#include "../http/http.h"
#include <sys/socket.h>

extern Async_server_ctx* global_ctx;
extern char* h_prot_str[];
int req_head_handle(Async_conn_ctx*);
int req_body_handle(Async_conn_ctx*);
int resp_head_handle(Async_conn_ctx*);
int resp_body_handle(Async_conn_ctx*);
#define AGAIN_FLAG (errno == EAGAIN || errno == EWOULDBLOCK || errno == EINTR)

int remove_conn(Async_conn_ctx* pctx)
{
    if(pctx->getfd() >=0 && epoll_ctl(pctx->getepfd(),EPOLL_CTL_DEL, pctx->getfd(),NULL)){
        global_ctx->getlog()->logerror("delete fd:%d from epll error", pctx->getfd());
    }

    if(pctx->getfd() >=0){
        close((pctx->getfd()));
        pctx->setfd(-1);
    }

    //delete(pctx);
    return 0;    
}

int handle_events(int ep_fd,struct epoll_event * events, int nevent, rbtree::RbTree_t* timer)
{
    int i = 0, ret = 0;
    uint64_t key_temp;
    char ebuff[1024] ,*pebuff;
    Async_conn_ctx* cctx;
    rbtree::RbTreeNode * n;
    //if (nevent) printf("handle events ,nevent :%d\n",nevent);
    std::cout << "nevent:"<<nevent<<std::endl;
    for(; i < nevent;++i){
        cctx = (Async_conn_ctx*)events[i].data.ptr;
        cctx->setevents(events[i].events);

        pebuff = lx_get_events(cctx->getevents(),ebuff,1024 ); 
        //printf("events flags:%s\n",pebuff);
        
        ret = cctx->handle(cctx);
    }

    key_temp = (uint64_t)get_micros();
    while(1)
    {
        n = rbtree::rbTree_min(timer,timer->root);
        if(n != nullptr && n != &timer->nil )
        {
            
            if(n->getkey() == 0)
            {
                std::cout << "you\n";    
            }
            
            if (n->getkey() < key_temp)
            {
                uint64_t key = n->getkey();

                global_ctx->getlog()->loginfo("timer:connection timeout");
                //printf("delete key in timer check:%lu\n",(unsigned long)n->key);
                 
                remove_conn((Async_conn_ctx*)n->getdata());
                if(rbtree::rbTreeNode_delete(timer,n->getkey()) != 0)
                {
                    global_ctx->getlog()->logfatal("timer: cannot find key %lu for delete",(unsigned long) key);
                }


            }
            else
            {
                break;    
            }
        }
        else
        {
            break;    
        }            
    }
    return 0;
}

int listen_handle(Async_conn_ctx* arg)
{
    int ret = 0,fd = -1;
    socklen_t addrlen = 0;
    struct sockaddr_in addr;
    Async_conn_ctx* cctx = NULL;
    uint64_t l_temp;
    if(arg->getevents() & EPOLLERR ){
        global_ctx->getlog()->logerror("listen fd from epoll error");
        return 0;
    }

    addrlen = sizeof(struct sockaddr_in);
    if(pthread_mutex_trylock(&global_ctx->getmutex()) == 0){
	    std::cout<< "start to accept"<<std::endl;
        fd = accept(arg->getfd(),(struct sockaddr *)&addr, &addrlen);
        if(pthread_mutex_unlock(&global_ctx->getmutex())){
             global_ctx->getlog()->logerror("%s:pthread_mutex_unlock error",__FUNCTION__);
	     ret =  -1;
	     goto err;
        }
    }else{
        return 0;
    }
    
    if(fd < 0){ 
        if(errno == EAGAIN|| errno == EWOULDBLOCK) {
            //g_ctx->log.logdebug(&g_ctx->log,"accept return again or block,%d:%s",errno,strerror(errno));
            return 0;
        }else{
            global_ctx->getlog()->logerror("accept error");
            return 0;
        }
    }
    cctx = new Async_conn_ctx(arg->getepfd(), fd, arg->gettimer(), addr, conn_handle);
    
    if(lx_set_epoll(arg->getepfd() ,cctx->getfd(),cctx,EPOLLIN|EPOLLET,true,true)){
        global_ctx->getlog()->logerror("set_epoll error");
        ret = -1;goto err;
    }
    l_temp = get_micros() + global_ctx->getconntimeout()*1000;
    std::cout << "the timeout of new node = " << l_temp << std::endl;
    while(rbtree::rbTreeNode_insert(arg->gettimer(),(uint64_t)l_temp, cctx) != 0){
        l_temp += 1;
	std::cout << "l_temp + 1 succeed"<< std::endl;
    }
    cctx->settimeout(l_temp);
    //printf("insert key:%lu\n",(unsigned long)l_temp);
    
    printf("listen handle call end\n");
    return 0;
err:
    if (cctx)
        delete(cctx);

    if(fd >= 0){
        close(fd);
    }
    return ret;    
}

int record_end_log(Async_conn_ctx* arg)
{   
    char buff[1024];
    int ret;

    if( !inet_ntop(AF_INET, (void *)&arg->getpeeraddr()->sin_addr, buff, 16) ){
        global_ctx->getlog()->logerror("inet_ntop error");
        ret = -1;goto end;
    }
    
    if(getwidetime(time(NULL),buff +16,32) <=0){
        global_ctx->getlog()->logerror("get_wide_time error");
        ret = -1;goto end;
    }
    
    global_ctx->getlog()->loginfo("uri:%s,addr:%s:%d,start:%s,duration:%ld"
        ,http_get_uri((arg->getrequest())->getinfo()), buff, (int)ntohs(arg->getpeeraddr()->sin_port),
        buff+16, get_inval_micros(&(arg->getaccepttime()), NULL));
    
    ret = 0;
end:
    return ret;
}

int conn_handle(Async_conn_ctx* arg)
{
    int ret;
    rbtree::RbTree_t* root;
    uint64_t key;

    
    if(arg->getevents() & EPOLLERR || arg->getevents() & EPOLLHUP){
        global_ctx->getlog()->logerror("%s:connection error occur",__FUNCTION__);
        goto done;
     }
    switch(arg->getstage()){
        
    case STAGE_START:
        arg->setstage(STAGE_REQ_HEAD);
    
    case STAGE_REQ_HEAD:
        if ((ret = req_head_handle(arg)) == HANDLE_NEED_MORE)
        {
            return 0;
        }
        else if(ret == HANDLE_ERR)
        {
            goto done;
        }
        arg->setstage(STAGE_REQ_BODY);
        arg->setcontlen(0);
        arg->setinoutlen(0);
/*
        if(http_print_http(&(*this)._req_ctx)){
            g_ctx->log.logerror(&g_ctx->log,"print_pare_info error");
        }
*/
    case STAGE_REQ_BODY:
        if ((ret = req_body_handle(arg)) == HANDLE_NEED_MORE)
        {
            return 0;
        }
        else if(ret == HANDLE_ERR)
        {
            goto done;
        }
        arg->setstage(STAGE_RESP_HEAD);
        arg->getdatabuff()->setoffset(0);
        arg->getdatabuff()->setlen(0);
        if(lx_set_epoll(arg->getepfd(), arg->getfd(), arg, EPOLLOUT|EPOLLET, true, false)){
            global_ctx->getlog()->logerror("%s:lx_set_epoll error",__FUNCTION__);
            goto done;
        }
        return 0;

    case STAGE_RESP_HEAD:
        if ((ret = resp_head_handle(arg)) == HANDLE_NEED_MORE)
        {
            return 0;
        }
        else if (ret == HANDLE_ERR)
        {
            goto done;
        }
        arg->setstage(STAGE_RESP_BODY);
        arg->setfh(NULL);

    case STAGE_RESP_BODY:
        if ((ret = resp_body_handle(arg)) == HANDLE_NEED_MORE)
        {
            return 0;
        }
        else if (ret == HANDLE_ERR)
        {
            goto done;
        }
        arg->setstage(STAGE_DONE);
        record_end_log(arg);
    default:
        goto done;
    }
    //std::cout << "this conn step has finished" << std::endl;
done:

    //lx_rbtree_delete((*this)._timer,(uint64_t)(*this)._timeout);
    root = arg->gettimer();
    key = (uint64_t)arg->gettimeout();
    ret = rbtree::rbTreeNode_delete(root, key);
    remove_conn(arg);
    arg = nullptr;
    return 0;
}


int req_head_handle(Async_conn_ctx* arg)
{
    int ret = 0, read_num = 0, to_read_num = 0;
    char * buff;
    while(1)
	{
        buff = lx_buffer_lenp((arg->getrequest()->getoriginbuff()));
        to_read_num = lx_buffer_freenum((arg->getrequest()->getoriginbuff()));
		read_num = recv(arg->getfd(), buff, to_read_num, 0);
		if(read_num < 0)
        {
            if(AGAIN_FLAG)
            {
                ret = HANDLE_NEED_MORE;
                goto end;
             }
            else
            {
			    global_ctx->getlog()->logerror("%s:recv error",__FUNCTION__);
                ret = HANDLE_ERR;goto end;
             }
        }
        else if(read_num == 0)
        {
			global_ctx->getlog()->logerror("cannot get enough head info");
            ret = HANDLE_ERR;goto end;
		}
        else
        {
            arg->getrequest()->getoriginbuff()->setlen(arg->getrequest()->getoriginbuff()->getlen() + read_num);
	    ret = http_parse(arg->getrequest());
            if( ret == HEC_OK)
            {
                //copy to data_buff
                int tocopy = lx_buffer_unscannum(arg->getrequest()->getoriginbuff());
                if(tocopy >= (arg->getdatabuff())->getmaxlen()){
                    global_ctx->getlog()->logerror("req body too big to copy to data_buff");
                    ret = HANDLE_ERR;
                    goto end;
                }
                Buffer* tmp = arg->getrequest()->getoriginbuff();
                memcpy(arg->getdatabuff()->getbase(),lx_buffer_offsetp(tmp),tocopy);
                arg->getdatabuff()->setlen(tocopy);

                ret = HANDLE_DONE;
                goto end;
            }
            else if( ret == HEC_NEED_MORE)
                continue;
            else
            {
                global_ctx->getlog()->logerror("parser error[%d]",ret);
                ret = HANDLE_ERR;goto end;
            }
	    }
    }

end:
    return ret;
}

int req_body_handle(Async_conn_ctx* arg)
{
    int ret,nleft,to_read_num,read_num ;
    Buffer *data;
    
    data = arg->getdatabuff();
    arg->setcontlen(http_get_contlen(arg->getrequest()->getinfo()));

    if(arg->getcontlen() <= 0 )
        return HANDLE_DONE;
    
    if(arg->getinoutlen() == 0){
        arg->setinoutlen(arg->getcontlen() > data->getlen() ? data->getlen() : arg->getcontlen());
    }

    while(arg->getinoutlen() < arg->getcontlen()){

        nleft = arg->getcontlen() - arg->getinoutlen();
        to_read_num = nleft < data->getmaxlen()? nleft : data->getmaxlen();
        read_num = recv(arg->getfd(),data->getbase(), to_read_num,0);
        if(read_num < 0){
            if(AGAIN_FLAG ){
                ret = HANDLE_NEED_MORE;
                goto end;
            }else{
                global_ctx->getlog()->logerror("%s:recv err",__FUNCTION__);
                ret = HANDLE_ERR;
                goto end;
            }
        }else if(read_num == 0){
            global_ctx->getlog()->logerror("%s:can not get enough req body",__FUNCTION__);
            ret = HANDLE_ERR;
            goto end;
        }else{
	    std::cout << data->getbase()<< std::endl;
            arg->setinoutlen(read_num + arg->getinoutlen());
        }
    }

    ret = HANDLE_DONE;

end:
    return ret;
}

int resp_head_handle(Async_conn_ctx* arg)
{
    int ret, send_num,to_send_num;
    int rcode;
    char date[64] ,* uri,*rstr;
    Parser_ctx * response_ctx;
    int temp_num;
    char * headers[] = {  
        "Content-Type" ,"text/html",
        "Connection"   ,"Keep-Alive",
        "Server"       ,"ssss/spl 1.0",
        NULL,NULL
    };
    KVListNode* tmp = arg->getresponse()->getinfo()->getheaders();
    response_ctx = arg->getresponse();
    if(arg->getdatabuff()->getlen() == 0){
        if( !(ret = get_browser_time(time(NULL), date, 64))){
            global_ctx->getlog()->logerror("%s:snprintf date error",__FUNCTION__);
            ret = HANDLE_ERR;goto err;
        }

        uri = arg->getrequest()->getinfo()->geturi()->getbase() ? arg->getrequest()->getinfo()->geturi()->getbase() : arg->getrequest()->getinfo()->getbase() + arg->getrequest()->getinfo()->geturi()->getoffset();
        if( uri == NULL || strcmp(uri, "/") == 0)
            uri = "/index.html";
        if( (ret = snprintf(arg->getpath(), MAX_PATH_LEN, "%s/%s%s", g_home, g_whome, uri)) <= 0 ){
            global_ctx->getlog()->logerror("%s:snprintf path error",__FUNCTION__);
            ret = HANDLE_ERR;
            goto err;
        }
	std::cout << "---------" << arg->getpath()<< std::endl;
        if( (temp_num = lx_get_fsize(arg->getpath()) )== -1){
            arg->setcontlen(temp_num);
            rcode = 404;
            rstr = "File Not Found";
           
            global_ctx->getlog()->logerror("uri invalid ,404,uri:%s", uri);
            
            if( (ret = snprintf(arg->getpath(), MAX_PATH_LEN, "%s/%s%s", g_home, g_whome, "/404.html")) <= 0 ){
                global_ctx->getlog()->logerror("%s:snprintf path error,ret = %d",__FUNCTION__, ret);
                ret = HANDLE_ERR;
                goto err;
            }
            if( (temp_num = lx_get_fsize(arg->getpath()))== -1){
                arg->setcontlen(temp_num);
                global_ctx->getlog()->logerror("open 404 file error:%s", arg->getpath());
                ret = HANDLE_ERR;
                goto err;
            }
	    arg->setcontlen(temp_num);
        }else{
            arg->setcontlen(temp_num);
            rcode = RESP_OK;
            rstr = NULL;
        }
        int tmp_int = arg->getresponse()->getinfo()->getprot();
        Buffer* tmp_prot = arg->getresponse()->getinfo()->getprotstr();
        if(arg->getresponse()->http_set_prop1(P_HTTP_1_1, h_prot_str, &tmp_int, tmp_prot))
        {
            global_ctx->getlog()->logerror("set prot error");
            ret = HANDLE_ERR;goto err;
        }

        if( http_set_rcode(arg->getresponse(), rcode, rstr))
        {
            global_ctx->getlog()->logerror("set resp code error");
            ret = HANDLE_ERR;
            goto err;
        }
        if(arg->getresponse()->http_set_headers(headers, arg->getcontlen()))
        {
            global_ctx->getlog()->logerror("set headers error");
            ret = HANDLE_ERR;
            goto err;
        }
        
        if(response_ctx->http_set_prop3(&tmp,"Date", date, true)){
            global_ctx->getlog()->logerror("set headers error");
            ret = HANDLE_ERR;
            goto err;
        }

        arg->getdatabuff()->setlen(http_seri_head(response_ctx->getinfo(), T_RESP, arg->getdatabuff()->getbase(), arg->getdatabuff()->getmaxlen()));
            
   }
 
    while( lx_buffer_unscannum(arg->getdatabuff()) > 0  ){
        to_send_num = lx_buffer_unscannum(arg->getdatabuff());
        send_num = send(arg->getfd(),lx_buffer_offsetp(arg->getdatabuff()), to_send_num,0);
        if(send_num < 0){
            if( AGAIN_FLAG ){
                ret = HANDLE_NEED_MORE;
                goto err;
            }else{
                global_ctx->getlog()->logerror("%s:send error", __FUNCTION__);
                ret = HANDLE_ERR;goto err;    
            }    
        }else{
            arg->getdatabuff()->setoffset(arg->getdatabuff()->getoffset()+ send_num);
            continue;    
        }
    }

    ret = HANDLE_DONE;
err:
    return ret;
}

int fill_send_buff(Async_conn_ctx* arg)
{   int read_num,to_read_num;

    to_read_num = arg->getcontlen() - arg->getinoutlen() > arg->getdatabuff()->getmaxlen() ? arg->getdatabuff()->getmaxlen():arg->getcontlen() - arg->getinoutlen();
    read_num = freadn(arg->getfh() , arg->getdatabuff()->getbase(), to_read_num);
    if(read_num <= 0){
        global_ctx->getlog()->logerror("%s:read response file %s error",__FUNCTION__, arg->getpath());
        return -1;
    }
    
    arg->getdatabuff()->setlen(read_num);
    arg->getdatabuff()->setoffset(0);

    return 0;
}

int resp_body_handle(Async_conn_ctx* arg)
{
    int ret = HANDLE_DONE;
    FILE* tmp;
    if(arg->getfh() == NULL){
        if( (tmp = fopen(arg->getpath(),"rb" )) ==NULL){
	    std::cout << "fh is null and open fail" << std::endl;
            arg->setfh(tmp);
            global_ctx->getlog()->logerror("%s:open file %s error",__FUNCTION__, arg->getpath());
            ret = HANDLE_ERR;goto end;
        
	}
	arg->setfh(tmp);
        arg->getdatabuff()->setoffset(0);
        arg->getdatabuff()->setlen(0);
        arg->setinoutlen(0);
        if(fill_send_buff(arg)){
            global_ctx->getlog()->logerror("%s:fill_send_buff first error %s ",__FUNCTION__, arg->getpath());
            ret = HANDLE_ERR;goto end;
        }
        arg->setinoutlen(arg->getinoutlen() + arg->getdatabuff()->getlen());
    }
    while(1){
        int send_num,to_send_num;

        to_send_num = lx_buffer_unscannum(arg->getdatabuff());
        send_num = send(arg->getfd(),lx_buffer_offsetp(arg->getdatabuff()), to_send_num,0);
        if( send_num < 0){
            if(AGAIN_FLAG){
                ret = HANDLE_NEED_MORE;goto end;    
           }else{
                global_ctx->getlog()->logerror("%s:send response body  error",__FUNCTION__);
                ret = HANDLE_ERR;goto end;
            }    
        }else if(send_num == 0){
             global_ctx->getlog()->logerror("%s:send response body  error,send_num = 0",__FUNCTION__);
             ret = HANDLE_ERR;goto end;
        }else{
            arg->getdatabuff()->setoffset(arg->getdatabuff()->getoffset() + send_num);
            
            if(arg->getdatabuff()->getoffset() == arg->getdatabuff()->getlen()){
                if( arg->getinoutlen() == arg->getcontlen()){
                    ret = HANDLE_DONE; goto end;
                 }else{
                    if(fill_send_buff(arg)){
                        global_ctx->getlog()->logerror("%s:fill_send_buff second  error %s ",__FUNCTION__, arg->getpath());
                        ret = HANDLE_ERR;goto end;
                    }
                    arg->setinoutlen(arg->getdatabuff()->getlen() + arg->getinoutlen());
                    continue;
                }   
            }else{
                continue;    
            }
        }
    }//end send loop
    
    ret = HANDLE_DONE;
    
end:
    if(ret == HANDLE_ERR || ret == HANDLE_DONE){
        if(arg->getfh() != NULL){
            fclose(arg->getfh());
            arg->setfh(NULL);
        }
    }
    return ret;
}
