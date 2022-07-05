#include <string.h>
#include <assert.h>
#include <iostream>
#include "rbtree.h"

namespace rbtree
{
    static int rbTree_free_node(RbTreeNode* n, RbTree_t* tree)
    {
        RbTreeNode* nil;

        nil = &tree->nil;
        if (n == nil)
            return -1;

        rbTree_free_node(n->getleft(), tree);
        rbTree_free_node(n->getright(), tree);

        delete(n);
        n = NULL;
        return 0;
    }

    int rbTree_free(RbTree_t* tree)
    {
        return rbTree_free_node(tree->root, tree);
    }

    RbTreeNode* rbTree_find(RbTree_t* tree, uint64_t key)
    {
        RbTreeNode* nil, * n;
        if (tree->root == nullptr)
        {
            return nullptr;
        }
        n = tree->root;
        nil = &tree->nil;

        while (n != nil)
        {
            uint64_t ckey = n->getkey();
            if (ckey == key)
                return n;
            if (key < ckey)
                n = n->getleft();
            else
                n = n->getright();
        }
        return NULL;
    }

    RbTreeNode* rbTree_min(RbTree_t* tree, RbTreeNode* node)
    {
        RbTreeNode* nil, * n, * p;
	if(tree == nullptr || node == nullptr)
	{
		std::cout << "error because tree is nullptr" << std::endl;
	}
        n = node;
        nil = &tree->nil;
        if (n == nil)
            return nil;

        while (n != nullptr && (n->getleft()) != nil)
        {
            p = n;
            n = n->getleft();
        }
        return n;
    }

    static inline void left_rotate(RbTreeNode* x, RbTree_t* tree)
    {
        RbTreeNode* y, * nil;
        nil = &tree->nil;
        if (x == nil || x->getright() == nil)
            assert(0);

        y = x->getright();

        y->setparent(x->getparent());
        if (x == tree->root)
            tree->root = y;
        else {
            if (x == x->getparent()->getleft())
                (x->getparent())->setleft(y);
            else
                (x->getparent())->setright(y);
        }

        x->setright(y->getleft());

        if (y->getleft() != nil)
            y->getleft()->setparent(x);

        y->setleft(x);
        x->setparent(y);
    }

    static void right_rotate(RbTreeNode* x, RbTree_t* tree)
    {
        RbTreeNode* y, * nil;

        nil = &tree->nil;
        if (x == nil || x->getleft() == nil)
            assert(0);

        y = x->getleft();

        y->setparent(x->getparent()) ;
        if (x == tree->root)
            tree->root = y;
        else {
            if (x == x->getparent()->getleft())
                x->getparent()->setleft(y);
            else
                x->getparent()->setright(y);
        }

        x->setleft(y->getright());
        if (y->getright() != nil)
            y->getright()->setparent(x);

        x->setparent(y);
        y->setright(x);
    }

    static void fixup_insert_color(RbTreeNode* x, RbTree_t* tree)
    {
        RbTreeNode* nil, * root, * y;

        nil = &(tree->nil);

        while (x != nullptr && x->getparent() != nullptr && x->getparent()->getparent() != nullptr && x->getparent()->getcolor() == RED && x != tree->root)
        {
            if ((x->getparent() == x->getparent()->getparent()->getleft()))
            {
                y = x->getparent()->getparent()->getright();
                if (y->getcolor() == RED)
                {
                    y->setcolor(BLACK);
                    x->getparent()->setcolor(BLACK);
                    x->getparent()->getparent()->setcolor(RED);
                    x = x->getparent()->getparent();
                }
                else
                {
                    if (x == x->getparent()->getright())
                    {
                        left_rotate(x->getparent(), tree);
                        x = x->getleft();
                    }
                    x->getparent()->setcolor(BLACK);
                    x->getparent()->getparent()->setcolor(RED);
                    right_rotate(x->getparent()->getparent(), tree);
                }
            }
            else
            {
                y = x->getparent()->getparent()->getleft();
                if (y->getcolor() == RED)
                {
                    y->setcolor(BLACK);
                    x->getparent()->setcolor(BLACK);

                    x->getparent()->getparent()->setcolor(RED);
                    x = x->getparent()->getparent();
                }
                else
                {
                    if (x == x->getparent()->getleft()) {
                        right_rotate(x->getparent(), tree);
                        x = x->getright();
                    }
                    x->getparent()->setcolor(BLACK);
                    x->getparent()->getparent()->setcolor(RED);
                    left_rotate(x->getparent()->getparent(), tree);
                }
            }
        }

        if (x == tree->root)
            x->setcolor(BLACK);
    }

    int rbTreeNode_insert(RbTree_t* tree, uint64_t key, void* data)
    {
        RbTreeNode* node, * next_node, * temp_node;
        //root
        if (tree->root == &(tree->nil)) {
            node = new RbTreeNode(key, data, BLACK, &(tree->nil), &(tree->nil), &(tree->nil));
            if (node == NULL)
                return LX_RBTREE_NOMEM;
            tree->root = node;
            return 0;
        }

        //find parent
        node = tree->root;
        while (1)
        {
            uint64_t ckey = node->getkey();
            if (ckey == key)
                return LX_RBTREE_KEY_EXIST;
            if (key < ckey)
                next_node = node->getleft();
            else
                next_node = node->getright();

            if (next_node == &(tree->nil)|| next_node == NULL) {
                break;
            }
            else {
                node = next_node;
                continue;
            }
        }
        temp_node = new RbTreeNode(key, data, RED, &(tree->nil), &(tree->nil), &(tree->nil));
        if (temp_node == NULL)
            return LX_RBTREE_NOMEM;

        if (temp_node->getkey() < node->getkey())
        {
            node->setleft(temp_node);
        }
        else
        {
            node->setright(temp_node);
        }
        temp_node->setparent(node);
        fixup_insert_color(temp_node, tree);
        return 0;
    }

