package com.Chapter3.com;

public class Operator01 {

	public static void main(String[] args) {
		// 声明两个变量，使用三目运算符进行判断两个变量是否相等，若不相等，求出两个数中较大的那个
		int a = 89;
		int b = 100;
		int g = (a > b) ? a : b;
		int k = (a != b) ? g : a;
//		String c = (a == b) ? "最小值：a=" + a : "最大值：b=" + b;
		System.out.println((a == b) ? "相等" : (a > b) ? "a大" : "b大");
	}

}
