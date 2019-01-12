package com.dzj.intorduce.thisAndSuper;

public class City extends Country{
       String name;
       void value(){
    	   name = "shanghai";
    	   super.value();//调用父类的方法
    	   System.out.println(name);
    	   System.out.println(super.name);
       }
}
