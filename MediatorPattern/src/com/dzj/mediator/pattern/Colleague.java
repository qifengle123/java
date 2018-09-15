package com.dzj.mediator.pattern;
//抽象同事类  一般来说中介者模式中的抽象比较简单，是为了这个中介而服务的。
public class Colleague {
     protected Mediator mediator;
     public Colleague(Mediator _mediator){
    	    this.mediator = _mediator;
     }
}
