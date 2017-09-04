import MySQLdb
# -*- coding:utf-8 -*-

class DBConn:
  def __init__(self):
    self.user = 'root'
    self.host = 'localhost'
    self.passwd = ''
    self.dbname = 'example'

  def dbConnect(self):
    self.db = MySQLdb.connect(
      self.host,self.user,self.passwd,self.dbname,charset='utf8')
    self.cursor = self.db.cursor()
    #print "Connect Success!"

  # Exec SQL Query 
  def runQuery(self, sql):
    
    self.cursor.execute(sql)
    self.results = self.cursor.fetchall()
    
    #print "Query Success!"

  # Exec SQL Insert
  def runInsert(self, sql):
    self.cursor.execute(sql)
    self.db.commit()

  # Exec SQL Update
  def runUpdate(self, sql):
    self.cursor.execute(sql)
    self.db.commit()

  # Exec SQL Delete
  def runDelete(self, sql):
    self.cursor.execute(sql)
    self.db.commit()

  def dbClose(self):
    self.db.close()
  def getids(self):
    return self.ids

 
    
