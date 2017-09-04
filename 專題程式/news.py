# coding=utf-8
import random
import requests
from bs4 import BeautifulSoup
import sys
import jieba

class News:
    
    def __init__(self):
        self.res = requests.get("https://news.google.com")
        self.soup = BeautifulSoup(self.res.text,"html.parser")
        self.find=0
        self.answer=""
        self.s=[" "]
        for item in self.soup.select(".esc-body"):
                    news_title = item.select(".esc-lead-article-title")[0].text
                    self.s.append(news_title)
        #print self.s

    def match(self,sentence):
        
        words=jieba.cut(sentence,cut_all=False)
        
        for word in words:
            if word==u'新聞':
                self.find=1
                n=random.randint(1,10)
                self.answer=self.s[n]
                return self.find         
        if self.find==0:
            return self.find
        
    def getAnswer(self):
        return self.answer
                
            
    
        
            

            
     
        
