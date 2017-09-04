#import Tkinter as tk
# -*- coding: utf-8 -*-
#import Tkinter as tk
from Tkinter import *
from ttk import *
from DBcrud import DBConn
from food import Food
from traffic import Traffic
from other import Other
from news import News
from entertainment import Entertainment
from buy import Buy
from greeting import Greeting
from Main import Talk
import tkMessageBox

class GUIDemo(Frame):
    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.grid()
        self.createWidgets()
        self.e = None
        self.userinput = ""
        self.result = ""
        self.tmp=""
        
        
    def createWidgets(self):
        """
        self.menubar = Menu(self)
        self.filemenu = Menu(self.menubar , tearoff=0)
        self.filemenu.add_command(label="New",command=self.quitto)
        self.filemenu.add_command(label="Save as...",command=self.quitto)
        self.filemenu.add_command(label="Close",command=self.quitto)
        self.filemenu.add_separator()
        """


        self.inputText = Label(self)
        self.inputText["text"] = "輸入你要講的話:"
        self.inputText.grid(row=0, column=0,)
        self.inputField = Entry(self)
        self.inputField["width"] = 100
        self.inputField.grid(row=0, column=1, padx=2,pady=2)
 
        self.outputText = Label(self)
        self.outputText["text"] = "對話框:"
        self.outputText.grid(row=1, column=0)
        self.outputField = Text(self)
        self.outputField["width"] = 50
        self.outputField["height"] = 50
        self.outputField.grid(row=1, column=1,sticky="nsew",padx=2,pady=2)
        
        self.sc=Scrollbar(self,command=self.outputField.yview)
        self.sc.grid(row=1,column=2, sticky='nsew')
        self.outputField['yscrollcommand'] = self.sc.set
        
        self.inserting = Button(self)
        self.inserting["text"] = "送出"
        self.inserting["command"]=self.clickOK
        self.inserting.grid(row=0, column=3)
        
        self.clearing = Button(self)
        self.clearing["text"] = "清除"
        self.clearing["command"]=self.clear
        self.clearing.grid(row=1, column=3,columnspan=20)

        self.quiting = Button(self)
        self.quiting["text"] = "退出"
        self.quiting["command"]=self.quitto
        self.quiting.grid(row=2, column=3,columnspan=20)
        

 
        self.displayText = Label(self)
        self.displayText["text"] = "something happened"
        self.displayText.grid(row=2, column=0, columnspan=7)

       
        
    def clickOK(self):
        self.userinput = self.inputField.get()
        if self.userinput == "":
            self.displayText["text"] = "你沒輸入任何東西喔"
        else:
            if self.e == None:
                self.displayText["text"] = "有點問題，請重開"
            else:
                self.tmp = self.userinput
                self.outputField.insert(INSERT,'You: '+self.tmp+'\n')
                self.result = self.e.getsentence(self.tmp)
                self.outputField.insert(INSERT,'Computer: '+self.result+'\n')
                self.displayText["text"] = "訊息成功送達"
    def clear(self):
        self.userinput = ""
        self.inputField.delete(0, 200)
        self.displayText["text"] = "輸入框已清除"
    def newMethod(self):
        self.e = Talk() 
        self.displayText["text"] ="初始中..."
    def quitto(self):
        tkMessageBox.showinfo("Quit?", "Are you sure to quit?")
        self.master.destroy()    
        



       

if __name__ == '__main__':
    root = Tk()
    #root.geometry("+10+10")
    
    app = GUIDemo(master=root)
    app.newMethod()
    app.master.resizable(0,0)
    app.master.title("聊天室")
    app.mainloop()

   
