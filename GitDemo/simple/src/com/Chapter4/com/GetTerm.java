package com.Chapter4.com;

import java.util.Scanner;

public class GetTerm {

	public static void main(String[] args) {
		// 使用if...else if多分支语句判断x的值，并输出结果
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("请输入任意a的值：");
		double a = scanner.nextDouble();
		
		if (a > 30) {
			System.out.println("a > 30");
		}else if (a > 10) {
			System.out.println("10< a <=30");
		}else if (a >= 0) {
			System.out.println("0<= a <=10");
		}else {
			System.out.println("a < 0");
		}
	}

}
