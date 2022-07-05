#include <string.h>
#include <assert.h>
#include <stdio.h>
#include <string>
#include "hsy_path.h"
int getdir(char * fname, char * buff, size_t size)
{
    if( fname == NULL || buff == NULL || size < 3)
        return -1;
    char * dirend = NULL;  
    if( (dirend = strrchr(fname,'/' )) ||( dirend = strrchr(fname,'\\') ))
    {
        snprintf(buff,size,"%s",fname);
        int end = dirend - fname +1 > (int)size -1 ?(int)size-1: dirend-fname+1;
        buff[end] = 0;
    }else
        snprintf(buff,size,"./");
    return 0;
}

int getfname(char * fname, char * buff, size_t size)
{
    //separate directory and file name
     char * dirend = NULL;  
    if((dirend = strrchr(fname,'/' )) || (dirend = strrchr(fname,'\\')) )
        dirend +=1; 
    else
        dirend = (char *)fname; 
    snprintf(buff,size,"%s",dirend);
    
    if(strlen(buff) == 0)
        return -1;

    return 0;
}


    




