package com.dzj.builder.partter;

import java.util.ArrayList;

/**
 * 场景类
 * */
public class Client {
   public static void main(String[] args) {
	  /**
	   * 客户告诉公司，我要这样一个模型，然后xx公司就告诉老大
	   * */
	   //存放run的顺序
	   ArrayList<String> sequence = new ArrayList<String>();
	   sequence.add("engine boom");
	   sequence.add("start");
	   sequence.add("stop");
	   //要一个奔驰
	   BenzBuilder benzBuilder = new BenzBuilder();
	   //把顺序给这个builder类，制造出这样一个车出来
	   benzBuilder.setSequence(sequence);
	   BenzModel benz = (BenzModel)benzBuilder.getCarModel();
	   benz.run();
}
}
