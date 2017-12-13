package com.Chapter11.com;

public class NewException extends Exception{
	/**
	 * 自定义NewException类
	 * 该类集成Exception类
	 */
	public NewException(double r) {
		// 在构造方法中
		/*super(s);*/
		/*
		 * 1.通过求圆的面积抛出自定义异常
		 */
		System.out.println("发生异常：" + "\n" + "圆的半径为：" + r + "\n" + "圆的半径不能小于20!");
	}
}
