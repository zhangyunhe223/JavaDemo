package com.Chapter7.com;

public class HomeWork02 {
	
	// 定义长和宽 
	private double length;
	private double width;
	
	// 在构造方法中，将长和宽初始化
	public HomeWork02(double length,double width) {
		this.length = length;
		this.width = width;
	}
	// 定义一个成员方法求此矩形的面积
	public double getArea() {
		return this.length * this.width;
	}
}
