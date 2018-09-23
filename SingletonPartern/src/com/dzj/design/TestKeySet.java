package com.dzj.design;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 * 对应一个给定的Map对象，实际上每次调用keySet都返回同样的Set实例。
 * */
public class TestKeySet {
     public static void main(String[] args) {
		   HashMap<String, String> map = new HashMap<String,String>();
		   map.put("01", "张三");
		   map.put("02", "lisi");
		   map.put("03", "wangwu");
		   //先获取map集合的所有的set集合，即为map中所有key值的集合
		   Set<String> keySet = map.keySet();//返回的是map对象的Set视图，包含map中所有键(key)
		   Iterator<String> iterator = keySet.iterator();
		   while(iterator.hasNext()){
			   String key = iterator.next();
			   //有了键可以通过map集合的get方法获取其对应的值
			   String value = map.get(key);
			   //获得key和value值
			   System.out.println("key:"+key+"===="+"value:"+value);
		   }
		   
	}
}
