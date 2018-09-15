package com.dzj.command.mode;

public class Client {
	// 首先客户找到需求组说，过来谈需求，并修改
	public static void main(String[] args) {
		System.out.println("------客户要求增加一项需求-------");
		Group requirementGroup = new RequirementGroup();
		//找到需求组
		requirementGroup.find();
		//增加一个需求
		requirementGroup.add();
		//要求需求变更计划
		requirementGroup.plan();
	}

}
