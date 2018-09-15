package com.dzj.command.mode;
//调用命令
public class Invoker {
     //什么命令
	 private Command command;
	 //客户发出命令
	 public void setCommand(Command command){
		 this.command = command;
	 }
	 //执行客户的命令
	 public void action(){
		 this.command.execute();
	 }
}
