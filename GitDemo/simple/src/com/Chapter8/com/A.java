package com.Chapter8.com;

public abstract class A {
	/* 
	 * ����һ�������࣬��֤���Ƿ����ʵ��������
	 * ���󷽷�play()
	 * ���췽��HomeWork01()
	 */
	private String string;
	
	public A(String string) {
		System.out.println("�����Ѿ�ʵ������");
		this.string = string;
		System.out.println(string);
	}
	public abstract void play();
}
