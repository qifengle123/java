package com.dzj.thread.test;
/**
 * 创建一个自定义的线程类MyThread继承Thread 并且重写run方法，，，在run方法中写线程要执行的任务代码。
 * **/
public class MyThread extends Thread{
       @Override
       public void run(){
    	   super.run();
    	   System.out.print("MyThread");
       }
}
