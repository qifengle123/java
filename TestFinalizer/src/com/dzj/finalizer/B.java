package com.dzj.finalizer;

public class B extends A{
	 
	 @Override
     public void finalize(){
    	 System.out.println("B finalize by the finalizer method");
     }
}
