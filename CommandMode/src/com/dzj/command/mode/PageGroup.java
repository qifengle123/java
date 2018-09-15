package com.dzj.command.mode;
//美工组
public class PageGroup extends Group{
	// 客户要求美工组过去和他们谈
	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("找到美工组。。。");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("客户要求增加一个页面。。。");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求删除一个页面。。。");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求修改一个页面。。。");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求给出变更计划。。。");
	}

}
