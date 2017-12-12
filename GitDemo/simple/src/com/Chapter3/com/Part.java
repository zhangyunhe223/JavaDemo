package com.Chapter3.com;

public class Part {
	
	static final double PI = 3.14;                              // 声明常量PI
	static int age = 24;                                        // 声明int型变量age并赋值
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("age1 = " + age);
		final int number = 12345;                               // 声明number常量
		age = 22;                                               // 再次对age变量进行赋值
		System.out.println("PI =" + PI);
		System.out.println("number =" + number);
		System.err.println("age2 = " + age);
	}

}
