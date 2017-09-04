#coding=utf-8
import jieba
import MySQLdb
import sys
import random
from DBcrud import DBConn


class Entertainment:      
    def __init__(self,results):
        self.t_ids=[" "]
        self.t_s=[" "]
        self.t_answer=""
        self.find=0
        for row in results:
            self.t_ids.append(int(row[0]))
            self.t_s.append(row[1])
        #print self.t_s
      
    def saveData(self,results):
        for row in results:
            self.t_ids.append(int(row[0]))
            self.t_s.append(row[1])
        print self.t_s
    
    def match(self,tstring):
        self.find=0
        twords=jieba.cut(tstring,cut_all=False)
        for tword in twords:
            if tword==u'玩'or tword==u'好玩' or tword==u'無聊':
                    self.find=1
                    n=random.randint(1,10)
                    self.t_answer=self.t_s[n]
                    return self.find
        if self.find==0:
            return self.find
    def  getAnswer(self):
        return self.t_answer

