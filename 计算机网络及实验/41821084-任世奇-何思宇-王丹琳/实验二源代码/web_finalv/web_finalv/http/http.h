#ifndef LX_HTTP_H
#define LX_HTTP_H
/*
request-line
headers
<blank line>
body

request-line
    method uri protocal
*/
#include <stdint.h>
#include <stdlib.h>
#include <errno.h>
#include <stdio.h>
#include "../lib/buffer.h"
#include "../lib/hsy_string.h"
#include "http_error.h"
#include "../lib/list.h"
#include <sys/time.h>

#define findarr_by_key(array, key) ((array)[key] )

extern int findarr_by_value( char ** array,char * value);

typedef enum h_method_t
{
    M_GET = 0,
    M_POST,
    M_HEAD
}h_method_t;
extern char *h_mtod_str[] ;

typedef enum h_protocal_t
{
    P_HTTP_0_X = 0,
    P_HTTP_1_0,
    P_HTTP_1_1
}h_protocal_t;
extern char * h_prot_str[] ;

extern int get_http_prot(char * buff,int len);


#define HTTP_HEADER_SEP_STR ": "
#define HTTP_NEW_LINE_STR "\r\n"

typedef enum h_resp_code_t 
{
    RESP_OK = 200,
    RESP_REDIRECT = 300,
    RESP_CLIENT_ERR = 400,
    RESP_SERVER_ERR = 500
}h_resp_code_t;
extern char * http_resp_str[];

typedef enum h_type_t 
{
    T_REQ = 0,
    T_RESP
}h_type_t;

typedef enum h_stage_t
{
    STAGE_START,
    STAGE_LISTENING,
    STAGE_REQ_HEAD,
    STAGE_REQ_BODY,
    STAGE_RESP_HEAD,
    STAGE_RESP_BODY,
    STAGE_DONE
}h_stage_t;

extern char * http_stage_str[];

typedef enum h_stat_t
{
    S_NONE = 0,

    S_REQ_METHOD,
    S_REQ_URI,
    S_REQ_PROTOCAL,
    
    S_RESP_PROTOCAL,
    S_RESP_CODE,
    S_RESP_STR,
    
    S_HEADER_KEY,
    S_HEADER_VALUE,

    S_BODY,

    S_HEADER_SEP,
    S_ITEM_SPACE,
    S_NEW_LINE
}h_stat_t;

/*
header :two type,all '\0' end
type 1(after parser):lx_ebase_offset
	buff = info->base + Buffer.offset
type 2(after modify) lx_base
	buff = Buffer.base
*/
class HeadInfo
{
public:
    HeadInfo() 
    {

        (*this).mtod_str = new Buffer();
        (*this).uri = new Buffer();
        (*this).path = new Buffer();
        (*this).params = new KVListNode();

        (*this).prot_str = new Buffer();
        (*this).code_str = new Buffer();

        (*this).header_key = new Buffer();
        (*this).header_value  = new Buffer();
        (*this).headers  = new KVListNode();
    };
    KVListNode* http_find_node(char* key, KVListNode* head_node, bool is_header)
    {
        KVListNode* node;
        char* base;

        if (is_header)
            base = (*this)._base;
        else
            base = (*this).uri_base;

        if ((node = kvlist_find(head_node,key, NULL, lx_base)) == NULL)
            node = kvlist_find(head_node, key, base, lx_ebase_offset);

        return node;
    }
    
    char* getbase()
    {
        return (*this)._base;
    }
    char* geturibase()
    {
        return (*this).uri_base;
    }

    KVListNode* getheaders()
    {
        return (*this).headers;
    }
    Buffer* geturi()
    {
        return (*this).uri;
    }
   
