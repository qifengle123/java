package com.dzj.test.controller;
/**
 * 模拟一个Servlet组件
 * **/
public class LoginServlet {
   private static String usernameRef;
   private static String passwordRef;
   //解决非线程安全==synchronized
    synchronized public static void doPost(String username, String password){
	   try {
	   usernameRef = username;
	   if(username.equals("a")){
			Thread.sleep(5000);
		} 
	   passwordRef = password;
	   System.out.println("username=" + usernameRef +"===="+ "passwrod=" + password);
	   }catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
   }
}
