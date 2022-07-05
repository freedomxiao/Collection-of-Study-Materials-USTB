#include "http.h"
#include <iostream>
#include "../lib/list.h"

char * http_resp_str[] ={
    "200", "OK", 
    "300", "redirection",
    "400", "client error",
    "500", "server error",
     NULL,  NULL
    };

int findarr_by_value(char ** array,char * value)
{
    int i = 0;

    while(*array)
    {
        if( strncmp(*array, value,strlen(*array)) == 0 )
            return i;
        ++i;
    }
    return -1;
}

char * h_mtod_str[] = {"GET","POST","HEAD",NULL};
char * h_prot_str[] ={"HTTP/0.", "HTTP/1.0","HTTP/1.1",NULL}; 
char * http_stage_str[] = 
{"stage_start","stage_listening","stage_req_head","stage_req_body","stage_resp_head","stage_resp_body","stage_done" };

int get_http_prot(char * buff,int len)
{
    if(strncmp(buff, h_prot_str[2],len ) == 0)
        return P_HTTP_1_1;
    else if( strncmp(buff,h_prot_str[1],len) ==0 )
        return P_HTTP_1_0;
    else if( strncmp(buff, h_prot_str[0], strlen( h_prot_str[0])) == 0)
        return P_HTTP_0_X;
    return -1;
}



int http_set_rcode(Parser_ctx * pctx,int code, char * code_str)
{
    char * nbuff,*temp_buff;
    size_t len;

    if(code_str == NULL){
        code_str = http_get_respstr(code);
        if(!code_str)
            code_str = "";
    }

    len = strlen(code_str);
    pctx->getinfo()->getcodestr()->buffer_reset(code_str);
    pctx->getinfo()->setresponsecode(code);
  
    return 0;
}

int Parser_ctx::http_set_prop1(int intval, char** strarr, void* key, Buffer* str)
{
    char* nbuff, * temp_buff;
    int len;

    temp_buff = findarr_by_key(strarr, intval);
    str->buffer_reset(temp_buff);

    *(int*)key = intval;
    return 0;
}

int Parser_ctx::http_set_prop2(Buffer* buffer, char* nval)
{
    buffer->buffer_reset(nval);
    return 0;
}

int Parser_ctx::http_set_prop3(KVListNode** phead, char* key, char* value, bool is_header)
{
    KVListNode* node;

    node = (*this)._info->http_find_node(key, *phead, is_header);
    if (!node)
    {
        node = (KVListNode*)kvlist_append(phead, key, value);
        if (node == NULL)
            return HEC_APPNODE_ERR;
    }
    else
    {
        node->getvalue()->buffer_reset(value);
    }

    return 0;
}

char * http_find_node_value(HeadInfo *info,char * key,KVListNode * head_node,bool is_header)
{
	KVListNode * node;
	
	node = info->http_find_node(key,head_node,is_header);
	if(node == NULL)
		return NULL;
	
	if(node->getvalue()->getbase())
		return node->getvalue()->getbase();
	else{
        if(is_header)
		    return info->getbase() + node->getvalue()->getoffset();
        else
            return info->geturibase() + node->getvalue()->getoffset();
    }
}

int http_get_contlen(HeadInfo *info)
{
    char * buff;

	buff = http_get_header(info,"Content-Length");
	if(buff == NULL)
		return -1;
	
	return atoi(buff);
}


/*int http_hinfo_cleanup(Parser_ctx * pctx)
{
    h_head_info *pinfo = &pctx->info;
    KVListNode ** listpp[] = {&pinfo->params,&pinfo->headers}; 
    KVListNode * cur,*pre;
    
    lx_buffer * tofree[] = {&pinfo->mtod_str,&pinfo->uri,&pinfo->path, &pinfo->prot_str,&pinfo->code_str};
    int i;

    for(i = 0; i <(int) (sizeof(tofree)/sizeof(tofree[0]));++i ){
        if(tofree[i] ->base)
            pctx->hfree(tofree[i]->base);     
    }
    
    for(i = 0; i <(int)( sizeof(listpp)/sizeof(listpp[i])); i++ )
    {
        cur = *listpp[i];
        while(cur)
        {
            if(cur->key.base)
                pctx->hfree(cur->key.base);
            if(cur->value.base)
                pctx->hfree(cur->value.base);
            
            pre = cur;
            cur =(KVListNode *)cur->list.next;
            pctx->hfree(pre);
        }
        
        *listpp[i] = NULL;    
    }

    return 0;
}*/

