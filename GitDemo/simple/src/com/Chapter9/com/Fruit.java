package com.Chapter9.com;

public abstract class Fruit {
	/*
	 * 定义一个抽象类
	 * 为水果类Fruit
	 * 在该类中定义一个抽象方法
	 * 同时在其子类中通过重写的方法实现抽象方法
	 */
	public String color;
	// 添加构造方法
	public Fruit() {
		color = "绿色";
	}
	public abstract void harvest();
}
