package com.dzj.singleton;
/**
 * 用私有构造器或者枚举类型强化Singleton属性
 * */
public class Elvis {
       public static final Elvis INSTANCE = new Elvis();
       private Elvis(){
    	   
       }
       public static Elvis getSingleton(){
    	      return INSTANCE;
       }
       public void leaveTheBuilding(){
    	    System.out.println("测试单例模式");
       }
       
}
