#include <string.h>
#include <unistd.h>
#include <getopt.h>
#include <stdlib.h>
#include <stdio.h>
#include "../lib/serror.h"
#include "async_server.h"

int main(int argc ,char * argv[])
{	
    bool is_nostub = false; 
    int port = 8989,ret,thread_num = 0;
    char * host = "82.156.86.176", *home = "home";

    port = atoi(argv[1]);
    std::cout << "host:" << host << ",port:" << port << ",home:" << home << ",thread_num:" <<thread_num <<"\n";

    //init the server including socket bind and listen
    if(init_async_server(is_nostub,home,thread_num)){
        perror("init server error\n");
        return EXIT_FAILURE;
    }
	std::cout << "init server ok\n";

    //run the server
    if(start_async_server(port)){
        perror("start server error\n");
        ret = EXIT_FAILURE;
        goto end;
    }
    ret = EXIT_SUCCESS;

end:
    if(cleanup_async_server()){
        perror("clean up server error\n");
        return EXIT_FAILURE;
    }
 
    return ret; 
}

