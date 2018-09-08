package com.dzj.design.chain;
/**
 *@author dzj-admin
 *设计两个业务处理对象 导购员(HandlerChainSales) 经理() 都继承处理责任链
 *导购员：
 *1.优惠 100元
 *2.如果再高的话 只能请示经理
 * */
public class HandlerChainSales extends AbstractHandlerChain {

	@Override
	public void handleChain(double discount) {
		if (discount < 100) {
			System.out.println("Sales 可以成交。" + discount);
		}else{
			//请示经理
			setHandlerChain(HandlerChainStaticFactory.createHandlerChainManager());
			//设置下一个处理  
			successor.handleChain(discount);
		}
	}
}
