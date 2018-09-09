package com.dzj.template.method.pattern.extension;

public abstract class HummerModel {
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

	// 那模型应该会跑吧
	final public void run() {
		// 先发动汽车
		this.start();
		// 引擎开始轰鸣
		this.engineBoom();
		// 如果碰到障碍物，可以按喇叭
		if (this.isAlarm()) {
			this.alarm();//喇叭
		}
		//到达目的地就停车
		this.stop();
	}

	// 钩子方法，默认喇叭是会响的
	protected boolean isAlarm() {
		return true;
	}
}
//注释：在抽象类中，isAlarm是一个实现方法。其作用是模版方法根据其返回值决定是否要响喇叭，子类可以覆写该返回值。