package com.dzj.test.runnable;
/**
 * 使用Thread类的方式来开发多线程应用程序在设计上是有局限的，因为java是单继承，不支持多继承。可以实现Runnable
 * **/
public class Run {
	public static void main(String[] args) {
           MyRunnalble runnable = new MyRunnalble();
           Thread thread = new Thread(runnable);
           thread.start();
           System.out.println("运行结束!!!!");
	}
}
