package com.Chapter3.com;

import java.util.Scanner;

public class Paritycheck01 {

	public static void main(String[] args) {
		// 判断数字的奇偶数 使用三目运算符
		
		Scanner scanner = new Scanner(System.in);                          // 创建输入流扫描器
		
		System.out.println("请输入一个整数");
		long number = scanner.nextLong();                                  // 获取第二个用户输入的变量值
		String check = (number % 2 == 0) ? "这个数是：偶数" : "这个数是：奇数";
		System.out.println(check);
	}

}
