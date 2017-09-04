#coding=utf-8
import jieba
import MySQLdb
import sys
import random
from DBcrud import DBConn

class Greeting:
    def __init__(self):
        self.answer=""
        self.find=0

    def greetBack(self,sentence):
        self.find=0
        words=jieba.cut(sentence,cut_all=False)
        for word in words:
            self.find=1
            if word==u'謝謝':
                self.answer="不用客氣!"
                return self.find
            elif word==u'對不起' or word==u'抱歉' or word==u'不好意思':
                self.answer="別客氣，儘管說"
                return self.find
            elif word==u'我是':
                self.answer="你好，小弟久仰很久了"
                return self.find
            elif word==u"你好":
                self.answer="你好^^!"
                return self.find
            elif word==u'嗨':
                self.answer="嗨~~^^!"
                return self.find
            else :
                break
        if self.find==0:
            return self.find
    def getAnswer(self):
        return self.answer
