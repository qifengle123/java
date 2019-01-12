package com.dzj.test.thread.random;

public class MyThreadTwo extends Thread{
	
       private int i;
       
       public MyThreadTwo(int i){
    	   super();
    	   this.i = i;
       }
       @Override
       public void run(){
    	   System.out.println(i);
       }
}
