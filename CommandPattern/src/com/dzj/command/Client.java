package com.dzj.command;

public class Client {
      public static void main(String[] args) {
		//首先声明调用者 Invoker
    	Invoker invoker = new Invoker();
    	//定义接受者
    	ConcreteReciver1 receiver = new ConcreteReciver1();
    	//定义一个发送给接收者的命令
    	Command command = new ConcreteCommand1(receiver);
    	invoker.setCommand(command);
    	invoker.action();
	}
}
