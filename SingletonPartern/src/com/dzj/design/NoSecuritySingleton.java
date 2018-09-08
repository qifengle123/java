package com.dzj.design;

/**
 * 在高并发情况下，注意单例模式的线程同步问题。 单例模式有几种实现方式：懒汉式模式 线程不安全
 **/
public class NoSecuritySingleton {
	private static NoSecuritySingleton singleton = null;

	// 限制产生多个对象
	private NoSecuritySingleton() {

	}

	// 通过该方法获得实例对象
	public static NoSecuritySingleton getSingleton() {
		if (singleton == null) {
			singleton = new NoSecuritySingleton();
		}
		return singleton;

	}
	/**
	 * 该单例模式在低并发的情况下尚不会出现问题，若系统压力增大，并发量增加时则可能
	 * 在内存中出现多个实例，破坏了最初的预期。原因：如一个线程A执行到singleton =new NoSecuritySingleton(),但是还没
	 * 有获得对象（对象初始化需要时间），第二个线程B也在执行，执行到singleton==null判断，那么线程B获得判断条件也为真，于是继续运行下去，
	 * ，线程A获得一个对象，线程B也获得一个对象，在内存中就出现两个对象。
	 * 解决办法：在getSingleton()方法前加synchronized关键字或者在getSingleton()方法内增加synchronized实现。
	 * 
	 * **/
}
