package com.Chapter8.com;

public abstract class RedTea extends Tea {
	/*
	 * �ֱ𴴽����췽��
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
