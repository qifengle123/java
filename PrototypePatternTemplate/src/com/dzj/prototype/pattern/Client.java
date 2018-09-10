package com.dzj.prototype.pattern;

public class Client {
	public static void main(String[] args) {
		//产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        Thing cloneThting = thing.clone();
	}
	/**注释：对象拷贝时，构造函数确实没有执行，Object类的clone方法的原理是从内存中（堆内存）以二进制流方式进行拷贝，重新分配一个内存块，那么
	构造函数没有执行也是正常的。
	*/
}
