package com.dzj.thread.test;

public class Run {
	public static void main(String[] args) {
          MyThread myThread = new MyThread();
          myThread.start();
          System.out.println("运行结束");
	}
}
