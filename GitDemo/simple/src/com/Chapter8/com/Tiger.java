package com.Chapter8.com;

public class Tiger extends Beast{
	/*
	 * Tiger子类继承父类
	 * 并通过super关键字调用
	 * 同时想在该类中改变父类的值
	 * 以及调用父类的方法
	 */
	public Tiger() {
		super("条纹");
		super.skin = "花纹";
		super.move();
	}
}
