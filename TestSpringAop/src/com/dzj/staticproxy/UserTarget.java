package com.dzj.staticproxy;

/**
 * @author dzj-admin
 * @Description:目标对象
 */
public class UserTarget implements UserDao{
    
	@Override
	public void save() {
		System.out.println("模拟：保存用户！！！！");
	}

	@Override
	public void find() {
		System.out.println("模拟：查询用户");
	}

}
