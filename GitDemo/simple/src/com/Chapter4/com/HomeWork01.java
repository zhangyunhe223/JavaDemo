package com.Chapter4.com;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// 练习1：编写java程序，实现判断变量x是奇数还是偶数
		System.out.println("请输入变量x=");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x % 2 ==0 ) {
			System.out.println("x = " + x + "是偶数！");
		}else {
			System.out.println("x = " + x + "是奇数！");
		}
	}

}
