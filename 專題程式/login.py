# -*- coding: utf-8 -*-
from Tkinter import *
from ttk import *
from WINDOW import GUIDemo


class login(Frame):
    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.grid()
        self.createWidgets()



    def createWidgets(self):
        self.loginText = Label(self)
        self.loginText["text"] = "歡迎來到本系統，謝謝你使用本系統!"
        self.loginText["width"] =30
      
        self.loginText.grid(row=0, column=0,columnspan=10)


   
        self.loginText = Label(self)
        self.loginText["text"] = "使用者:"
        self.loginText.grid(row=1, column=0)
        
        self.loginField = Entry(self)
        self.loginField["width"] = 50
        self.loginField.grid(row=1, column=1)

        self.start = Button(self)
        self.start["text"] = "開始聊天"
        self.start["command"]=self.login
        self.start.grid(row=2, column=0,columnspan=10)

                
    def login(self):
          self.master.destroy()    
          root = Tk()
          app = GUIDemo(master=root)
          app.newMethod()
          app.master.resizable(0,0)
          app.master.title("聊天室")
          app.mainloop()
          
          
if __name__ == '__main__':
    root = Tk()
    app = login(master=root)
    app.master.resizable(0,0)
    app.master.title("登入")
    app.mainloop()
   
