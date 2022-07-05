#ifndef LX_HTTP_UTIL_H
#define LX_HTTP_UTIL_H
#include "http.h"
#include "../lib/serror.h"
#include <sys/socket.h>

typedef struct h_url_s
{
    char * sche;
    char * user;
    char * pwd;
	char * host;
	int port;
	
    char * path;
    char * rsour;
    char * params;
	
	char * orip;
	int pthidx;
}h_url_s;

int parse_url(char * url, h_url_s * psurl);

void test_parurl(char * url);

int http_save_body(int fd, FILE * stubfh, char * prefix,Parser_ctx * pctx,bool is_req);

#endif
