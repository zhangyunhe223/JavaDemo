package com.Chapter8.com;

public abstract class Tea {
	/*
	 * �ֱ𴴽����췽���ͳ��󷽷�
	 * ���󷽷�ֻ�з�������������û�з�����ʵ��
	 */
	abstract void testTea();
	public Tea() {
		// ����ִ�и��๹�췽��
		System.out.println("before testAbstract()");
		testTea();
		System.out.println("after  testAbstract()");
	}
}
