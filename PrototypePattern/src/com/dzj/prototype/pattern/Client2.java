package com.dzj.prototype.pattern;

import java.util.Random;

public class Client2 {
	// 发送账单的数量，这个值是从数据库中获得。
	private static int MAX_COUNT = 6;

	public static void main(String[] args) throws CloneNotSupportedException {
		// 模拟发送邮件
		int i = 0;
		// 把模版定义出来，这个是从数据库中获得的
		Mail2 mail = new Mail2(new AdvTemplate());
		mail.setTail("xx银行版权所有");	
		while (i < MAX_COUNT) {
			// 以下是对每封邮件不同的地方
			Mail2 clone = (Mail2)mail.clone();
			clone.setAppellation(getRandString(5) + "先生（女士）");
			clone.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 然后发送电子邮件
			sendMail(mail);
			i++;
		}
		System.out.println("测试："+getRandString(8));
	}

	// 发送邮件
	public static void sendMail(Mail2 mail) {
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
