package com.dzj.builder.partter;

import java.util.ArrayList;
/**
 * 给定一个汽车的顺序，然后返回一辆奔驰车
 * */
public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
         this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
	
		return this.benz;
	}

}
