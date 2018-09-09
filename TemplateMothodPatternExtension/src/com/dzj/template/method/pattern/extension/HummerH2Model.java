package com.dzj.template.method.pattern.extension;
/**
 * H2型号的悍马设置isAlarm()的返回值为false,关闭喇叭功能
 * */
public class HummerH2Model extends HummerModel{

	// 要响喇叭
		private boolean alarmFlag = true;

		@Override
		protected void alarm() {
			System.out.println("悍马H2鸣笛。。。");
		}

		@Override
		protected void engineBoom() {
			System.out.println("悍马H2引擎声音。。。");
		}

		@Override
		protected void start() {
			System.out.println("悍马H2发动。。。");
		}

		@Override
		protected void stop() {
			System.out.println("悍马H2停车。。。");
		}
		//要不要按喇叭，由客户来决定 默认没有喇叭的
		protected boolean isAlarm(){
			return false;
		}
		

}