int http_seri_head(HeadInfo *pinfo,int type, char * buff, int maxlen)
{
    int ret;
    int len;
    KVListNode *node;

    len = 0;
    if(type == T_REQ)
        ret = snprintf(buff,maxlen,"%s %s %s\r\n"
            ,http_get_mtod(pinfo),http_get_uri(pinfo),http_get_prot(pinfo));
    else
       ret = snprintf(buff, maxlen,"%s %d %s\r\n"
            ,http_get_prot(pinfo) ,http_get_code(pinfo),http_get_codestr(pinfo));

    if(ret <= 0)
        return HEC_MEMORY_ERR;
    
    len +=ret;
    node = pinfo->getheaders();
    while(node)
    {
        ret = snprintf(buff+len, maxlen -len, "%s: %s\r\n"
            ,http_get_buffval(pinfo,node->getkey()), http_get_buffval(pinfo,node->getvalue()));

        if(ret < 0)
            return HEC_MEMORY_ERR;
        len += ret;
        node =(KVListNode *)node->getnext();
    }
    
    if( (ret = snprintf(buff+len, maxlen - len, "\r\n")) < 0)
        return HEC_MEMORY_ERR;
    len += ret;

    return len;
}

int http_extend(Buffer* buff)
{
    char * nbuff;

    nbuff = (char *)realloc(buff->getbase(),buff->getmaxlen() * 2);
    if(nbuff){
        buff->setbase(nbuff);
        buff->setmaxlen(buff->getmaxlen() * 2);
        return 0;
    }

    return -1;
}



int http_ctx_cleanup(Parser_ctx * pctx)
{
    Buffer * tofree[] = { pctx->getoriginbuff(),pctx->geturibuff()}; 
    int i;
    
    for(i = 0; i <(int)( sizeof(tofree)/sizeof(tofree[0]));++i){
        if(tofree[i]->getbase())
        {
            free(tofree[i]->getbase()); // need to modify
            tofree[i]->setbase(NULL);
        };
    }
    pctx->getinfo()->setbase(NULL);
    pctx->getinfo()->seturibase(NULL);
    
    delete(pctx);
    return 0;
}

int http_parse_uri(Parser_ctx* ctx)
{
    HeadInfo * pinfo;
    char * new_buff, * orig_uri, * param_begin, * param_end,*temp_buff;
    int len;
    KVListNode * param;

    pinfo = ctx->getinfo();

    orig_uri = pinfo->getbase() + pinfo->geturi()->getoffset();
    len = strlen(orig_uri);
    if( (new_buff = (char *)malloc(len+1)) == NULL)
        return HEC_MALLOC_ERR;
    memcpy(new_buff,orig_uri,len+1);
    ctx->seturibuff(new Buffer(new_buff, 0, len + 1, len + 1));
    
    pinfo->seturibase(new_buff);
    
    pinfo->getpath()->setoffset(0);
    if( (temp_buff = strchr(new_buff, ctx->getspliterpath()) )== NULL)
        return 0;

    *temp_buff = 0;
    param_begin = temp_buff +1;
    while(param_begin){
        KVListNode* tmp = pinfo->getparams();
        param = list_append(&tmp);
        if(param == NULL)
            return HEC_APPNODE_ERR;

        param->getkey()->setoffset(param_begin - new_buff);

        param_end = strchr(param_begin, ctx->getspliterparam());
        if(param_end)
            *param_end = 0;

        temp_buff = strchr(param_begin,ctx->getspliterpkv());
        if(temp_buff == NULL)
            param->getvalue()->setoffset(param->getkey()->getoffset() + strlen(new_buff + param->getkey()->getoffset()));
        else{
            *temp_buff = 0;
            param->getvalue()->setoffset(temp_buff - new_buff + 1);
        }
        if(param_end == NULL){
            param_begin = NULL;
         }else{
            param_begin = param_end +1;
         } 
    }

    return 0;
};

