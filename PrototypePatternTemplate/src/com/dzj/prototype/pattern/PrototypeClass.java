package com.dzj.prototype.pattern;
/**
 * 原型模式通用模版
 * 实现一个接口，然后重写clone方法，就完成了原型模式。
 * 一个实现了Cloneable并重写了clone方法的类A，有一个无参构造或有参构造B，通过new关键字产生一个对象S，再然后S.clone()产生一个新的对象T，
 * 那么在对象拷贝时，构造函数B是不会被执行的。
 * **/
public class PrototypeClass implements Cloneable{
	   //覆写父类Object方法 
	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
