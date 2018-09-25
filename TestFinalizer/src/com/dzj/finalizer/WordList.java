package com.dzj.finalizer;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
//依赖于String实现Comparable接口，去掉了命令行参数列表中的重复参数,并按字母顺序打印出来。
//java平台类库中所有值类都实现了Comparable接口。
public class WordList {
     public static void main(String[] args) {
		  Set<String> treeSet = new TreeSet<String>();
		  treeSet.add("abc");
		  treeSet.add("abc");
		  treeSet.add("def");
		  treeSet.add("aaa");
		  Collections.addAll(treeSet, args);
		  System.out.println(treeSet);
	}
}
