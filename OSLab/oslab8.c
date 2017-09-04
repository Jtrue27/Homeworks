#include<pthread.h>
#include<stdio.h>
#include<stdlib.h>
  
int count = 0;
  
void *PrintHello(void *arg)
{
    int ia=250000;
   
    while(ia--)
    {
        count++;
        
    }
    
    printf("Thread %d: ID %lu Completed.\n",(int)arg,pthread_self());
    pthread_exit(NULL);
}
  
int main()
{
    pthread_t thread[4];
    int rc,t;
    for(t=0;t<4;t++)
    {
        rc = pthread_create( &thread[t], NULL, PrintHello, (void*)t);//create a thread
        if(rc)
        {
            printf("ERROR: return code from pthread_create() is %d\n",rc);
            exit(-1);
        }
    }
    for(t=0;t<4;t++)
    {
        rc = pthread_join( thread[t], NULL);//wait a thread 
        if(rc)
        {
            printf("ERROR: return code from pthread_join() is %d\n",rc);
            exit(-1);
        }
    }
    printf("Value = %d\n",count);
    return 0;
}
