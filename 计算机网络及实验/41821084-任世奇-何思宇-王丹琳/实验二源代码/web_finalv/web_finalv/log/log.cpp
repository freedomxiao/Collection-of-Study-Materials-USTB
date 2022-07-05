#include <string.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <sys/fcntl.h>
#include <unistd.h>
#include <pthread.h>
#include <unistd.h>
#include <assert.h>
#include "log.h"
#include "../lib/hsy_path.h"
#include "../lib/fileio.h"
#include "../lib/hsy_time.h"
#include "../lib/hsy_flock.h"

#define FILE_MODE (S_IRUSR|S_IWUSR|S_IRGRP|S_IWGRP)

namespace log
{
    std::string log_level_str[] = { "fatal","error","warn","info","debug" };
    void Log::hdnoplace(char* buff)
    {
        writen(STDERR_FILENO, buff, strlen(buff));
    }

    void Log::log_quit_onerr(int errflag, char* fmt, ...)
    {
        assert(fmt);

        char buff[LX_LOG_MAXLEN];
        char errbuff[LX_LOG_MAXLEN];
        int errlen = 0;

        errlen += getwidetime(time(NULL), buff + errlen, LX_LOG_MAXLEN - errlen);
        errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, " ");

        va_list ap;
        va_start(ap, fmt);
        errlen += vsnprintf(buff + errlen, LX_LOG_MAXLEN - errlen, fmt, ap);
        va_end(ap);

