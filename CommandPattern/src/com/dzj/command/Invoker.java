package com.dzj.command;

public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	// 执行命令
	public void action() {
		this.command.execute();
	}
}
