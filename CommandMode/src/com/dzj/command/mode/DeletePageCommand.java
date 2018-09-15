package com.dzj.command.mode;

public class DeletePageCommand extends Command {
	// 执行删除一个页面命令
	@Override
	public void execute() {
		// 找到页面组
		super.pg.find();
		// 删除一个页面
		super.pg.delete();
		// 给出计划
		super.pg.plan();

	}
    //Command抽象类可以有N个子类，如增加一个功能命令(AddRequirementCommand)，删除一份需求命令DeletePageCommand
}
