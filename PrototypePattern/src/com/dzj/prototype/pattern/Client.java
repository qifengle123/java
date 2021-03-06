package com.dzj.prototype.pattern;

import java.util.Random;

public class Client {
	// 发送账单的数量，这个值是从数据库中获得。
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模版定义出来，这个是从数据库中获得的
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx银行版权所有");
		while (i < MAX_COUNT) {
			// 以下是对每封邮件不同的地方
			mail.setAppellation(getRandString(5) + "先生（女士）");
			mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 然后发送电子邮件
			sendMail(mail);
			i++;
		}
	}
    /**
     * 存在的问题：这是一个线程在运行，发送是单线程的，那按照一封邮件发出去需要0.05s，600万封邮件需要33小时，一天发布不完
     * 今天没发完，明天的账单又产生了。
     * 解决办法：sendMail()设置为多线程
     * 另一种解决办法：使用一种新的模式，通过对象的复制功能解决，实现Cloneable接口，java自带的接口，Mail2类实现接口，覆写该方法。
     * 
     * */
	// 发送邮件
	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t..发送成功！！！");
	}
    
	// 获得指定长度的随机字符串
	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSKUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
