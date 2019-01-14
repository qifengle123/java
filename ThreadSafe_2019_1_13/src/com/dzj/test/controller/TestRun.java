package com.dzj.test.controller;

import com.dzj.test.extthread.ALogin;
import com.dzj.test.extthread.BLogin;

public class TestRun {
   public static void main(String[] args) {
	  ALogin alogin = new ALogin();
	  alogin.start();
	  BLogin bLogin = new BLogin();
	  bLogin.start();
	  
}
}
