package com.dzj.builder.partter;

import java.util.ArrayList;
/**
 * 抽象汽车组装者
 * 增加一个CarBuilder抽象类，由它组装各个车模，要什么类型什么顺序的车辆模型，由相关子类完成
 * */
public abstract class CarBuilder {
	// 建造一个模型，你要给我一个顺序要，就是组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	//设置完毕顺序后，就可以直接拿到这个车辆模型
	public abstract CarModel getCarModel();
}
