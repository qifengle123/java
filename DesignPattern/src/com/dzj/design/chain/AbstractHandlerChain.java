package com.dzj.design.chain;

public abstract class AbstractHandlerChain {
	   /**
	    * 处理 责任链
	    * 
	    * **/
       protected AbstractHandlerChain successor;
       
       public AbstractHandlerChain getHandlerChain(){
    	   return this.successor;
       }
       /**
        * 业务处理
        *    具体的业务处理方法（需要根据自己的业务处理 设计 入参和返回参数）
        * 
        * */
       public abstract void handleChain(double discount);
       
       /**
        * 设置一下 处理对象
        * @param successor
        * */
       public void setHandlerChain(AbstractHandlerChain successor){
    	    this.successor = successor;
       }
}
