package com.Chapter3.com;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		
		// 声明两个变量，使用三目运算符进行判断两个变量是否相等，若不相等，求出两个数中较大的那个
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入一个变量A=");
		double a = scanner.nextDouble();
		System.out.print("请输入一个变量B=");
		double b = scanner.nextDouble();
		
		double w = (a > b) ? a : b;
		double y = (a != b) ? w : a;
		System.out.println((a == b) ? "a=b" : (a > b) ? "a>b" : "a<b");
	}

}
