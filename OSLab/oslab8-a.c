#include<pthread.h>
#include<unistd.h>
#include<stdio.h>
#include<string.h>
#include<sys/types.h>
#include<sys/ipc.h>
#include<sys/msg.h>
#include<stdlib.h>
#include"msg_que.h"
  
long int ProgramID = 1; 
int closeMsgQue = 0;
  
void *MsgSend(void *arg)
{
    key_t key=0x1234;
        int msqid = msgget(key,IPC_CREAT | 0666);
        struct oslab_msg_st msg_buffer;
        while( printf("Enter some text: "),fgets(msg_buffer.msg_text,256,stdin))
        {
                msg_buffer.oslab_msg_type = ProgramID;
                msgsnd(msqid,(void*)&msg_buffer,sizeof(msg_buffer)-sizeof(long int),0);
                if(strcmp(msg_buffer.msg_text,"exit\n")==0)
                {
            closeMsgQue = 1;
                        break;
        }
        }
    pthread_exit(NULL);
}
void *MsgGet(void *arg)
{
    key_t key=0x1234;
        int msqid = msgget(key,IPC_CREAT | 0666);
        struct oslab_msg_st msg_buffer;
        struct msqid_ds msq_id;
        msgctl(msqid,IPC_STAT,&msq_id);
        while( msgrcv(msqid,(void*)&msg_buffer,sizeof(msg_buffer)-sizeof(long int),3-ProgramID,0) )
        {
                printf("Received: %s\n",msg_buffer.msg_text);
                if(strcmp(msg_buffer.msg_text,"exit\n")==0)
                {
                        if(closeMsgQue)msgctl(msqid,IPC_RMID,&msq_id);
                        break;
                }
        }
    pthread_exit(NULL);
}
  
int main()
{
    pthread_t thread[2];
    int rc,t;
    rc = pthread_create( &thread[0], NULL, MsgSend, (void*)t);
    if(rc)
    {
        printf("ERROR: return code from pthread_create() is %d\n",rc);
        exit(-1);
    }
    rc = pthread_create( &thread[1], NULL, MsgGet, (void*)t);
    if(rc)
    {
        printf("ERROR: return code from pthread_create() is %d\n",rc);
        exit(-1);
    }
    rc = pthread_join( thread[0], NULL);
    if(rc)
    {
        printf("ERROR: return code from pthread_join() is %d\n",rc);
        exit(-1);
    }
    rc = pthread_join( thread[1], NULL);
    if(rc)
    {
        printf("ERROR: return code from pthread_join() is %d\n",rc);
        exit(-1);
    }
    return 0;
}
