package com.Chapter8.com;

public class Rectangle extends Shape {
	/*
	 * ���峤���ε��ϺͿ�
	 * length
	 * width
	 */
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		// ��þ��εĳ��Ϳ�
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// ���㳤���ε����
		return length * width;
	}

}
