/*
    gcc -o a a.c -pthread
    ./a && ./a && ./a && ./a && ./a && ./a && ./a && ./a && ./a && ./a
*/
#include <semaphore.h>
#include <pthread.h>
#include <stdio.h>
int count=0;
sem_t sem;
 
void inc(void){
        int i=0;
        for(i=0;i<25000000;i++){
        sem_wait(&sem);
                count++;
        sem_post(&sem);
        }
        pthread_exit(NULL);
}
void dec(void){
        int i=0;
        for(i=0;i<25000000;i++){
        sem_wait(&sem);
                count--;
        sem_post(&sem);
        }
        pthread_exit(NULL);
}
int main(void){
    sem_init(&sem,0,1);
        int i=0;
        pthread_t id[4];        
        pthread_create(&id[0],NULL,(void*)dec,NULL);
        pthread_create(&id[1],NULL,(void*)inc,NULL);
        pthread_create(&id[2],NULL,(void*)dec,NULL);
        pthread_create(&id[3],NULL,(void*)inc,NULL);
    for(i=0;i<4;i++)
    {
                pthread_join(id[i],NULL);       
    }
        printf("\noutput is %d\n",count);
    sem_destroy(&sem);
    return 0;
}
