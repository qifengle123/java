package com.dzj.testSuper;

public class Person {
   public static void prt(String s){
	  System.out.println(s);
   }
   Person(){
	   prt("父类.无参数构造方法"+"A person");
   }//构造方法(1)
   Person(String name){
	   prt("父类.含一个参数构造方法"+"A person name is"+name);
   }//构造方法(2)
}
