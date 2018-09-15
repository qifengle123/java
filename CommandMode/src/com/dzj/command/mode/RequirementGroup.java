package com.dzj.command.mode;
//需求组
public class RequirementGroup extends Group{

	@Override
	public void find() {
		// 客户要求需求组过去和他们谈
		System.out.println("找到需求组。。。");
		
	}

	@Override
	public void add() {
		// 客户要求增加一项需求
		System.out.println("客户要求增加一项需求。。。");
	}
   
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求删除一项需求。。。");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求修改一项需求。。。");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求需求变更计划。。。");
	}

}
