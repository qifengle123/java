package com.dzj.design.pattern;
/**
 * 通过定义一个私有访问权限的构造函数，避免被其他类new出来一个对象，而
 * emperor自己则可以new一个对象出来
 * 其他类对该类的访问都可以通过getInstance获得同一个对象
 * **/
public class Emperor {
	  //初始化一个皇帝
      private static final Emperor emperor = new Emperor();
      //私有构造方法
      private Emperor(){
    	  
      }
      public static Emperor getInstance(){
    	  return emperor;
      }
      //皇帝发话了
      public static void say(){
    	  System.out.println("我就是皇帝");
      }
}
