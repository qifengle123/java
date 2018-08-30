package com.dzj.design.observerPattern.specific.observer;

import com.dzj.design.observerPattern.inter.Observer;

public class LazySheep implements Observer {

	@Override
	public String getName() {
		
		return "懒羊羊";
	}

	@Override
	public void update(String msg) {
		
        System.out.println("懒羊羊收到通知：" + " " + msg);
	}

}
