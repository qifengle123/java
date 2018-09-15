package com.dzj.command.mode;

public class CancelDeletePageCommand extends Command{
    //撤销删除一个页面的命令
	@Override
	public void execute() {
		   super.pg.rollBack();
	}

}