int http_parse(Parser_ctx* ctx)
{
    HeadInfo * info;
    Buffer *  orig_buff;
    char * end, *buff,temp_buff;
    int parser_index,maxlen,tint;
    KVListNode * headers,*header ; 

 loop:
    orig_buff = ctx->getoriginbuff();

    buff = orig_buff->getbase();
    maxlen = orig_buff->getlen();
    parser_index = orig_buff->getoffset();
    info = (HeadInfo*)ctx->getinfo();
    KVListNode* tmp = info->getheaders();
    if(orig_buff->getoffset() >=  orig_buff->getlen())
        goto need_more;
    switch(ctx->getcurstat())
    {
    case S_NONE:
        if(ctx->gettype() == T_REQ){
            ctx->setcurstat(S_REQ_METHOD);
        }else{
            ctx->setcurstat(S_RESP_PROTOCAL);
        }

        info->settype(ctx->gettype());
        info->setbase(orig_buff->getbase());
        goto loop;

    case S_REQ_METHOD:
        
        if(info->getmtodstr()->getoffset() == 0)
            info->getmtodstr()->setoffset(parser_index);
        if((end = read2space(buff + parser_index , maxlen - parser_index ))
               == NULL )
            goto need_more;
        if( (tint = match_str(buff + parser_index, h_mtod_str, sizeof(h_mtod_str)/sizeof(h_mtod_str[0]) -1 )) == -1)
            return HEC_INVALID_METHOD;
        info->setmtod(tint);    
        orig_buff->setoffset(end - buff);
        ctx->setcurstat(S_ITEM_SPACE);
        ctx->setnextstat(S_REQ_URI);
        goto loop;
        
    case S_REQ_URI:
         
        if(info->geturi()->getoffset() == 0)
            info->geturi()->setoffset(parser_index);
        if((end = read2space(buff + parser_index, maxlen - parser_index ))
               == NULL )
            goto need_more;
        orig_buff->setoffset(end - buff);
        ctx->setlaststat(S_REQ_URI);
        ctx->setcurstat(S_ITEM_SPACE);
        ctx->setnextstat(S_REQ_PROTOCAL);
        goto loop;
    
    case S_REQ_PROTOCAL:
        if(ctx->gettype() ==T_REQ && info->getprotstr()->getoffset() == 0)
            info->getprotstr()->setoffset(parser_index);
        if((end = read2nl(buff + parser_index , maxlen - parser_index ))
               == NULL )
            goto need_more;
        if( tint = get_http_prot(buff + parser_index,end - buff - parser_index) == -1)
            return HEC_INVALID_PROT;
        info->setprot(tint);
        orig_buff->setoffset(end - buff);
                
        ctx->setcurstat(S_NEW_LINE);
        ctx->setnextstat(S_HEADER_KEY);
        
        goto loop;

    case S_RESP_PROTOCAL: 
        //if(info->prot_str.offset == 0)
          //  info->prot_str.offset = parser_index;
        if((end = read2space(buff + parser_index , maxlen - parser_index ))
               == NULL )
            goto need_more;
        if( tint = get_http_prot(buff + parser_index,end - buff - parser_index) == -1)
            return HEC_INVALID_PROT;
        info->setprot(tint);

        orig_buff->setoffset(end - buff);
        
        ctx->setcurstat(S_ITEM_SPACE);
        ctx->setnextstat(S_RESP_CODE);
        
        goto loop;

    case S_RESP_CODE:
         if(ctx->gettempbuff()->getoffset() == 0)
             ctx->gettempbuff()->setoffset(parser_index);
        if((end = read2space(buff +parser_index , maxlen - parser_index ))
               == NULL )
            goto need_more;
        
        if( ((tint = atoi(buff+ parser_index)) < 0))
            return HEC_INVALID_CODE;
        info->setresponsecode(tint);   

        orig_buff->setoffset(end - buff);
        ctx->setcurstat(S_ITEM_SPACE);
        ctx->setnextstat(S_RESP_STR);
        goto loop;
        
    case S_RESP_STR:
         if(info->getcodestr()->getoffset() == 0)
            info->getcodestr()->setoffset(parser_index);
        if((end = read2nl(buff + parser_index , maxlen - parser_index ))
               == NULL )
            goto need_more;
        
        orig_buff->setoffset(end - buff);
        
        ctx->setcurstat(S_NEW_LINE);
        ctx->setnextstat(S_HEADER_KEY);
        goto loop;
 
    case S_HEADER_KEY:
        if(info->getheaderkey()->getoffset() == 0)
            info->getheaderkey()->setoffset(parser_index);
        if( (end = read2str(buff+parser_index, maxlen - parser_index,HTTP_HEADER_SEP_STR)) == NULL)
            goto need_more;
        
        orig_buff->setoffset(end - buff);
        ctx->setcurstat(S_HEADER_SEP);
        goto loop;

    case S_HEADER_VALUE:
        if(info->getheadervalue()->getoffset() == 0 )
            info->getheadervalue()->setoffset(parser_index);
        if((end = read2nl(buff + parser_index , maxlen - parser_index ))
               == NULL )
            goto need_more;
        header = list_append(&tmp); 
        if(header == NULL)
            return HEC_APPNODE_ERR;
       
        header->setkey(info->getheaderkey());
        header->setvalue(info->getheadervalue());
        
        info->getheaderkey()->setoffset(0);
        info->getheadervalue()->setoffset(0);

        orig_buff->setoffset(end - buff);
        ctx->setcurstat(S_NEW_LINE);
        ctx->setnextstat(S_HEADER_KEY);
        
        goto loop;

    case S_HEADER_SEP:
        orig_buff->getbase()[ orig_buff->getoffset()] = 0;
        orig_buff->setoffset(orig_buff->getoffset() + strlen(HTTP_HEADER_SEP_STR));
        ctx->setcurstat(S_HEADER_VALUE);
        goto loop;

    case S_BODY:
        break;
    case S_ITEM_SPACE:
        orig_buff->getbase()[orig_buff->getoffset()] = 0;
        orig_buff->setoffset(orig_buff->getoffset() + 1);

        if(ctx->getlaststat() == S_REQ_URI)
            if(http_parse_uri(ctx))
                return HEC_PARSE_URI_ERR;
        ctx->setlaststat(S_NONE);

        ctx->setcurstat(ctx->getnextstat());
        goto loop;

    case S_NEW_LINE:
        if(maxlen - orig_buff->getoffset() <(int)(2 * strlen(HTTP_NEW_LINE_STR)) )
            goto need_more;
        
        orig_buff->getbase()[orig_buff->getoffset()] = 0;
        orig_buff->setoffset(orig_buff->getoffset() + 2);
        
        if( strncmp(orig_buff->getbase() + orig_buff->getoffset()
            , HTTP_NEW_LINE_STR, strlen(HTTP_NEW_LINE_STR )) == 0 )
        {
            orig_buff->setoffset(orig_buff->getoffset() + 2);
            return HEC_OK;
        }

        ctx->setcurstat(ctx->getnextstat());
        goto loop;
    default: 
        ;
    }

    return 0;    

need_more:
    if(orig_buff->getlen() == orig_buff->getmaxlen())
    {
	    if(http_extend(ctx->getoriginbuff()))
		    return HEC_EXTEND_ERR;
        info->setbase(orig_buff->getbase());
    }
    return HEC_NEED_MORE;
};

int Parser_ctx::http_set_headers(char ** headers, int contlen)
{
    char lenbuff[32];
    int ret,head_len;
    char ** ptemp_buff;
    KVListNode* head = (*this)._info->getheaders();
    if(contlen > 0){
        ret = snprintf(lenbuff,32,"%d",contlen);
        if(ret <= 0 )
            return HEC_MEMORY_ERR; 
       
        if(ret = Parser_ctx::http_set_prop3(&head, "Content-Length", lenbuff, true)){
            return ret; 
        }
    }

    ptemp_buff = headers;
    while( *ptemp_buff)
    {
        head = (*this)._info->getheaders();
        if(ret = Parser_ctx::http_set_prop3(&head, *ptemp_buff, *(ptemp_buff + 1), true)){
            return ret;
        }
        ptemp_buff += 2;
    }

    return 0;
}
