package com.Chapter9.com;

public abstract class Fruit {
	/*
	 * ����һ��������
	 * Ϊˮ����Fruit
	 * �ڸ����ж���һ�����󷽷�
	 * ͬʱ����������ͨ����д�ķ���ʵ�ֳ��󷽷�
	 */
	public String color;
	// ��ӹ��췽��
	public Fruit() {
		color = "��ɫ";
	}
	public abstract void harvest();
}
