package com.Chapter7.com;

public class Book01 {

	/*
	 * 统计图书销量
	 */
	// 定义一个计数器
	private static int counter = 0;

	public Book01(String title) {
		System.out.println("出售图书：" + title);
		counter++;
	}

	public static int getCounter() {
		return counter;
	}
}
