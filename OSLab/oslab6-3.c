#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
 
int main()
{
    if(fork()==0)
    {
      if(fork()==0)
      {
        printf("I'm child process C.\n");
        printf("C) PID: %d\tParent PID: %d\n",getpid(),getppid());
        return 0;
      }
      wait(NULL);
      printf("I'm child process B.\n");
      printf("B) PID: %d\tParent PID: %d\n",getpid(),getppid());
      return 0;
    }
    usleep(50);
    if(fork()==0)
    {
      printf("I'm child process D.\n");
      usleep(50);
      printf("D) PID: %d\tParent PID: %d\n",getpid(),getppid());
      return 0;
    }
    if(fork()==0)
    {
      printf("I'm child process E.\n");
      usleep(50);
      printf("E) PID: %d\tParent PID: %d\n",getpid(),getppid());
      return 0;
    }
    wait(NULL);
    wait(NULL);
    wait(NULL);
    printf("I'm child process A.\n");
    printf("A) PID: %d\tParent PID: %d\n",getpid(),getppid());
}