        if(errflag)
        {
            strerror_r(errno, errbuff, LX_LOG_MAXLEN);
            errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, "( %d:%s)", errno, errbuff);
        }
        errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, "\n");

        hdnoplace(buff);
        if(errflag)
        {
            abort();
        }
    }

    int Log::openlog()
    {
        int lasti;
        char c;
        lasti = strlen((*this)._dir) - 1;
        c = (*this)._dir[lasti];
        if (c == '/' || c == '\\')
            (*this)._dir[lasti] = 0;
        snprintf((*this)._fpath, LX_LOG_FILE_LENGTH, "%s/%s", (*this)._dir, (*this)._fname);

        (*this)._fh = fopen((*this)._fpath, "a");
        if ((*this)._fh == NULL)
        {
            (*this).log_quit_onerr(LX_LOG_ERR, "open log file [%s] failed.", (*this)._fpath);
        }
        return 0;
    }

    int Log::reopen(const char* _dir, const char* _fname)
    {
        if (fclose((*this)._fh))
        {
            (*this).log_quit_onerr(1, "close file [%s] failed", (*this)._fpath);
        }

        snprintf((*this)._dir, LX_LOG_DIR_LENGTH, "%s", _dir);
        snprintf((*this)._fname, LX_LOG_FILE_LENGTH, "%s", _fname);
        Log::openlog();

        return 0;
    }

    int Log::init(const char* _dir, const char* _fname, int loglevel)
    {
        int ret;
        int c, lasti;

        (*this)._loglevel = loglevel;
        (*this)._flushnow = 1;
        (*this)._showpid = 1;
        (*this)._showtid = 1;

        (*this)._tlockflag = 1;
        (*this)._plockflag = 1;

        snprintf((*this)._dir, LX_LOG_DIR_LENGTH, "%s", _dir);
        snprintf((*this)._fname, LX_LOG_FILE_LENGTH, "%s", _fname);

        if (ret = (*this).plockinit())
            (*this).log_quit_onerr(LX_LOG_ERR, "plock init error");

        if (ret = pthread_mutex_init(&((*this)._tmutex), NULL))
        {
            (*this).log_quit_onerr(LX_LOG_ERR, "pthread_init_mutex error");
        }

        
        ret = daily_asinit();
        if (ret)
            (*this).log_quit_onerr(LX_LOG_ERR, "(*this).asinit error");
       

        Log::openlog();

        return 0;
    }

    int Log::cleanup()
    {
        int ret;

        if ((*this).daily_ascleanup())
            (*this).log_quit_onerr(LX_LOG_ERR, "(*this).ascleanup error");
        

        if (ret = pthread_mutex_destroy(&((*this)._tmutex)))
            (*this).log_quit_onerr(LX_LOG_ERR, "pthread_mutex_destroy error");

       
        if (ret = (*this).plockcleanup())
            (*this).log_quit_onerr(LX_LOG_ERR, "plockcleanup error");

        if (ret = (*this).plockcleanup())
            (*this).log_quit_onerr(LX_LOG_ERR, "plockcleanup error");

        if (fclose((*this)._fh))
            (*this).log_quit_onerr(LX_LOG_ERR, "close file [%s,%s] failed", (*this)._fpath);

        (*this)._fh = NULL;
        return 0;
    }

    static inline int append_timefix(char* buff, size_t size)
    {
        char subfix[64];
        getnarrowtime(time(NULL), subfix + 1, 64 - 1);
        *subfix = '.';
        strncat(buff, subfix, size);
        return 0;
    }

    int Log::daily_asinit()
    {
        Log_dailyas* arg = (Log_dailyas*)(*this)._arg;
        arg->expiretime = getnexthour(time(NULL), arg->newhour);
        if (arg->expiretime <= 0)
            (*this).log_quit_onerr(LX_LOG_ERR, "getnexthour() error");

        return append_timefix((*this)._fname, LX_LOG_FILE_LENGTH);
    }

    int Log::daily_autosplit(char* log)
    {
        int ret;

        char _dir[LX_LOG_DIR_LENGTH];
        char _fname[LX_LOG_FILE_LENGTH];
        char* dot;

        Log_dailyas* arg = (Log_dailyas*)(*this)._arg;

        if (difftime(time(NULL), arg->expiretime) < 0)
            return 0;

        arg->expiretime = getnexthour(time(NULL), arg->newhour);

        snprintf(_dir, LX_LOG_DIR_LENGTH, (*this)._dir);
        snprintf(_fname, LX_LOG_FILE_LENGTH, (*this)._fname);
        dot = strrchr(_fname, '.');
        if (dot)
            *dot = 0;
        append_timefix(_fname, LX_LOG_FILE_LENGTH);

        ret = (*this).reopen(_dir, _fname);
        if (ret)
            (*this).log_quit_onerr(LX_LOG_ERR, "(*this).reopen error");
        return 0;
    }

    int Log::daily_ascleanup()
    {
        return 0;
    }

    char* Log::tostring()
    {
        static char buff[1024];
        snprintf(buff, 1024, "%s,%s,loglevel:%d,flushnow:%d,thread lock:%d,process lock:%d\n",
            (*this)._dir, (*this)._fname, (*this)._loglevel, (*this)._flushnow, (*this)._tlockflag, (*this)._plockflag);
        return buff;
    }

    int Log::plockinit()
    {
        int ret;
        char path[LX_LOG_FILE_LENGTH];

        snprintf(path, LX_LOG_FILE_LENGTH, "%s/%s", (*this)._dir, log_lockfile);
        if ((ret = open(path, O_CREAT | O_RDWR, FILE_MODE)) == -1) {
            (*this).log_quit_onerr(LX_LOG_ERR, "open lock file(%s) error", path);
        }

        (*this)._lockfd = ret;
        return 0;
    }

    int Log::plock()
    {
        while (lx_lwritew((*this)._lockfd, SEEK_SET, 0, 0))
        {
            (*this).log_quit_onerr(LX_LOG_NOERR, "get lock error(%d:%s)", errno, strerror(errno));
        }
        return 0;
    }

    int Log::punlock()
    {
        while (lx_lunlock((*this)._lockfd, SEEK_SET, 0, 0))
            (*this).log_quit_onerr(LX_LOG_NOERR, "unlock error(%d:%s)", errno, strerror(errno));
        return 0;
    }

    int Log::plockcleanup() { return 0; };

    int Log::lock()
    {
        int ret = pthread_mutex_lock(&((*this)._tmutex));
        if (ret) 
        {
            errno = ret;
            (*this).log_quit_onerr(LX_LOG_ERR, "pthread_mutex_lock error");
        }
        return 0;
    }

    int Log::unlock()
    {
        int ret = pthread_mutex_unlock(&((*this)._tmutex));
        if (ret)
        {
            errno = ret;
            (*this).log_quit_onerr(LX_LOG_ERR, "pthread_mutex_unlock error");
        }
        return 0;
    }

    int Log::logcore(int errflag, int loglevel, char* fmt, va_list ap)
    {
        assert(fmt);

        char buff[LX_LOG_MAXLEN];
        char errbuff[LX_LOG_MAXLEN];
        int errlen = 0, ret;

        if (loglevel > (*this)._loglevel)
            return 0;

        errlen += getwidetime(time(NULL), buff, LX_LOG_MAXLEN);
        errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, " [%-5s] ", log_level_str[loglevel]);

        if ((*this)._showpid)
            errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, " %ld ", (long)getpid());

        if ((*this)._showtid)
            errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, " %ld ", (long)pthread_self());

        errlen += vsnprintf(buff + errlen, LX_LOG_MAXLEN - errlen, fmt, ap);

        if (errflag)
        {
            strerror_r(errno, errbuff, LX_LOG_MAXLEN);
            errlen += snprintf(buff + errlen, LX_LOG_MAXLEN - errlen, "( %d:%s)", errno, errbuff);
        }
        strncat(buff + errlen, "\n", LX_LOG_MAXLEN - errlen);

        if ((*this)._plockflag)
            (*this).plock();

        if ((*this)._tlockflag)
            (*this).lock();

        
        if (daily_autosplit(buff))
            (*this).log_quit_onerr(LX_LOG_ERR, "(*this).autosplit error");
        

        ret = fwriten((*this)._fh, buff, strlen(buff));
        if (ret < (int)strlen(buff))
        {
            (*this).log_quit_onerr(LX_LOG_ERR, "write to log [%s,%s] error", (*this)._dir, (*this)._fname);
        }
        if ((*this)._flushnow)
            fflush((*this)._fh);

        if ((*this)._tlockflag)
            (*this).unlock();

        if ((*this)._plockflag)
            (*this).punlock();

        return 0;
    }

    int Log::logfatal(char* fmt, ...)
    {
        va_list ap;
        va_start(ap, fmt);
        int ret = (*this).logcore(LX_LOG_ERR, LX_LOG_FATAL, fmt, ap);
        va_end(ap);
        return ret;
    }
    int Log::logerror(char* fmt, ...)
    {
        va_list ap;
        va_start(ap, fmt);
        int ret = (*this).logcore(LX_LOG_ERR, LX_LOG_ERROR, fmt, ap);
        va_end(ap);
        return ret;
    }
    int Log::logwarn(char* fmt, ...)
    {
        va_list ap;
        va_start(ap, fmt);
        int ret = (*this).logcore(LX_LOG_NOERR, LX_LOG_WARN, fmt, ap);
        va_end(ap);
        return ret;
    }
    int Log::loginfo(char* fmt, ...)
    {
        va_list ap;
        va_start(ap, fmt);
        int ret = (*this).logcore(LX_LOG_NOERR, LX_LOG_INFO, fmt, ap);
        va_end(ap);
        return ret;
    }
    int Log::logdebug(char* fmt, ...)
    {
        va_list ap;
        va_start(ap, fmt);
        int ret = (*this).logcore(LX_LOG_NOERR, LX_LOG_DEBUG, fmt, ap);
        va_end(ap);
        return ret;
    }
}

