package com.Chapter8.com;

public abstract class Shape {
	/*
	 * ����һ�������࣬��ΪShape
	 * �����ж�����������
	 * һ����getName(),����ʹ�÷�����ƻ��������
	 * һ����getArea(),���󷽷�
	 */
	public String getName() {
		// ����ʹ�÷�����ƻ��������
		return this.getClass().getSimpleName();
	}
	public abstract double getArea();
}
