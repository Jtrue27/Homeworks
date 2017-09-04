#coding=utf-8
import jieba
import MySQLdb
import sys
import random
from DBcrud import DBConn


class Other:      
    def __init__(self,results):
        self.o_ids=[" "]
        self.o_s=[" "]
        self.o_answer=""
        for row in results:
            self.o_ids.append(int(row[0]))
            self.o_s.append(row[1])
        #print self.t_s
      
    def saveData(self,results):
        for row in results:
            self.o_ids.append(int(row[0]))
            self.o_s.append(row[1])
        print self.o_s
    
    def match(self):
            n=random.randint(1,10)
            self.o_answer=self.o_s[n]
    def getAnswer(self):
        return self.o_answer
        
        
