/*
Step1: Using the fork() function to create a new process.
 
Step2: Using command line to kill the process.
        kill -kill 1899
 
Step3: Repeat step1 and use system calls to kill process.
         
*/
#include<stdio.h>
#include<unistd.h>
 
int main()
{
    pid_t newpid = fork();
    if(newpid==0)
    {
        for(;;)
            pause();
    }
    printf("pid = %d\n",newpid);
    wait(NULL);
    printf("Child process is finished.\n");
}

