package com.Chapter8.com;

public interface ICalculate {
	/*
	 * ����һ�����ڼ���Բ�Ľӿ�ICalculate
	 * �ڸýӿ��ж���һ������PI����������
	 * ����һ�����ڼ�������ķ���getArea()
	 * ����һ�����ڼ����ܳ��ķ���getCircumference()
	 */
	final float PI = 3.14159f;
	float getArea(float r);
	float getCircumference(float r);
}
