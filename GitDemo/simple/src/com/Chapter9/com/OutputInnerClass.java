package com.Chapter9.com;

public class OutputInnerClass extends ClassA.ClassB{
	/*
	 * 创建一个OutputInnerClass类，继承内部类ClassB
	 */
	public OutputInnerClass(ClassA a) {
		// 带参数的构造方法
		a.super();
	}
}
// 创建一个ClassA类以及内部类ClassB
class ClassA{
	class ClassB{
	}
}
