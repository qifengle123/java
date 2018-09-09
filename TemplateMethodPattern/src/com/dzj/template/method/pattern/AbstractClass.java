package com.dzj.template.method.pattern;
/**
 * 模版方法模式(Template Method Pattern)
 * 模版方法模式非常简单，仅仅使用java的继承机制，但它是一个应用非常广泛的模式。
 * AbstractClass：抽象模版
 * 方法分两类：
 * 基本方法：基本操作，是由子类实现的方法，并且在模版方法被调用。
 * 模版方法：可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
 * */
//抽象模版类
public abstract class AbstractClass {
     //基本方法
	 protected abstract void doSomething();
	 //基本方法
	 protected abstract void doAnything();
	 //模版方法
	 public void templateMethod(){
		 /**
		  * 调用基本的方法，完成相关的逻辑。
		  * **/
		 this.doAnything();
		 this.doSomething();
	 }
}
