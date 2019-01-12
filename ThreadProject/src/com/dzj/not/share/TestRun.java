package com.dzj.not.share;

public class TestRun {
	public static void main(String[] args) {
       MyThread a = new MyThread("A");
       MyThread b = new MyThread("B");
       MyThread c = new MyThread("C");
       a.start();
       b.start();
       c.start();
       
	}
}
