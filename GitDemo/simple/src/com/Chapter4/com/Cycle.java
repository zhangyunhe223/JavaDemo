package com.Chapter4.com;

public class Cycle {

	public static void main(String[] args) {
		// 比较while和do...while循环语句的区别

		int a = 100;
		while (a == 60) {
			a--;
		}
		System.out.println("1---使用的while循环语句,得出:ok! a=60,退出循环");

		int b = 100;
		do {
			System.out.println("2---使用的do...while循环语句,得出:ok! b=30,退出循环");
			b--;
		} while (b == 30);
	}

}
