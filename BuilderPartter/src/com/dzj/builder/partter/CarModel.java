package com.dzj.builder.partter;

import java.util.ArrayList;

public abstract class CarModel {
	// 这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();

	/**
	 * 发动
	 */
	protected abstract void start();

	/**
	 * 能够停止
	 */
	protected abstract void stop();

	/**
	 * 可以按喇叭
	 */
	protected abstract void alarm();

	/**
	 * 引擎会轰隆隆的响
	 */
	protected abstract void engineBoom();

	final public void run() {
		// 循环，谁在前，就先执行
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) {
				this.start();
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop();
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				// 如果是engine boom 关键字
				this.engineBoom();
			}
		}
	}
	//把传递过来的值传递到类内
	final public void setSequence(ArrayList<String> sequence){
		this.sequence = sequence;
	}
}
