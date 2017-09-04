#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<sys/mman.h>
#include<sys/stat.h>
#include<unistd.h>
#include<fcntl.h>
#define FILE_LENGTH 10000
 
int main(int argc,char *argv[])
{
        if(argc!=4)
    {
        printf("Usage: %s filename start_pos end_pos\n",argv[0]);
        return 1;
    }
        int start_pos=0, end_pos=0;
        start_pos = atoi(argv[2]);
        end_pos = atoi(argv[3]);
        if(start_pos<0 || end_pos>FILE_LENGTH || start_pos>end_pos)
        {
                puts("start_pos or end_pos error. Please try again.");
        return 1;
        }
        int fd,i;
        char *map_memory;
         
        fd = open(argv[1], O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
         
        lseek(fd, FILE_LENGTH+1, SEEK_SET);
        write(fd, "", 1);
        lseek(fd, 0, SEEK_SET);
        map_memory =(char*) mmap(0, FILE_LENGTH, PROT_WRITE, MAP_SHARED, fd, 0);
        close(fd);
         
        printf("Substring from [%d] to [%d] is: ",start_pos,end_pos);
        for(i=start_pos-1;i<end_pos;i++)
                printf("%c",*(map_memory+i));
        puts("");
         
        munmap(map_memory, FILE_LENGTH);
        return 0;
}

