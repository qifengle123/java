package com.dzj.design.observerPattern.client;

import com.dzj.design.observerPattern.observed.Wolf;
import com.dzj.design.observerPattern.specific.observer.LazySheep;
import com.dzj.design.observerPattern.specific.observer.PleasantSheep;

public class ClientThree {
	public static void main(String[] args) {
       //灰太狼--被观察者
		Wolf wolf = new Wolf();
		//喜羊羊--观察者
		PleasantSheep pleasantSheep = new PleasantSheep();
		//登记观察者
		wolf.attach(pleasantSheep);
		//懒羊羊--观察者
		LazySheep lazySheep = new LazySheep();
		//登记观察者
		wolf.attach(lazySheep);
		//灰太狼入侵
		wolf.invade();
		//删除观察者
		wolf.dettach(pleasantSheep);
		wolf.invade();
	}
}
