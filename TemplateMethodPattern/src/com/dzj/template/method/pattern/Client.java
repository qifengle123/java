package com.dzj.template.method.pattern;

public class Client {
     public static void main(String[] args){
    	 AbstractClass concreateClass1 = new ConcreateClass1();
    	 AbstractClass concreateClass2 = new ConcreateClass2();
    	 //调用模版方法
    	 concreateClass1.templateMethod();
    	 concreateClass2.templateMethod();
     }
}
