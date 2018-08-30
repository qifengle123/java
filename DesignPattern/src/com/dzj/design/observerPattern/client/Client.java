package com.dzj.design.observerPattern.client;

import com.dzj.design.observerPattern.observed.Wolf;
import com.dzj.design.observerPattern.specific.observer.PleasantSheep;

/**
 * 客户端
 **/
public class Client {
	public static void main(String[] args) {
		// 灰太狼--被观察者
		Wolf wolf = new Wolf();
		// 喜羊羊--观察者
		PleasantSheep pleasantSheep = new PleasantSheep();
		// 登记观察者
		wolf.attach(pleasantSheep);
		// 灰太狼入侵
		wolf.invade();
	}

}
