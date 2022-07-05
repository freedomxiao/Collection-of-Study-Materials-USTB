#ifndef LX_CONN_CTX_H
#define LX_CONN_CTX_H
#include <unistd.h>
#include <pthread.h>
#include <sys/time.h>
#include <sys/epoll.h>
#include <stdint.h>
#include "../lib/socket.h"
#include "async_server.h"
#include "../log/log.h"
#include "../http/http.h"
#include "epoll.h"
#include "../rbtree/rbtree.h"
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>

#define MAX_HEADER_LEN  (2048)
#define MAX_PATH_LEN (1024)

class Async_conn_ctx
{
public:
    Async_conn_ctx() :_ep_fd(0), _fd(0), _events(0), buff(nullptr), _peer_addr(nullptr), _timeout(0), _accept_time({0}), _timer(NULL), _stage(0), _request_ctx(NULL), _response_ctx(NULL),
        _path(""),_fh(nullptr),_contlen(0),_inoutlen(0),_arg(nullptr),handle(nullptr)
    {
    };
    Async_conn_ctx(int ep_fd, int fd, rbtree::RbTree_t* timer, int (*handle)(Async_conn_ctx* ctx)) :_ep_fd(ep_fd), _fd(fd), _timer(timer)
    {
        (*this)._request_ctx = new Parser_ctx(T_REQ, 256);
        (*this)._response_ctx = new Parser_ctx(T_RESP, 2);
        (*this).buff = (char*)malloc(MAX_HEADER_LEN);
        (*this)._data_buff = new Buffer(buff, 0, 0, MAX_HEADER_LEN);
        (*this)._stage = STAGE_START;
        gettimeofday(&((*this)._accept_time), NULL);
        (*this).handle = handle;
	(*this)._events = 1;
    }
    Async_conn_ctx(int ep_fd, int fd, rbtree::RbTree_t* timer, struct sockaddr_in peer_addr, int (*handle)(Async_conn_ctx* ctx)) :_ep_fd(ep_fd), _fd(fd), _timer(timer)
    {
        (*this)._peer_addr = &peer_addr;
        (*this)._request_ctx = new Parser_ctx(T_REQ, 256);
        (*this)._response_ctx = new Parser_ctx(T_RESP, 2);
        (*this).buff = (char*)malloc(MAX_HEADER_LEN);
        (*this)._data_buff = new Buffer(buff, 0, 0, MAX_HEADER_LEN);
        (*this)._stage = STAGE_START;
        (*this)._events = 1;
        gettimeofday(&((*this)._accept_time), NULL);
        (*this).handle = handle;

    }
    //int listen_handle();
    //int conn_handle();
    
    unsigned int& getevents()
    {
        return (*this)._events;
    }
    int& getfd()
    {
        return (*this)._fd;
    }
    rbtree::RbTree_t* gettimer()
    {
        return (*this)._timer;
    }
    int& getepfd()
    {
        return (*this)._ep_fd;
    }
    void settimeout(uint64_t timeout)
    {
        (*this)._timeout = timeout;
    }
    void setstage(int stage)
    {
        (*this)._stage = stage;
    }
    void setevents(unsigned int events)
    {
        (*this)._events = events;
    }
    struct sockaddr_in* getpeeraddr()
    {
        return (*this)._peer_addr;
    }
    Parser_ctx* getrequest()
    {
        return (*this)._request_ctx;
    }
    struct timeval& getaccepttime()
    {
        return (*this)._accept_time;
    }
    Buffer* getdatabuff()
    {
        return (*this)._data_buff;
    }
    uint64_t& gettimeout()
    {
        return (*this)._timeout;
    }
    Parser_ctx* getresponse()
    {
        return (*this)._response_ctx;
    }
    FILE* getfh()
    {
        return (*this)._fh;
    }
    char* getpath()
    {
        return (*this)._path;
    }
    int& getcontlen()
    {
        return (*this)._contlen;
    }
    int& getinoutlen()
    {
        return (*this)._inoutlen;
    }
    int& getstage()
    {
        return (*this)._stage;
    }
    void setcontlen(int contlen)
    {
        (*this)._contlen = contlen;
    }
    void setinoutlen(int inoutlen)
    {
        (*this)._inoutlen = inoutlen;
    }
    void setfd(int fd)
    {
        (*this)._fd = fd;
    }
    void setfh(FILE* fh)
    {
       (*this)._fh = fh;
    }
    ~Async_conn_ctx()
    {
        delete((*this)._data_buff);
        free((*this).buff);
        delete((*this)._response_ctx);
        delete((*this)._request_ctx);
    }
    int (*handle)(Async_conn_ctx*);
private:
    int _ep_fd;
    int _fd;
    unsigned int _events;
    char* buff;
    struct sockaddr_in* _peer_addr;
    struct timeval _accept_time;
    uint64_t _timeout;//timeout time for timer
    rbtree::RbTree_t* _timer;

    int _stage;
    //int (*handle)(lxasync_conn_ctx* arg);

    Parser_ctx* _request_ctx;
    Parser_ctx* _response_ctx;
    Buffer* _data_buff;
    char _path[MAX_PATH_LEN];
    FILE* _fh;
    int _contlen;
    int _inoutlen;

    void* _arg;
    //int (*cleanup)(lxasync_conn_ctx* arg);

};


#endif
