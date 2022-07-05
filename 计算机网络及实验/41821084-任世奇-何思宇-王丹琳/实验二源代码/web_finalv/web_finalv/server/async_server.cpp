#include <unistd.h>
#include <pthread.h>
#include <sys/epoll.h>
#include "../lib/socket.h"
#include "async_server.h"
#include "../log/log.h"
#include "../http/http.h"
#include "epoll.h"
#include "conn_ctx.h"
#include "async_handler.h"

Async_server_ctx* global_ctx;

int init_async_server(bool is_nostub, const char * home,int thread_num)
{
    char buff[1024];
    int ret = 0;
    global_ctx = new Async_server_ctx(12000, 12000, 200, is_nostub);
    if(global_ctx == NULL)
    {
        perror("malloc in init error\n");
        return -1;
    }
    
    if(home)
        g_home = (char *)home;
 
    
    if(snprintf(buff,1024,"%s/%s",g_home, g_loghome) <=0){
        perror("snprintf log path error");
        goto err1;
    } 
    
    global_ctx->setlog(new log::Log(buff, "access.log", LX_LOG_DEBUG, 1, 1, 0));
    global_ctx->getlog()->setdailyarg(global_ctx->getasarg());
    global_ctx->getlog()->setarg(&(global_ctx->getasarg()));
    global_ctx->getlog()->setplock(0);
    global_ctx->getlog()->settlock(1);
    if ( thread_num <= 0 && (thread_num = sysconf(_SC_NPROCESSORS_ONLN) ) < 0){
            perror("get cpu core number error");
            ret = -1;
            goto err;
            
    }
    global_ctx->setthreadnum(thread_num);
    
    return 0;
err:
    global_ctx->getlog()->cleanup();
err1:    
    pthread_mutex_destroy(&global_ctx->getmutex());
    if(global_ctx != NULL)
        delete(global_ctx);
    global_ctx = NULL;
    return -1;
}

int cleanup_async_server()
{
    if( global_ctx != NULL)
    {
       global_ctx->getlog()->cleanup();     
        
       pthread_mutex_destroy(&(global_ctx->getmutex()));
        
       delete(global_ctx);

       global_ctx = NULL;
        
    }
    return 0;
}

void* do_service(void * arg);

int start_async_server(int port)
{
    int i,ret,listen_fd ;
    pthread_t tid;
    if( (listen_fd = lx_listen(port)) < 0 ){
        global_ctx->getlog()->logerror("lx_listen error[%d:%s]",ret, strerror(ret));
        return -1;
    }
    for(i = 0; i < global_ctx->getthreadnum(); ++i){
       if( ret = pthread_create(&tid, NULL,do_service,(void *)listen_fd )){
            global_ctx->getlog()->logerror("pthread_create error[%d:%s]",ret, strerror(ret));
            return -1;
       }
       if( ret = pthread_detach(tid)){
            global_ctx->getlog()->logerror("pthread_detach error[%d:%s]",ret, strerror(ret));
            return -1;
       }

       global_ctx->getlog()->loginfo("server %ld start",(long)tid);
    }

    global_ctx->getlog()->loginfo("Starting server succeed. The number of working threads is %d",global_ctx->getthreadnum());

    while (1)
        sleep(5);
end:
    if(listen_fd >=0)
        close(listen_fd);
    
    return 0;    
}

void* do_service(void * arg)
{
    int ret = 0, ep_fd = -1,listen_fd = -1;
    struct epoll_event *events = NULL;
    Async_conn_ctx* listen_ctx = NULL;
    rbtree::RbTree_t timer;
    //timer.root = new rbtree::RbTreeNode();
    //timer.nil = *(timer.root);
    timer.nil = *(new rbtree::RbTreeNode());
    timer.root = &(timer.nil);
    //lx_rbtree_init(&timer,malloc,free);
    listen_fd = (int)(long)arg;

    if( (ep_fd = epoll_create(20)) < 0 ){
        global_ctx->getlog()->logerror("epoll_create error");
        return NULL;
    }
    
    if( (events = (struct epoll_event *)malloc(global_ctx->getmaxevent() * sizeof(struct epoll_event) ) ) 
        == NULL){
        global_ctx->getlog()->logerror("malloc epoll events error");
        ret = -1; goto end;
    }
     
    /*if( (listen_ctx = new_conn_ctx(ep_fd,listen_fd,listen_handle,&timer)) == NULL)
    {
        global_ctx->getlog()->logerror(&global_ctx->log,"new_conn_ctx error");
        ret = -1;goto end;
    }*/
    listen_ctx = new Async_conn_ctx(ep_fd, listen_fd, &timer, listen_handle);
    listen_ctx->setstage(STAGE_LISTENING);
    
    if( lx_set_epoll(ep_fd,listen_fd,listen_ctx,EPOLLIN|EPOLLET, true, true)){
        global_ctx->getlog()->logerror("lx_set_epoll error" );
        ret = -1; goto end;
    }
   
    for(;;){
        ret = epoll_wait(ep_fd,events, global_ctx->getmaxevent(),global_ctx->gettimeout());
        if(ret < 0){
            if(errno != EINTR){
                global_ctx->getlog()->logerror("epoll_wait error");
                ret = -1;goto end;
            }else
                continue;
        }else if(ret > 0)
      //      std::cout << "doing handle_events" << std::endl;
            handle_events(ep_fd,events,ret,&timer);
    }

    ret = 0;
end:
    if(timer.root)
    {

    	delete(timer.root);
	timer.root = nullptr;
    }
    if(ep_fd >=0)
        close(ep_fd);
    
    if(events)
        free(events);
    
    if (listen_ctx)
    {
        delete(listen_ctx);
	listen_ctx = nullptr;
    }
    return NULL;    
}


