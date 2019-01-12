package com.dzj.testSuper;

public class Chinese extends Person{
   Chinese(){
	   super();//调用父类构造方法
	   prt("子类.调用父类无参构造方法"+"A chinese coder.");
   }
   Chinese(String name){
	  super(name);//调用父类具有相同形参的构造方法（2）
	  prt("子类.调用父类含一个参数构造方法"+"his name is"+name);
   }
   Chinese(String name, int age){
	   this(name);//调用具有相同行参的构造方法(3)
	   prt("子类.调用子类具有相同形参的构造方法：his age is" + age);
   }
}
