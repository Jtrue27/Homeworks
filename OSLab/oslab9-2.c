#include<stdio.h>
#include<unistd.h>
#include<signal.h>
 
int main()
{
    pid_t newpid;
    printf("Input the pid of the process you want to kill -> ");
    scanf("%d",&newpid);
    kill(newpid,SIGKILL);
}
