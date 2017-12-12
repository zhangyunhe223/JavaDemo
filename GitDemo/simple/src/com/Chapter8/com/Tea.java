package com.Chapter8.com;

public abstract class Tea {
	/*
	 * 分别创建构造方法和抽象方法
	 * 抽象方法只有方法的声明，而没有方法的实现
	 */
	abstract void testTea();
	public Tea() {
		// 首先执行父类构造方法
		System.out.println("before testAbstract()");
		testTea();
		System.out.println("after  testAbstract()");
	}
}
