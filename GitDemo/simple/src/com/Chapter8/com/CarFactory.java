package com.Chapter8.com;

public class CarFactory {
	/*
	 * 创建一个名称为CarFactory的类
	 * 定义一个静态方法getCar()
	 */
	public static CarDemo getCar(String name) {
		if (name.equalsIgnoreCase("BMW")) {
			return new BMW();
		}else if (name.equalsIgnoreCase("BENz")) {
			return new Benz();
		}else {
			return null;
		}
	}
}
