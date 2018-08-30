package com.dzj.design.observerPattern.observed;

import com.dzj.design.observerPattern.Subject;

public class Wolf extends Subject {
	public void invade() {
		System.out.println("灰太狼：我要搞事情");
		// 通知所有观察者
		notifyObserver();
	}
}
