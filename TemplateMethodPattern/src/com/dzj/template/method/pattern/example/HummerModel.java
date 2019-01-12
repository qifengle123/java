package com.dzj.template.method.pattern.example;

public abstract class HummerModel {
	/**
	 * 首先，这个模型要能发动起来，别管是手动发动还是电力发动，反正
	 * 是能够发动起来，那这个实现要在实现类里了。
	 * **/
    public abstract void start();
    //能停
    public abstract void stop();
    //喇叭
    public abstract void alarm();
    //引擎会轰隆隆地响
    public abstract void engineBoom();
    //模型需要会跑 一般防止恶意操作，一般模版方法都加上final关键字，不允许被覆盖。
    final public  void run(){
    	//先发动汽车
    	this.start();
    	//引擎开始轰鸣
    	this.engineBoom();
    	//然后就开始跑了，跑的时候遇到一条狗挡路，就按喇叭。
    	this.alarm();
    	//到达目的地就停车
    	this.stop();
    }
}
