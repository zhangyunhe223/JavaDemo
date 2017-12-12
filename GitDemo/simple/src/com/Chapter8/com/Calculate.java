package com.Chapter8.com;

public class Calculate {
	/*
	 * 定义一个人名称为calculate的类
	 * 定义一个用于表示圆周率的常量PI
	 * 该类中定义两个方法getArea()
	 * 以及两个方法draw()的方法
	 */
	private float PI = 3.14159f;
	
	// 求圆形的面积
	public float getArea(float r) {
		float area = PI * r * r;
		return area;
	}
	// 求矩形的面积
	public float getArea(float l,float w) {
		float area = l * w;
		return area;
	}
	// 画任意形状的图形
	public void draw(int num) {
		System.out.println("画" + num + "个任意形状的图形");
	}
	// 画指定的形状图形
	public void draw(String shape) {
		System.out.println("画一个" + shape);
	}
}
