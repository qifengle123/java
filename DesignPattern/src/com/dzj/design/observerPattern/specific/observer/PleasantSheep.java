package com.dzj.design.observerPattern.specific.observer;

import com.dzj.design.observerPattern.inter.Observer;

public class PleasantSheep implements Observer {

	@Override
	public String getName() {

		return "喜羊羊";
	}

	/**
	 * 具体业务逻辑
	 **/
	@Override
	public void update(String msg) {
		System.out.println("喜羊羊收到通知:" + " " + msg);
	}

}
