package com.Chapter8.com;

public abstract class RedTea extends Tea {
	/*
	 * 分别创建构造方法
	 */
	private int i = 1;
	@Override
	void testTea() {
		System.out.println("testAbstract()" + i);
	}
	public RedTea() {
		System.out.println(i);
	}
}
