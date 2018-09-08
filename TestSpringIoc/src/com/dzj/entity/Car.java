package com.dzj.entity;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = -1929551087014775249L;
	
	private Framwork framwork;
	
	Car(Framwork framwork){
		this.framwork  = framwork;
	}
	
    public Framwork getFramwork() {
		return framwork;
	}


	public void setFramwork(Framwork framwork) {
		this.framwork = framwork;
	}


	public void run(){
    	System.out.println("小车的大小："+framwork.getBottom().getTire().getSize()+"===="+"小车在跑");
    }
}
