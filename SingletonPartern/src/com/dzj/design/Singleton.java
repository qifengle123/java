package com.dzj.design;

public class Singleton {
	 //限制产生多个对象
     private static final Singleton singleton = new Singleton();
     //通过该方法获得实例对象
     private Singleton(){
    	 
     }
     public static Singleton getInstance(){
    	 return singleton;
     }
     //类中其他方法，尽量是static
     public static void doSometing(){
    	 
     }
}
