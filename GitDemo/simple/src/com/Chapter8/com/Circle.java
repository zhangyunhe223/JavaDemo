package com.Chapter8.com;

public class Circle extends Shape {
	/*
	 * 定义一个圆形半径radius
	 */
	private double radius;
	
	public Circle(double radius) {
		// 获取圆形的半径
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// 计算圆形的面积
		return Math.PI * Math.pow(radius, 2);
	}

}
