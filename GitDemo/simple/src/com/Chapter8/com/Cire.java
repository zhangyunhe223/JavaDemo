package com.Chapter8.com;

public class Cire implements ICalculate {
	/*
	 * ����ʵ��ICalculate�Ľӿ�
	 * @see com.Chapter8.com.ICalculate#getArea(float)
	 */

	@Override
	public float getArea(float r) {
		// ����һ�����ڼ�������ķ���getArea()
		float area = PI * r * r;
		return area;
	}

	@Override
	public float getCircumference(float r) {
		// ����һ�����ڼ����ܳ��ķ���getCircumference()
		float circumference = 2 * PI * r;
		return circumference;
	}
	
	public static void main(String[] args) {
		Cire cire = new Cire();
		float f1 = cire.getArea(2);
		float f2 = cire.getCircumference(3);
		System.out.println("Բ�����Ϊ��" + Float.toString(f1));
		System.out.println("Բ���ܳ�Ϊ��" + Float.toString(f2));
	}
}
