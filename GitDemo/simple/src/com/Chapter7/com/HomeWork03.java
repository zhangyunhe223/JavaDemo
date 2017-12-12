package com.Chapter7.com;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		// 根据运行参数的个数决定打印变量i值的次数
		System.out.println("请输入变量");
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		for (int i = 1; i <= time; i++) {
			System.out.println("第" + i + "次");
		}
/*		if (args.length == 0) {
			System.out.println("no extra parameters");
			return;
		}
		System.out.println("parameters:");
		for (int i = 1; i <= args.length; i++) {
			System.out.println("第" + i + "次");
		}*/
	}

}
