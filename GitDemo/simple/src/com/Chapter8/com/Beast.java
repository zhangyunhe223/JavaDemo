package com.Chapter8.com;

public class Beast {
	/*
	 * 创建一个父类Beast野兽类
	 * 并且定义一个成员变量skin
	 * 定义一个默认的构造方法、带参数的构造方法以及成员方法
	 */
	String skin;
	
	public Beast() {
		// 默认的构造方法
	}
	public Beast(String strSkin) {
		// 带参数的构造方法
		skin = strSkin;
	}
	public void move() {
		System.out.println("跑！");
	}
}
