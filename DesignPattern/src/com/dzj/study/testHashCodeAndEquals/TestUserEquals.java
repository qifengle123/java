package com.dzj.study.testHashCodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestUserEquals {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("张三");
		user1.setIdCard("520");
		user1.setAge(12);

		User user2 = new User();
		user2.setName("张三");
		user2.setAge(12);
		user2.setIdCard("520");
		System.out.println("user1.equals(user2):" + " " + user1.equals(user2));

		// 在两个对象equals的情况下进行把他们分别放入Map和Set中
		@SuppressWarnings("rawtypes")
		Set set = new HashSet();
		set.add(user1);
		set.add(user2);

		Map map = new HashMap();
		map.put("user1", user1);
		map.put("user2", user2);
		System.out.println("set 长度" + set.size());
		System.out.println("map 长度" + map.keySet().size());
		/**
		 * 明明user1和user2两个对象是equals的那么为什么把他们放到set中会有两个对象 （Set特性是不允许重复数据的），
		 * 还有Map也把两个同样的对象当成了不同的Key（Map的Key是不允许重复的，相同Key会覆盖）；
		 * 原因是user1和user2的hashcode 不一样导致的；
		 * 
		 **/
		/**
		 * 因为我们没有重写父类（Object）的hashcode方法,Object的hashcode方法会根据两个对象的地址生成对相应的hashcode；
		 * user1和user2是分别new出来的，那么他们的地址肯定是不一样的，自然hashcode值也会不一样。
		 **/
		/**
		 * Set区别对象是不是唯一的标准是，两个对象hashcode是不是一样，再判定两个对象是否equals;
		 * 
		 * 
		 **/
		/**
		 * Map 是先根据Key值的hashcode分配和获取对象保存数组下标的，然后再根据equals区分唯一值（详见下面的map分析）
		 **/
		// 测试hashMap HashSet
		System.out.println("user1的hashcode" + user1.hashCode());
		System.out.println("user2的hashcode" + user2.hashCode());

	}
}
