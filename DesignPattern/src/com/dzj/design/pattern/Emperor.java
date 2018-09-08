package com.dzj.design.pattern;

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
