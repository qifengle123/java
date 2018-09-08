package com.dzj.design.chain;
/**
 * 经理设计
 * 优惠500
 * 再优惠我们就不出售了
 * 
 * **/
public class HandlerChainManager extends AbstractHandlerChain {

	@Override
	public void handleChain(double discount) {
		if (discount < 500) {
			System.out.println("Manager卖了" + discount);
		} else {
			System.out.println("看什么，不卖了");
		}

	}

}
