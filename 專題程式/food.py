#coding=utf-8
import jieba
import MySQLdb
import sys
import random
from DBcrud import DBConn


class Food:      
    def __init__(self,results):
        self.f_ids=[" "]
        self.f_s=[" "]
        self.f_answer=""
        self.find=0
        for row in results:
            self.f_ids.append(int(row[0]))
            self.f_s.append(row[1])
        #print self.f_s
        
    def saveData(self,results):
        for row in results:
            self.f_ids.append(int(row[0]))
            self.f_s.append(row[1])
        print self.f_s
    
    def match(self,inputstring):
        self.find=0
        words=jieba.cut(inputstring,cut_all=False)
        for word in words:
            if word==u'吃'or word==u'推薦' or word==u'好吃':
                    self.find=1
                    n=random.randint(1,10)
                    self.f_answer=self.f_s[n]
                    return self.find
        if self.find==0:
            return self.find
        
    def  getAnswer(self):
        return self.f_answer
    
        
            

