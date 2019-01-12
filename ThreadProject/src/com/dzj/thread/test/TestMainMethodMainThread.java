package com.dzj.thread.test;
/**
 * 一个名称叫作main的线程在执行main()方法中的代码
 * **/
public class TestMainMethodMainThread {
       public static void main(String[] args) {
		      System.out.println(Thread.currentThread().getName());
	}
}
