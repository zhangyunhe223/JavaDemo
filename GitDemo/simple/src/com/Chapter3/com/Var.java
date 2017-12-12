package com.Chapter3.com;

public class Var {
	
	static int times = 3;                                            // 定义类中的成员变量
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = 4;                                               // 局部变量
		System.out.println("times的值=" + times);
		System.out.println("times的值=" + Var.times);                 // 输出静态变量
	}

}
