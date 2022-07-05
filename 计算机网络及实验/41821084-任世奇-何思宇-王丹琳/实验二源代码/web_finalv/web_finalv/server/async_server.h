#ifndef LX_ASYNC_SERVER_H
#define LX_ASYNC_SERVER_H
#include <pthread.h>
#include <sys/epoll.h>
#include <malloc.h>
#include <stdlib.h>
#include <stdio.h>
#include "../lib/socket.h"
#include "../log/log.h"

#include "../http/http.h"
#include "../rbtree/rbtree.h"

class Async_server_ctx
{
public:
    Async_server_ctx() :_conn_timeout(0), _epoll_timeout(0), _epoll_maxevents(1), _is_nostub(false), _thread_num(1),  _log(nullptr)
    {
        (*this).asarg.expiretime = 0;
        (*this).asarg.newhour = 0;
        pthread_mutex_init(&((*this)._mutex), NULL);
    };
    Async_server_ctx(long conn_timeout, int epoll_timeout, int epoll_maxevents, bool is_nostub) :_conn_timeout(conn_timeout), _epoll_timeout(epoll_timeout), _epoll_maxevents(epoll_maxevents), _is_nostub(is_nostub)
    {
        (*this)._log = nullptr;
        pthread_mutex_init(&((*this)._mutex), NULL);
        (*this).asarg.newhour = 18;
        (*this).asarg.expiretime = 10;
        //(*this)._log->setdailyarg((*this).asarg);
        //(*this)._log->setarg(&(*this).asarg);
    }
    void setlog(log::Log* log)
    {
        (*this)._log = log;
    }
    void setthreadnum(int thread_num)
    {
        (*this)._thread_num = thread_num;
    }
    int& getthreadnum()
    {
        return (*this)._thread_num;
    }
    int& getmaxevent()
    {
        return (*this)._epoll_maxevents;
    }
    log::Log* getlog()
    {
        return (*this)._log;
    }
    pthread_mutex_t& getmutex()
    {
        return (*this)._mutex;
    }
    int& gettimeout()
    {
        return (*this)._epoll_timeout;
    }
    long& getconntimeout()
    {
        return (*this)._conn_timeout;
    }
    struct log::Log_dailyas& getasarg()
    {
        return (*this).asarg;
    }
    ~Async_server_ctx()
    {
        pthread_mutex_destroy(&((*this)._mutex));
        //free((*this).buffer);
        if((*this)._log)
            delete((*this)._log);
    }
private:
    long _conn_timeout;

    int _epoll_timeout;
    int _epoll_maxevents;

    bool _is_nostub;

    int _thread_num;

    pthread_mutex_t _mutex;

    log::Log* _log;
    struct log::Log_dailyas asarg;

};

extern Async_server_ctx* global_ctx;

typedef struct async_thread_ctx
{
    rbtree::RbTree_t timer;    
}async_thread_ctx;


typedef enum lxasync_handle_stat
{
    HANDLE_DONE = 0,
    HANDLE_NEED_MORE,
    HANDLE_ERR 
}lxasync_handle_stat;

static char * g_home = "home";
static char * g_whome = "webhome";
static char * g_loghome = "logs";

int init_async_server(bool is_nostub, const char * home,int thread_num);

int start_async_server(int port);

int cleanup_async_server();

#endif
