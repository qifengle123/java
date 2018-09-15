package com.dzj.command.mode;

//在一个项目中需求增加是非常常见的，那就把“增加需求”定义为一个命令AddRequirementCommand
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		// 找到需求组
		super.rg.find();
		// 增加一个需求
		super.rg.add();
		// 给出计划
		super.rg.plan();
	}

}
