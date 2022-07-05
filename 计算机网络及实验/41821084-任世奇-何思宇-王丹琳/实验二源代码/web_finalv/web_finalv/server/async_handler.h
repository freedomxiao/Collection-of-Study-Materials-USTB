#ifndef LX_ASYNC_HANDLER_H
#define LX_ASYNC_HANDLER_H
#include "conn_ctx.h"

int handle_events(int ep_fd,struct epoll_event * events, int nevent,rbtree::RbTree_t * timer);
int listen_handle(Async_conn_ctx * );
int conn_handle(Async_conn_ctx * );

#endif
