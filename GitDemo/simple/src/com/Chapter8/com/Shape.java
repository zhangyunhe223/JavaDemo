package com.Chapter8.com;

public abstract class Shape {
	/*
	 * 创建一个抽象类，名为Shape
	 * 该类中定义两个方法
	 * 一个是getName(),用于使用反射机制获得类名称
	 * 一个是getArea(),抽象方法
	 */
	public String getName() {
		// 用于使用反射机制获得类名称
		return this.getClass().getSimpleName();
	}
	public abstract double getArea();
}
