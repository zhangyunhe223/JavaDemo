package com.Chapter8.com;

public class Circle extends Shape {
	/*
	 * ����һ��Բ�ΰ뾶radius
	 */
	private double radius;
	
	public Circle(double radius) {
		// ��ȡԲ�εİ뾶
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// ����Բ�ε����
		return Math.PI * Math.pow(radius, 2);
	}

}
