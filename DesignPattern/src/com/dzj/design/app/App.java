package com.dzj.design.app;

import com.dzj.design.chain.AbstractHandlerChain;
import com.dzj.design.chain.HandlerChainSales;

/**
 * @author liuxiangqian
 * */
public class App {
       public static void main(String[] args) {
		    AbstractHandlerChain chain = new HandlerChainSales();
		    chain.handleChain(10);
		    chain.handleChain(300);
		    chain.handleChain(2000);
	}
}