    Buffer* getpath()
    {
        return (*this).path;
    }
    Buffer* getprotstr()
    {
        return (*this).prot_str;
    }
    int& getprot()
    {
        return (*this).prot;
    }
    Buffer* getcodestr()
    {
        return (*this).code_str;
    }
    Buffer* getheaderkey()
    {
        return (*this).header_key;
    }
    Buffer* getheadervalue()
    {
        return (*this).header_value;
    }
    KVListNode* getparams()
    {
        return (*this).params;
    }
    Buffer* getmtodstr()
    {
        return (*this).mtod_str;
    }
    int& gettype()
    {
        return (*this)._type;
    }
    int& getmtod()
    {
        return (*this).mtod;
    }
    int& getresponsecode()
    {
        return (*this).response_code;
    }
    void settype(int type)
    {
        (*this)._type = type;
    }
    void setbase(char* base)
    {
        (*this)._base = base;
    }
    void setmtod(int mtod)
    {
        (*this).mtod = mtod;
    }
    void setprot(int prot)
    {
        (*this).prot = prot;
    }
    void setresponsecode(int response_code)
    {
        (*this).response_code = response_code;
    }
    void seturibase(char* uri)
    {
        (*this).uri_base = uri;
    }
    ~HeadInfo()
    {
        delete(mtod_str);
        delete(path);
        delete(params);
        delete(prot_str);
        delete(code_str);
        delete(header_key);
        delete(header_value);
        delete(headers);
    }
private:
    int _type;
    char* _base;

    Buffer* mtod_str;
    int mtod;

    Buffer* uri;

    char* uri_base;
    Buffer* path;
    KVListNode* params;

    Buffer* prot_str;
    int prot;

    int response_code;
    Buffer* code_str;

    Buffer* header_key;
    Buffer* header_value;
    KVListNode* headers;
};

class Parser_ctx
{
public:
    Parser_ctx(int type, int buffer_size):_type(type)
    {
        (*this).buff = (char*)malloc(buffer_size);
        (*this)._last_stat = S_NONE;
        (*this)._cur_stat = S_NONE;
        (*this)._next_stat = S_NONE;
        (*this)._orig_buff = new Buffer(buff, 0, 0, buffer_size);
        (*this)._uri_buff = new Buffer();
        (*this)._temp_buff = new Buffer();
        (*this)._info = new HeadInfo();
        (*this)._spliter_path = '?';
        (*this)._spliter_param = '&';
        (*this)._spliter_pkv = '=';
    }
    int http_print_http();
    int http_set_prop1(int intval, char** strarr, void* key, Buffer* str);
    
    int http_set_prop2(Buffer* buffer, char* nval);

    int http_set_prop3(KVListNode** phead, char* key, char* value, bool is_header);
   
    int http_set_headers(char** headers, int contlen);

    void setcurstat(h_stat_t cur_stat)
    {
        (*this)._cur_stat = cur_stat;
    }
    void setnextstat(h_stat_t next_stat)
    {
        (*this)._next_stat = next_stat;
    }
    void setlaststat(h_stat_t last_stat)
    {
        (*this)._last_stat = last_stat;
    }
    void seturibuff(Buffer* uribuff)
    {
        (*this)._uri_buff = uribuff;
    }
    Buffer* getoriginbuff()
    {
        return (*this)._orig_buff;
    }
    Buffer* geturibuff()
    {
        return (*this)._uri_buff;
    }
    HeadInfo* getinfo()
    {
        return (*this)._info;
    }
    h_stat_t& getcurstat()
    {
        return (*this)._cur_stat;
    }
    Buffer* gettempbuff()
    {
        return (*this)._temp_buff;
    }
    h_stat_t& getnextstat()
    {
        return (*this)._next_stat;
    }
    int& gettype()
    {
        return (*this)._type;
    }
    h_stat_t& getlaststat()
    {
        return (*this)._last_stat;
    }
    char getspliterpath()
    {
        return (*this)._spliter_path;
    }
    char getspliterparam()
    {
        return (*this)._spliter_param;
    }
    char getspliterpkv()
    {
        return (*this)._spliter_pkv;
    }
    ~Parser_ctx()
    {
        free(buff);
        delete(_orig_buff);
        delete(_uri_buff);
        delete(_temp_buff);
        delete(_info);
    }
   
private:
    HeadInfo* _info;
    char* buff;
    int _type;

    h_stat_t _last_stat;
    h_stat_t _cur_stat;
    h_stat_t _next_stat;

    Buffer* _orig_buff;
    Buffer* _uri_buff;
    Buffer* _temp_buff;

