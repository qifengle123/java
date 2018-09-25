package com.dzj.finalizer;
//子类实现者覆盖了超类的终结方法，但是忘了调用超类的终结方法，那么超类的终结方法永远不会调用，，为了防止这样的情况发生，可以使用终结方法守卫者。
public class A {
	   //终结守卫者
       private final Object finalizerGuardian = new Object(){
           //终结守卫者的终结方法将被执行
    	   protected void finalize(){
        	   System.out.println("A finalize by the finalizerGuardian");

           }
       };
       
       @Override
       //由于终结方法被子类覆盖，该终结方法并不会执行。
       protected void finalize(){
    	   System.out.println("A finalize by the finalize method");
       }
       
       public static void main(String[] args) throws InterruptedException{
    	   B b = new B();
    	   b = null;
    	   System.gc();
    	   Thread.sleep(500);
       }
     
}
