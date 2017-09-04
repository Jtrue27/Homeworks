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
        if(argc!=2)
    {
        printf("Usage: %s filename\n",argv[0]);
        return 0;
    }
        int fd,count=0;
        char *map_memory,*ca;
        
        fd = open(argv[1], O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
        //off_t lseek(int fildes, off_t offset, int whence); file descriptor offset 開頭 
        lseek(fd, FILE_LENGTH+1, SEEK_SET);
        write(fd, "", 1);
        lseek(fd, 0, SEEK_SET);//欲將讀寫位置移到開頭時
        map_memory =(char*) mmap(0, FILE_LENGTH, PROT_WRITE, MAP_SHARED, fd, 0);
        close(fd);
        
        ca = map_memory;
        printf("Enter something:");
        while( FILE_LENGTH>count && fgets(ca,FILE_LENGTH-count,stdin)!=NULL )
        {
                int tmp = strlen(ca);
                count += tmp;
                ca += tmp;
        }
        
        munmap(map_memory, FILE_LENGTH);
        return 0;
}

