package com.dzj.template.method.pattern.example;

/**
 * 每个型号的悍马实现是不同的，H1型号的悍马代码实现如下
 **/
public class HummerH1Model extends HummerModel {

	@Override
	public void start() {
		
		System.out.println("悍马H1发动");
	}

	@Override
	public void stop() {
		
		System.out.println("悍马H1停止");
	}

	@Override
	public void alarm() {
		
		System.out.println("悍马H1鸣笛");
	}

	@Override
	public void engineBoom() {
		
		System.out.println("悍马H1引擎轰鸣声");
	}
    
}
