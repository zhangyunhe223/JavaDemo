package com.Chapter8.com;

public class Rectangle extends Shape {
	/*
	 * 定义长方形的上和宽
	 * length
	 * width
	 */
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		// 获得矩形的长和宽
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// 计算长方形的面积
		return length * width;
	}

}
