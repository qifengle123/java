package com.dzj.test.thread.random;
/**
 * 测试start()方法的顺序不代表线程启动的顺序
 * */
public class TestMyThreadTwo {
	public static void main(String[] args) {
		
          MyThreadTwo th1 = new MyThreadTwo(1);
          MyThreadTwo th2 = new MyThreadTwo(2);
          MyThreadTwo th3 = new MyThreadTwo(3);
          MyThreadTwo th4 = new MyThreadTwo(4);
          MyThreadTwo th5 = new MyThreadTwo(5);
          MyThreadTwo th6 = new MyThreadTwo(6);
          MyThreadTwo th7 = new MyThreadTwo(7);
          MyThreadTwo th8 = new MyThreadTwo(8);
          MyThreadTwo th9 = new MyThreadTwo(9);
          MyThreadTwo th11 = new MyThreadTwo(10);
          MyThreadTwo th12 = new MyThreadTwo(11);
          MyThreadTwo th13 = new MyThreadTwo(12);
          MyThreadTwo th14 = new MyThreadTwo(13);
          th1.start();
          th2.start();
          th3.start();
          th4.start();
          th5.start();
          th6.start();
          th7.start();
          th8.start();
          th9.start();
          th11.start();
          th12.start();
          th13.start();
          th14.start();
	}
}
