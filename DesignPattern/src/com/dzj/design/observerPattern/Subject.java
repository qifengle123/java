package com.dzj.design.observerPattern;

import java.util.ArrayList;
import java.util.List;

import com.dzj.design.observerPattern.inter.Observer;

/**
 * 抽象被观察者代码如下： 灰太郎具有被观察者属性 ，喜羊羊（羊咩咩）一直都在观察灰太狼，羊咩咩是观察者。
 */
public class Subject {
	/**
	 * 观察者对象的集合
	 **/
	private List<Observer> observerList = new ArrayList<>();

	/**
	 * 登记观察者(增加观察者)
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		observerList.add(observer);
		System.out.println("增加了观察者:" + " "+observer.getName());

	}

	/**
	 * 删除观察者
	 * 
	 * @param observer
	 **/
	public void dettach(Observer observer) {
		observerList.remove(observer);
		System.out.println("删除了观察者：" +" "+observer.getName());
	}

	/**
	 * 通知所有观察者
	 **/
	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update("灰太狼要搞事情了");
		}
	}
}
