package com.dzj.entity;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = -1929551087014775249L;
	
	private Framwork framwork;
	
	Car(int size){
		this.framwork  = new Framwork(size);
	}
    public void run(){
    	System.out.println("小车的大小:"+framwork.getBottom().getTire().getSize()+"米"+" "+"小车跑起来啦");
    }
}
