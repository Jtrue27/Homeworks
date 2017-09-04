# -*- coding: utf-8 -*-
import jieba
import MySQLdb
import sys
from DBcrud import DBConn
from food import Food
from traffic import Traffic
from other import Other
from news import News
from entertainment import Entertainment
from buy import Buy
from greeting import Greeting
from NchuNews import nchuNews


class Talk:
  def __init__(self):
      self.dbuse=DBConn()
      self.dbuse.dbConnect()
      self.fsql = "SELECT * FROM food"
      self.tsql = "SELECT * FROM traffic"
      self.osql = "SELECT * FROM other"
      self.esql = "SELECT * FROM entertainment"
      self.bsql = "SELECT * FROM buy"
      self.dbuse.runQuery( self.fsql)
      self.food=Food( self.dbuse.results)
      self.dbuse.runQuery( self.tsql)
      self.traffic=Traffic( self.dbuse.results)
      self.dbuse.runQuery( self.osql)
      self.other=Other( self.dbuse.results)
      self.dbuse.runQuery( self.esql)
      self.entertainment=Entertainment( self.dbuse.results)
      self.dbuse.runQuery( self.bsql)
      self.buy=Buy( self.dbuse.results)
      self.greeting=Greeting()
      self.news=News()
      self.NchuNews=nchuNews()
    
  def getsentence(self,sentence):
    if  self.traffic.match(sentence):
      return  self.traffic.getAnswer()
    elif  self.greeting.greetBack(sentence):
      return  self.greeting.getAnswer()
    elif  self.food.match(sentence):
      return  self.food.getAnswer()
    elif  self.news.match(sentence):
      return  self.news.getAnswer()
    elif  self.NchuNews.match(sentence):
      return  self.NchuNews.getAnswer()
    
    elif  self.entertainment.match(sentence):
      return  self.entertainment.getAnswer()
    elif  self.buy.match(sentence):
      return  self.buy.getAnswer() 
    else:
      self.other.match()
      return  self.other.getAnswer()
"""
if __name__ == '__main__':
    e = Talk()
    s="興大新聞"
    print e.getsentence(s)
"""