    static void transplant(RbTree_t* tree, RbTreeNode* u, RbTreeNode* v)
    {
        v->setparent(u->getparent());

        if (u->getparent() == &tree->nil)
            tree->root = v;
        else if (u == u->getparent()->getleft())
            u->getparent()->setleft(v);
        else
            u->getparent()->setright(v);
    }

#define check_pc_color(n) assert((n)->getleft()->getcolor() == BLACK && (n)->getright()->getcolor() == BLACK &&(n)->getparent()->getcolor() == BLACK);
#define check_c_color(n) assert((n)->getleft()->getcolor() == BLACK && (n)->getright()->getcolor() == BLACK );

    static void fixup_delete_color(RbTree_t* tree, RbTreeNode* x)
    {
        RbTreeNode* nil, * w;

        nil = &(tree->nil);
        while (x->getcolor() == BLACK && x != tree->root)
        {
            if (x == x->getparent()->getleft()) {
                w = x->getparent()->getright();
                //case 1:w is red
                if (w->getcolor() == RED) {
                    left_rotate(x->getparent(), tree);
                    x->getparent()->setcolor(RED);
                    w->setcolor(BLACK);
                    check_pc_color(x->getparent());

                    w = x->getparent()->getright();
                }

                //w is black
                //case 2
                if (w->getleft()->getcolor() == BLACK && w->getright()->getcolor() == BLACK)
                {
                    w->setcolor(RED);
                    check_c_color(w);
                    x = x->getparent();
                }
                else
                {
                    //case 3
                    if (w->getright()->getcolor() == BLACK)
                    {
                        right_rotate(w, tree);
                        w->getparent()->setcolor(BLACK);
                        w->setcolor(RED);

                        check_pc_color(w);
                        w = w->getparent();
                    }

                    //case 4
                    left_rotate(x->getparent(), tree);
                    w->getright()->setcolor(BLACK);
                    w->setcolor(x->getparent()->getcolor());
                    x->getparent()->setcolor(BLACK);

                    x = tree->root;
                }

            }
            else
            {
                w = x->getparent()->getleft();
                if (w->getcolor() == RED) {
                    right_rotate(x->getparent(), tree);
                    w->setcolor(BLACK);

                    x->getparent()->setcolor(RED);
                    check_pc_color(x->getparent());

                    w = x->getparent()->getleft();
                }

                if (w->getleft()->getcolor() == BLACK && w->getright()->getcolor() == BLACK)
                {
                    w->setcolor(RED);
                    check_c_color(w);
                    x = x->getparent();
                }
                else
                {

                    if (w->getleft()->getcolor() == BLACK) {
                        left_rotate(w, tree);
                        w->setcolor(RED);
                        w->getparent()->setcolor(BLACK);
                        check_pc_color(w);

                        w = w->getparent();
                        assert(w == x->getparent()->getleft());
                    }

                    right_rotate(x->getparent(), tree);
                    w->getleft()->setcolor(BLACK);
                    w->setcolor(x->getparent()->getcolor());
                    x->getparent()->setcolor(BLACK);

                    x = tree->root;
                }
            }//end x is right
        }//end while

        x->setcolor(BLACK);
    }

    int rbTreeNode_delete(RbTree_t* root, uint64_t key)
    {
        RbTreeNode* n, * nil, * z, * y, * x;
        uint64_t ckey;
        RbTree_color y_original;


        nil = &(root->nil);
        n = root->root;
	std::cout << "sss" <<std::endl;
        while (n!= nullptr && n != nil)
        {
            ckey = n->getkey();
            if (key == ckey)
                break;
            else if (key < ckey)
                n = n->getleft();
            else
                n = n->getright();
        }
        if (n == nil)
            return LX_RBTREE_NO_EXIST;
        z = y = n;
        y_original = y->getcolor();
        if (z->getleft() == nil)
	{
            x = z->getright();
            transplant(root, z, x);
        }
        else if (z->getright() == nil)
        {
            x = z->getleft();
            transplant(root, z, x);
        }
        else
        {
            y = rbTree_min(root, z->getright());
	    if(y == nullptr)
	    {
		    std::cout << "y is nullptr"<< std::endl;
	    }
            y_original = y->getcolor();
            x = y->getright();
            if (y->getparent() == z) {
                x->setparent(y);
            }
            else {
                transplant(root, y, x);
                y->setright(z->getright());
                y->getright()->setparent(y);
            }
            transplant(root, z, y);
            y->setleft(z->getleft());
            y->getleft()->setparent(y);
            y->setcolor(z->getcolor());
        }

        delete(z);
        if (y_original == BLACK)
            fixup_delete_color(root, x);

        return 0;
    }
}
