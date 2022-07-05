#include "list.h"
#include <stdlib.h>

KVListNode* list_append(KVListNode ** head)
{
    KVListNode* p = new KVListNode();

    if(p != NULL)
    {

        if(*head == NULL)
            *head = p;    
        else
        {
           p->setnext(*head); 
           (*head)->setpre(p);
           *head = p;
        }
    }
    return p;
}

KVListNode* kvlist_find(KVListNode* head,char * key,char * ebase,lx_buffer_mode_t mode)
{
    KVListNode* cur;
	
	if(head == NULL)
		return NULL;
	
	cur = head;
	while(cur)
	{
		switch(mode)
		{
		case lx_base:
			if(cur->getkey()->getbase())
			{ 
				if(strcmp(key,cur->getkey()->getbase())==0)
					return cur;
			}
			break;
		case lx_base_len:
			if(cur->getkey()->getbase())
			{ 
				if(strncmp(key,cur->getkey()->getbase(),cur->getkey()->getlen() )==0)
					return cur;
			}
			break;
		
		case lx_ebase_offset:
			if( ebase){
				if(strcmp(key,ebase + cur->getkey()->getoffset()) == 0)
					return cur;
			}
			break;
		case lx_ebase_offset_len:
			if(ebase){
				if(strncmp(key,ebase + cur->getkey()->getoffset(),cur->getkey()->getlen()) == 0)
					return cur;
			}
			break;
		}
		cur =(KVListNode*) cur->getnext();
	}
	
	return NULL;
}

KVListNode * kvlist_append(KVListNode ** phead, char * key, char * value)
{
    char * nkeybuff, * nvalbuff;
    KVListNode * node;
    size_t klen,vlen;

    if(!key && !value)
        return NULL;

    nkeybuff = nvalbuff = NULL;
    node = NULL;
    klen = strlen(key) + 1;
    vlen = strlen(value) + 1;

    nkeybuff = (char *)malloc(klen);
    nvalbuff = (char *)malloc(vlen);
    node =list_append(phead);
    
    if( !nkeybuff || !nvalbuff || !node)
        goto err;

    memcpy(nkeybuff, key, klen);
    memcpy(nvalbuff, value, vlen);

    node->setkey(new Buffer(nkeybuff, 0, klen, vlen));
    node->setvalue(new Buffer(nvalbuff, 0, klen, vlen));
    
    return node;

err:
    if(!nkeybuff)
        free(nkeybuff);
    if( !nvalbuff)
        free(nvalbuff);
    return NULL;
    
}

void list_free(list_node ** head)
{
    list_node * next, * cur;
    
    cur = * head;
    while( cur != NULL)
    {
        next = cur ->next;
        free(cur);
        cur = next;
    }
    
    *head = NULL;
}


