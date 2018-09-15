package com.dzj.mediator.pattern;

public class ConcreteColleague1 extends Colleague{
    //通过构造函数传递中介者
	public ConcreteColleague1(Mediator _mediator) {
		super(_mediator);
	}
    //自有方法 self-method
	public void selfMethod1(){
		//处理自己的业务逻辑
	}
	//依赖方法 dep-method
	public void depMethod1(){
		//处理自己的业务逻辑
		//自己不能处理的业务委托给中介者
		super.mediator.doSomething1();
	}
	
	
}
