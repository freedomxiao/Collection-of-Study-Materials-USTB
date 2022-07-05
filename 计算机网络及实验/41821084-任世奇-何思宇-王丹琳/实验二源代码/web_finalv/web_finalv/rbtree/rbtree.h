#ifndef LX_RBTREE_H 
#define LX_RBTREE_H
#include <stdio.h>
#include <string.h>
#include <stdint.h>
#include <stdlib.h>
#include <iostream>
namespace rbtree 
{
    typedef enum lx_rbtree_rcode 
    {
        LX_RBTREE_OK = 0,
        LX_RBTREE_NOMEM = -100,
        LX_RBTREE_KEY_EXIST,
        LX_RBTREE_NO_EXIST,
        LX_RBTREE_ERROR
    }lx_rbtree_rcode;

    typedef enum RbTree_color
    {
        BLACK,
        RED
    }RbTree_color;

    class RbTreeNode
    {
    public:
        RbTreeNode():_key(0),_data(nullptr),_color(BLACK),_left(nullptr),_right(nullptr),_parent(nullptr)
        {
        };
        RbTreeNode(uint64_t key, void* data, RbTree_color color, RbTreeNode* left, RbTreeNode* right, RbTreeNode* parent) : _key(key), _data(data), _color(color), _left(left), _right(right), _parent(parent) { };

        uint64_t& getkey()
        {
            return (*this)._key;
        }
        void* getdata()
        {
            return (*this)._data;
        }
        RbTreeNode* getleft()
        {
            return (*this)._left;
        }
        RbTreeNode* getright()
        {
            return (*this)._right;
        }
        RbTreeNode* getparent()
        {
            return (*this)._parent;
        }
        RbTree_color& getcolor()
        {
            return (*this)._color;
        }
        void setparent(RbTreeNode* parent)
        {
            (*this)._parent = parent;
        }
        void setleft(RbTreeNode* left)
        {
            (*this)._left = left;
        }
        void setright(RbTreeNode* right)
        {
            (*this)._right = right;
        }
        void setcolor(RbTree_color color)
        {
            (*this)._color = color;
        }
    private:
        uint64_t _key;
        void* _data;
        RbTree_color _color;

        RbTreeNode* _left;
        RbTreeNode* _right;
        RbTreeNode* _parent;
    };

    typedef struct RbTree_t 
    {
        RbTreeNode* root;
        RbTreeNode  nil;
    }RbTree_t;

    int rbTree_free(RbTree_t* tree);
    RbTreeNode* rbTree_min(RbTree_t* root, RbTreeNode* node);
    RbTreeNode* rbTree_find(RbTree_t* root, uint64_t key);
    int rbTreeNode_insert(RbTree_t* root, uint64_t key, void* data);
    int rbTreeNode_delete(RbTree_t* root, uint64_t key);
}
#endif

