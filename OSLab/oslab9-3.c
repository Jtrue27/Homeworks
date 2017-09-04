#include<stdio.h>
#include<unistd.h>
#include<signal.h>
 
struct sigaction newact;
 

void catch_alarm_2(int sig_num)   
{   
    
    sigaction(SIGINT, &newact, NULL);
}
void catch_int_1(int sig_num)   
{   
    signal(SIGINT, catch_int_1);
    printf("How are you?\n",sig_num);
}
void catch_int_2(int sig_num)  
{   
  
    signal(SIGINT, catch_int_2);
    printf("I am fine!\n",sig_num);
}
void catch_alarm_1(int sig_num)  
{   
    signal(SIGINT, catch_int_2);
    signal(SIGALRM, catch_alarm_2);
    alarm(3);
}
 
int main(int argc, char* argv[])
{
    sigaction(SIGINT, NULL, &newact);
     
    
    signal(SIGINT, catch_int_1);
    signal(SIGALRM, catch_alarm_1);
    alarm(3);
 

    for ( ;; )
        pause();
} 

