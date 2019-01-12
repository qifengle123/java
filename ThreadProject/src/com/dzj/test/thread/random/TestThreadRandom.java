package com.dzj.test.thread.random;

public class TestThreadRandom {
	public static void main(String[] args) throws InterruptedException {
           MyThreadRandom thread = new MyThreadRandom();
           thread.setName("myThread");
           thread.start();
           for(int i = 0; i<10; i++){
        	   int time = (int) (Math.random() * 1000);
        	   Thread.sleep(time);
        	   System.out.println("main=" + Thread.currentThread().getName());
           }
	}
}
