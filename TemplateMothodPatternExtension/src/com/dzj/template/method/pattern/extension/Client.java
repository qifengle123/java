package com.dzj.template.method.pattern.extension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 模版方法模式：在模版方法模式中按照一定规则和顺序调用基本方法。
 * */
public class Client {
   public static void main(String[] args) throws IOException {
	   System.out.println("======H1型号悍马=======");
	   System.out.println("H1型号的悍马是否需要喇叭?0-不需要  1-需要");
	   String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	   HummerH1Model h1 = new HummerH1Model();
	   if(type.equals("0")){
		  h1.setAlrm(false);
	   }
	   h1.run();
	   System.out.println("======H2型号悍马=======");
	   HummerH2Model h2 = new HummerH2Model();
	   h2.run();
}
}
/**注意：h1型号的悍马是由客户控制是否按喇叭。也就是说外界方法的改变影响到模版方法的执行。
 * 在我们的抽象类中isAlarm的返回值就是影响了模版方法的执行结果，该方法叫：钩子方法(Hook Method)
 * 有了钩子方法的模版方法才算完美。
 * 
 */
