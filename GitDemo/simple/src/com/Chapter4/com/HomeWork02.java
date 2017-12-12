package com.Chapter4.com;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// 练习1：编写java程序，用for循环打印菱形
		System.out.println("请输入菱形的成熟变量lay：");
		Scanner scanner = new Scanner(System.in);
		int lay = scanner.nextInt();
		// 调用菱形实现的方法函数
		LingXing(lay);
	}
	
	// 实现菱形的方法
	public static void LingXing(int lay) {
		// 菱形上半部分
		for(int i = 1;i <= lay;i++) {
			for(int j = 1;j <= lay -i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= 2 * i - 1;k++) {
				if(k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 菱形下半部分
		for(int i = 1;i <= lay;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= 2 * (lay -i) - 1;k++) {
				if(k == 1 || k== 2 * (lay -i) - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
