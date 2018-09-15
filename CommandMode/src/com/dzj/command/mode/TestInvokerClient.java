package com.dzj.command.mode;

public class TestInvokerClient {
//	public static void main(String[] args) {
//          //定义我们的接班人
//	      Invoker qifengle = new Invoker();//接头人：起风了
//	      //客户要求增加一项需求
//	      System.out.println("------客户要求增加一项需求------");
//	      Command addRequirementCommand = new AddRequirementCommand();
//	      //客户给我们下命令
//	      qifengle.setCommand(addRequirementCommand);
//	      //接头人执行命令
//	      qifengle.action();
//	}
	/**
	 * 引入命令模式，场景类简单了很多，客户只要给出命令，我马上执行。
	 ****/
	//如果客户要求删除一个页面
	public static void main(String[] args) {
		Invoker qifengle2 = new Invoker();
		//客户要求删除一个页面
		Command deletePageCommand = new DeletePageCommand();
		qifengle2.setCommand(deletePageCommand);
		//接头人执行命令
		qifengle2.action();
	}
}
