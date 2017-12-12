package com.Chapter3.com;

import java.util.Scanner;

public class Paritycheck02 {

	public static void main(String[] args) {
		// 判断数字的奇偶数 使用if...else语句
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一个整数");
		long number = scanner.nextLong();
		if (number % 2 == 0) {
			System.err.println("这个数是：偶数");
		}else {
			System.err.println("这个数是：奇数");
		}
			
	}

}
