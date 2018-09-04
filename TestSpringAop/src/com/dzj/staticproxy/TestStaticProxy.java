package com.dzj.staticproxy;

public class TestStaticProxy {
	public static void main(String[] args) {
		   //代理对象
           UserDaoProxy userDaoProxy = new UserDaoProxy();
           //执行代理方法
           userDaoProxy.save();
           userDaoProxy.find();
	}
}
