package com.dzj.template.method.pattern.extension;
/**
 * 扩展后的H1悍马
 * */
public class HummerH1Model extends HummerModel {
	// 要响喇叭
	private boolean alarmFlag = true;

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

	public boolean isAlarm() {
		return this.alarmFlag;
	}
    //要不要响喇叭，是由客户来决定的。
	public void setAlrm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
	
}
