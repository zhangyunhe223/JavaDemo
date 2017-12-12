package com.Chapter7.com;

import java.awt.Color;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * 重新计算对象的哈希码 
		 * 定义4个成员变量分别表示猫咪的名字、年龄、重量和颜色
		 */
		Cat cat01 = new Cat("Java", 12, 21.5, Color.black);
		Cat cat02 = new Cat("C++", 12, 15.6, Color.BLUE);
		Cat cat03 = new Cat("Java", 12, 21.5,Color.black);
		
		System.out.println("猫咪1号的哈希码：" + cat01.hashCode());
		System.out.println("猫咪2号的哈希码：" + cat02.hashCode());
		System.out.println("猫咪3号的哈希码：" + cat03.hashCode());
		System.out.println("猫咪1号是否与猫咪2号相等：" + cat01.equals(cat02));
		System.out.println("猫咪1号是否与猫咪3号相等：" + cat01.equals(cat03));
	}

}
