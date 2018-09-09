package com.dzj.builder.partter;

public class BenzModel extends CarModel{

	@Override
	protected void alarm() {
		System.out.println("悍马H1鸣笛。。。");
	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马H1引擎声音。。。");
	}

	@Override
	protected void start() {
		System.out.println("悍马H1发动。。。");
	}

	@Override
	protected void stop() {
		System.out.println("悍马H1停车。。。");
	}
      
}