    char _spliter_path;
    char _spliter_param;
    char _spliter_pkv;
    int findarr_by_value(char** array, char* value)
    {
        int i = 0;
        while (*array)
        {
            if (strncmp(*array, value, strlen(*array)) == 0)
                return i;
            ++i;
        }
        return -1;
    }
};
#define http_get_respstr(code) find_by_int(http_resp_str,(code))


#define http_get_mtod(pinfo) ((pinfo)->getmtodstr()->getbase() ?(pinfo)->getmtodstr()->getbase() :(pinfo)->getbase() +(pinfo)->getmtodstr()->getoffset())  
#define http_set_mtod(mtodval) \
    Parser_ctx::http_set_prop1(mtodval, h_mtod_str, (*this)._info->getmtod(), (*this)._info->getmtodstr()) 

#define http_get_uri(pinfo) ((pinfo)->geturi()->getbase() ? (pinfo)->geturi()->getbase():(pinfo)->getbase() +(pinfo)->geturi()->getoffset())  
#define http_set_uri(nval) Parser_ctx::http_set_prop2((*this)._info->geturi(), nval)

#define http_get_path(pinfo) ((pinfo)->getpath()->getbase() ?(pinfo)->getpath()->getbase():(pinfo)->geturibase() + (pinfo)->getpath()->getoffset())  

#define http_param_begin(pinfo,pnode) ( (pnode) = (pinfo)->getparams() )
#define http_param_next(pinfo,pnode) ( (pnode) = ((pnode)->getnext()))
#define http_get_param(info, key) (http_find_node_value( (info),(key),(info)->getparams(), false));    
#define http_get_parambuff(pinfo, pbuff) \
    ((pbuff)->getbase() == NULL ? ( (pinfo)->geturibase() +(pbuff)->getoffset() ):( (pbuff)->getbase() ))

#define http_get_prot(pinfo) ((pinfo)->getprotstr()->getbase() ?(pinfo)->getprotstr()->getbase() :(pinfo)->getbase() +(pinfo)->getprotstr()->getoffset())  
#define http_set_prot(protv) \
   Parser_ctx::http_set_prop1(protv, h_prot_str, (*this)._info->getprot(),(*this)._info->getprotstr()) 

#define http_get_code(pinfo) ( (pinfo)->getresponsecode())
#define http_get_codestr(pinfo) ((pinfo)->getcodestr()->getbase() ?(pinfo)->getcodestr()->getbase():(pinfo)->getbase() +(pinfo)->getcodestr()->getoffset())  
extern int http_set_rcode(Parser_ctx * pctx,int code, char * code_str);

#define http_get_header(info,key)  (http_find_node_value( (info),(key),(info)->getheaders(),true)) 
#define http_set_header(key,value)   \
    Parser_ctx::http_set_prop3((*this)._info->getheaders(), key, value, true)
#define http_header_begin(pinfo,pnode) ( (pnode) = (pinfo)->getheaders() )
#define http_header_next(pinfo,pnode) ( (pnode) =(KVListNode *) (pnode)->getnext() )
#define http_get_buffval(pinfo,pbuff) \
    ((pbuff)->getbase() == NULL ? (pinfo->getbase() + pbuff->getoffset()):(pbuff->getbase()))

extern int http_get_contlen(HeadInfo *info);

//extern KVListNode *http_find_node(HeadInfo * info,char * key,KVListNode * head_node,bool is_header);
extern char * http_find_node_value(HeadInfo *info,char * key,KVListNode * head_node,bool is_header);

extern int http_seri_head(HeadInfo *pinfo,int type, char * buff, int maxlen);
#define http_set_uri_sep(pctx,s_path,s_param,s_pkv) \
    (pctx)->spliter_path= s_path;\
    (pctx)->spliter_param = s_param;\
    (pctx)->spliter_pkv = s_pkv;
#define http_set_memory_msuit(pctx,pmalloc,pfree,pextend) \
    (pctx)->hmalloc = (pmalloc);\
    (pctx)->hfree = (pfree);\
    (pctx)->hextend = (pextend);

extern int http_extend(Buffer * buff);

extern int http_ctx_cleanup(Parser_ctx * pctx);

extern int http_parse(Parser_ctx* ctx);
extern int http_parse_uri(Parser_ctx* ctx);
#endif
