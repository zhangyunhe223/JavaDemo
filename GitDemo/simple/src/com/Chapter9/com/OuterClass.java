package com.Chapter9.com;

public class OuterClass {
	// 外部类方法doit()，返回值为内类使用,但外部类不可以直接访问内部类成员变量和方法
	InnerClass inner = new InnerClass();
	/*
	 * 在OuterClass类中定义一个内部类InnerClass
	 */
	
	// 定义一个外部类成员变量
	static int i = 0;
	
	public void outer() {
	// 定义一个外部类成员方法
	}
	public OuterClass() {
	// 外部类构造方法
	}
	// 静态内部类
	static class Inner{
		static String string;		
	}
	public class InnerClass{
		/*
		 * InnerClass为内部类
		 */
		// 内部类成员变量
		int i = 0;
		public void inner() {
			// 内部类成员方法,在内部类中可以直接存取外部类的成员变量和成员方法
			System.out.println("我是内部类中的成员方法");
			this.i++;
			OuterClass.this.i++;
			OuterClass.this.outer();
		}
		public InnerClass() {
			// 内部类构造方法
			System.out.println("我是内部类中的构造方法");
		}
	}
	private InnerClass doit() {
		/*
		 * 外部类方法，返回值为内类使用,但外部类不可以直接访问内部类成员变量和方法
		 * 所以，必须通过创建对象，来引用外部类的成员变量和成员方法
		 */
		inner.i = 2;
		inner.inner();
		return new InnerClass();
	}
	
	public static void main(String[] args) {
		/*
		 * 1.如果在外部类和非静态方法之外实例化对象，需要使用外部类.内部类的形式
		 * 2.如果不使用doit()方法返回内部类对象引用，可以直接使用内部类实例化内部类对象
		 * 但，由于是在主方法中实例化内部类对象，必须在new操作符之前提供一个外部类的引用
		 */
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in1 = out.doit();
		OuterClass.InnerClass in2 = out.new InnerClass();
	}
}
