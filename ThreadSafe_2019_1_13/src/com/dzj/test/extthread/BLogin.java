package com.dzj.test.extthread;

import com.dzj.test.controller.LoginServlet;
//线程B
public class BLogin extends Thread{
   @Override
   public void run(){
	  LoginServlet.doPost("b", "bb");
   }
}
