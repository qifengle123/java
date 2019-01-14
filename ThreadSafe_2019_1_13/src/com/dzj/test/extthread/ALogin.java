package com.dzj.test.extthread;

import com.dzj.test.controller.LoginServlet;
//线程A
public class ALogin extends Thread{
   @Override
   public void run(){
	   LoginServlet.doPost("a", "aa");//类直接调用静态方法
   }
}
