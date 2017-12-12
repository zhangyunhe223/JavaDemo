package com.Chapter3.com;

import java.util.Scanner;

public class VariableExchange {

	public static void main(String[] args) {
		// 不用其他变量实现两变量互换
		
		Scanner Scan = new Scanner(System.in);                            // 创建扫描器
		
		System.out.println("请输入变量A的值");                                 
		long A = Scan.nextLong();                                         // 接受第一个变量值
		System.out.println("请输入变量B的值");
		long B = Scan.nextLong();                                         // 获取第二个用户输入的变量值
		System.out.println("A=" + A + "\tB=" + B);
		System.err.println("执行变量互换...");
		A = A ^ B;
		B = B ^ A;                                                        // 执行变量互换
		A = A ^ B;
		System.out.println("A=" + A + "\tB=" + B);
	}

}
