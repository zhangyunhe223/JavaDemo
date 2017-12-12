package com.Chapter7.com;

import java.awt.Color;

public class Cat {
	/*
	 * 重新计算对象的哈希码 
	 * 定义4个成员变量分别表示猫咪的名字、年龄、重量和颜色
	 */
	private String name;
	private int age;
	private double weight;
	private Color color;

	// 初始化猫咪的属性
	public Cat(String name, int age, double weight, Color color) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
	// 重写hashCode()方法
	@Override
	public int hashCode() {
		return 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 13 * new Double(weight).hashCode()
				+ 17 * color.hashCode();
	}

	// 利用属性来判断猫咪的是否相同
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat cat = (Cat) obj;
		// 比较猫咪的属性
		return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && (color.equals(cat.color));
	}

}
