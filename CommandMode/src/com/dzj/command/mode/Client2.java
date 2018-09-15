package com.dzj.command.mode;
//场景2:客户找到美工组
public class Client2 {
	// 首先客户找到美工组说，过来谈页面，并修改
		public static void main(String[] args) {
			System.out.println("------客户要求增加一项需求-------");
			Group pageGroup = new PageGroup();
			//找到美工组
			pageGroup.find();
			//增加一个页面
			pageGroup.add();
			//要求页面变更计划
			pageGroup.plan();
		}
}
