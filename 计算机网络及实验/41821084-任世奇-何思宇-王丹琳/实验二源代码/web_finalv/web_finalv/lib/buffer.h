#ifndef LX_BUFFER_H
#define LX_BUFFER_H
#include <sys/types.h>
#include <stdlib.h>
#include <string.h>
#include <vector>

typedef enum lx_buffer_mode_t 
{
    lx_base,
    lx_base_len,
    lx_ebase_offset,
    lx_ebase_offset_len
}lx_buffer_mode_t;


class Buffer
{
public:
    Buffer():_base(NULL),_offset(0),_len(0),_maxlen(0)
    {
        
    };
    Buffer(char* base, int offset, int len, int maxlen) :_base(base), _offset(offset), _len(len), _maxlen(maxlen) 
    {

    };
    void buffer_reset(char* nval)
    {
        char* newb;
        size_t len;

        len = strlen(nval);
        newb = (char*)malloc(len + 1);
        if (!newb)
            return;
        memcpy(newb, nval, len);
        newb[len] = 0;

        if ((*this)._base)
            free((*this)._base);

        (*this)._base = newb;
        (*this)._maxlen = len;
    }
    void setlen(int len)
    {
        (*this)._len = len;
    }
    void setbase(char* base)
    {
        (*this)._base = base;
    }
    void setoffset(int offset)
    {
        (*this)._offset = offset;
    }
    void setmaxlen(int maxlen)
    {
        (*this)._maxlen = maxlen;
    }
    int& getlen()
    {
        return (*this)._len;
    }
    char* getbase()
    {
        return (*this)._base;
    }
    int& getoffset()
    {
        return (*this)._offset;
    }
    int& getmaxlen()
    {
        return (*this)._maxlen;
    }
    ~Buffer()
    {
        if((*this)._base)
            free((*this)._base);
    }
private:
    char* _base;
    int _offset;
    int _len;
    int _maxlen;
};

#define lx_buffer_lenp(buff) ( (buff)->getbase() + (buff)->getlen())
#define lx_buffer_offsetp(buff) ( (buff)->getbase() + (buff)->getoffset())
#define lx_buffer_maxlenp(buff) ( (buff)->getbase() + (buff)->getmaxlen())

#define lx_buffer_unscannum(buff) ((buff)->getlen() - (buff)->getoffset())
#define lx_buffer_freenum(buff) ( (buff)->getmaxlen() - (buff)->getlen())

#endif
