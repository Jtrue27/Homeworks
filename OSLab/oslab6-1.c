#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
 
int ia=10;
 
int main()
{
    int ib=10;
    pid_t new_pid;
    printf("pid=%d, ppid=%d, global=%d, local=%d\n",getpid(),getppid(),ia,ib);
    new_pid = fork();
    switch(new_pid)
    {
      case -1:
        printf("fork error!\n");
        break;
      case 0:
        printf("pid=%d, ppid=%d, global=%d, local=%d\n",getpid(),getppid(),ia,ib);
        ia++;
        ib++;
        printf("pid=%d, ppid=%d, global=%d, local=%d\n",getpid(),getppid(),ia,ib);
        break;
      default:
        wait(NULL);
        printf("pid=%d, ppid=%d, global=%d, local=%d\n",getpid(),getppid(),ia,ib);
        break;
    }
}
