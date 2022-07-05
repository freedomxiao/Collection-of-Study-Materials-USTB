#ifndef LX_LIST_H
#define LX_LIST_H
#include <sys/types.h>
#include <string.h>
#include "buffer.h"

typedef struct list_node
{
    list_node* pre;
    list_node* next;
}list_node;



class KVListNode
{
public:
    KVListNode()
    {
        key = new Buffer();
        value = new Buffer();
        pre = nullptr;
        next = nullptr;
    }
    ~KVListNode()
    {
        delete(key);
        delete(value);
    }
    Buffer* getkey()
    {
        return (*this).key;
    }
    Buffer* getvalue()
    {
        return (*this).value;
    }
    KVListNode* getpre()
    {
        return (*this).pre;
    }
    KVListNode* getnext()
    {
        return (*this).next;
    }
    void setkey(Buffer* key)
    {
        (*this).key = key;
    }
    void setvalue(Buffer* value)
    {
        (*this).value = value;
    }
    void setpre(KVListNode* pre)
    {
        (*this).pre = pre;
    }
    void setnext(KVListNode* next)
    {
        (*this).next = next;
    }
private:
   // list_node list;
    KVListNode* pre;
    KVListNode* next;
    Buffer*  key;
    Buffer*  value;
};
KVListNode* kvlist_find(KVListNode* head,char * key,char * ebase,lx_buffer_mode_t mode);

KVListNode* list_append(KVListNode** head);

KVListNode *  kvlist_append(KVListNode ** phead, char * key, char * value);


#endif

