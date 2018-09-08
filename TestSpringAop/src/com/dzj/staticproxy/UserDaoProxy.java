package com.dzj.staticproxy;
/**
 * 
 * @author qifengle
 * @Description:静态代理特点：1.目标对象必须实现接口 2.代理对象，要实现与目标对象一样的接口
 */
public class UserDaoProxy implements UserDao{
    //代理对象需要维护一个目标对象
	private UserTarget userTarget = new UserTarget();
	@Override
	public void save() {
		System.out.println("代理操作： 开启事务");
		userTarget.save();//执行目标对象的方法
		System.out.println("代理操作： 提交事务");
	}

	@Override
	public void find() {
		userTarget.find();
	}

}
