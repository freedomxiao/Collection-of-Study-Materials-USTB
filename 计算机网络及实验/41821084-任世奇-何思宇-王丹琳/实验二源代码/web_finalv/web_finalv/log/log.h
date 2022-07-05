#ifndef Log_H 
#define Log_H 
#include <stdio.h>
#include <stdarg.h>
#include <stdlib.h>
#include <pthread.h>
#include <string.h>
#include <string>

/*log level*/ 
#define LX_LOG_OFF      -1 
#define LX_LOG_FATAL    0
#define LX_LOG_ERROR    1
#define LX_LOG_WARN     2 
#define LX_LOG_INFO     3 
#define LX_LOG_DEBUG    4 

#define LX_LOG_ERR 1
#define LX_LOG_NOERR 0

#define LX_LOG_DIR_LENGTH 1024
#define LX_LOG_FILE_LENGTH 1024
#define LX_LOG_MAXLEN 1024

//#define Log_TLOCK_D
//#define Log_PLOCK_D

/*log prefix*/ 
namespace log {


    extern std::string log_level_str[];

    struct Log_dailyas
    {
        int newhour;//0~23,hour to reopen new log file, -1 to off 
        time_t expiretime;
    };
    typedef struct Log_dailyas Log_dailyas;

#define log_lockfile "Log.lock"

    class Log
    {
    public:
        Log() : _dir(""),_fname(""),_fpath(""),_fd(0),_fh(nullptr),_loglevel(0),_flushnow(0),_showpid(0),_showtid(0),_arg(nullptr),_tlockflag(0),_plockflag(0),_lockfd(0)
        {
            (*this)._defaultarg.expiretime = 10;
            (*this)._defaultarg.newhour = 0;
            pthread_mutex_init(&((*this)._tmutex), NULL);
        };
        Log(char* dir, char* fname, int loglevel, int flushnow, int showpid, int showtid) : _loglevel(loglevel), _flushnow(flushnow), _showpid(showpid), _showtid(showtid)
        {
            snprintf((*this)._dir, LX_LOG_DIR_LENGTH, "%s", dir);
            snprintf((*this)._fname, LX_LOG_FILE_LENGTH, "%s", fname);
            (*this)._tlockflag = 1;
            (*this)._plockflag = 1;
            (*this)._arg = (void*)&((*this)._defaultarg);
            pthread_mutex_init(&((*this)._tmutex), NULL);
            daily_asinit();
            openlog();
        };
        int reopen(const char* dir, const char* fname);
        int cleanup();
        int daily_asinit();
        int daily_autosplit(char* log);
        int daily_ascleanup();
        int plockinit();
        int plock();
        int punlock();
        int plockcleanup();

        int lock();
        int unlock();

        char* tostring();
        int init(const char* _dir, const char* _fname, int loglevel);
        void hdnoplace(char*);
        void log_quit_onerr(int, char*, ...);

        int logcore(int, int, char*, va_list);
        int logfatal(char*, ...);
        int logerror(char*, ...);
        int logwarn(char*, ...);
        int loginfo(char*, ...);
        int logdebug(char*, ...);
        int openlog();

        pthread_mutex_t& gettmutex()
        {
            return (*this)._tmutex;
        }
        void setdailyarg(Log_dailyas defaultarg)
        {
            (*this)._defaultarg.expiretime = defaultarg.expiretime;
            (*this)._defaultarg.newhour = defaultarg.newhour;
        }
        void setplock(int flag)
        {
            (*this)._plockflag = flag;
        }
        void setarg(void* arg)
        {
            (*this)._arg = arg;
        }
        void settlock(int flag)
        {
            (*this)._tlockflag = flag;
        }
        Log_dailyas& getdailyarg()
        {
            return (*this)._defaultarg;
        }
        ~Log()
        {
            daily_ascleanup();
            pthread_mutex_destroy(&((*this)._tmutex));
            plockcleanup();
            fclose((*this)._fh);
            (*this)._fh = NULL;
        }
    private:
        char _dir[LX_LOG_DIR_LENGTH];
        char _fname[LX_LOG_DIR_LENGTH];
        //char* _dir;
        //char* _fname;
        char _fpath[LX_LOG_DIR_LENGTH];
        int _fd;
        FILE* _fh;

        int _loglevel;
        int _flushnow;
        int _showpid;
        int _showtid;

        void* _arg;
        Log_dailyas _defaultarg;

        int _tlockflag;
        int _plockflag;
        pthread_mutex_t _tmutex;
        int _lockfd;

    };
    
}
#endif

