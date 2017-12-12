package com.Chapter4.com;

public class ClassicExample01 {
	// 使用for循环输出空心的菱形

	/*
	 * 1.首先打印金字塔
	 * 2.再打印空心金字塔
	 * 3.最后在打印空心菱形
	 */
	public static void main(String[] args) {
		// 函数的调用
		Pyramid(5);
		ReflectionSolidPyramid(5);
		ReflectionPyramid(5);
		AirPyrmid(5);
		AirRhombus(5);
	}

	// 使用for循环打印金字塔
	public static void Pyramid(int lay) {
		for (int i = 1; i <= lay; i++) {
			// 打印每行第一个“*”前的空格数
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			// 打印每行的“*”
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}

	// 打印倒影实心的金字塔
	public static void ReflectionSolidPyramid(int lay) {
		// 打印倒影的金字塔
		// 以上打印出来的是空心菱形
		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 以上打印出来的是空心菱形的下部分
		for (int i = 1; i <= lay - 1; i++) {
			// 每行空格数
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// 下半部分每行总的"*"数
			for (int k = 1; k <= 2 * (lay - i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}

	// 打印倒影的金字塔
	public static void ReflectionPyramid(int lay) {
		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---倒影---");

		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (lay - i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	
	// 使用for循环打印空心金字塔
	public static void AirPyrmid(int lay) {
		for (int i = 1; i <= lay; i++) {
			// 打印每行第一个“*”前的空格数
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			// 打印每行的“*”
			for (int k = 1; k <= 2 * i - 1; k++) {
				// System.out.print("*");
				if (i == 1 || i == lay) {
					System.out.print("*");
				} else if (k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}

	// 使用for循环打印空心菱形
	public static void AirRhombus(int lay) {
		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				// 打印空心金字塔
				if (k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// 以上打印出来的是空心菱形的上半部分
		// 空心菱形下半部分的行数为lay-1行；比如上半部分4行，则下半部分为3行才能构成菱形

		for (int i = 1; i <= lay - 1; i++) {
			// 每行空格数
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// 下半部分每行总的"*"数
			for (int k = 1; k <= 2 * (lay - i) - 1; k++) {
				// 如果"*"处在第一和最后一位则打印出来
				if (k == 1 || k == 2 * (lay - i) - 1) {
					System.out.print("*");
				} else {
					// 如果"*"不是处在第一和最后一位则打印出空格
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
