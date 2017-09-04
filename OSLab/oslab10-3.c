#include <pthread.h>
#include <stdio.h>
#include <semaphore.h> 

int count=0;
int BUFFER_SIZE=5;
        
sem_t sem;
sem_t sem_fill;
sem_t sem_empty;
void Producer(void);
void Consumer(void);
 
void Producer(void)
{
	sem_wait(&sem_empty);
	sem_wait(&sem);
	count++;
	printf("count is %d\n",count);
	sem_post(&sem);
	sem_post(&sem_fill);
	pthread_exit(NULL);   
   
}
 
void Consumer(void )
{
	sem_wait(&sem_fill);
	sem_wait(&sem);
	count--;
	printf("count is %d\n",count);
	sem_post(&sem);
	sem_post(&sem_empty);
	pthread_exit(NULL);  
   
}
 
int main()
{
	int i=0;
	int n=0;
	pthread_t consumer_id[10];
	pthread_t producer_id[10];
	sem_init(&sem_empty,0,5);
	sem_init(&sem_fill,0,0);
	sem_init(&sem,0,1);
	for(n=0;n<10;n++){
		pthread_create(&producer_id[n],NULL,(void*)Producer,NULL);
		pthread_create(&consumer_id[n],NULL,(void*)Consumer,NULL);
	}
	for(i=0;i<10;i++){
		pthread_join(producer_id[i],NULL);
		pthread_join(consumer_id[i],NULL);
	}
//	printf("output is %d",count);
	pthread_exit(NULL);
}
