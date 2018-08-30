package com.dzj.design.chain;
/**
 * 静态工厂模式 提供
 * 业务bean的创建
 * */
public class HandlerChainStaticFactory {
       /**
        * 导购员
        * @return
        * */
	   public static HandlerChainSales createHandlerChainSales(){
		      return new HandlerChainSales();
	   }
	   
	   /**
	    * 经理
	    * @return
	    * */
	   public static HandlerChainManager createHandlerChainManager(){
		   return new HandlerChainManager();
	   }
}
