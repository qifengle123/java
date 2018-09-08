package com.dzj.design.observerPattern.inter;

/**
 * 抽象观察者
 **/
public interface Observer {
	String getName();

	/**
	 * 通知更新方法
	 * 
	 * @param msg
	 **/
	void update(String msg);

}
