package com.Chapter8.com;

public class B extends A {

	public B(String string) {
		super(string);
		System.out.println("�����Ѿ�ʵ������");
	}

	@Override
	public void play() {
		System.out.println("��ʵ���˸���ķ���");
	}

}
