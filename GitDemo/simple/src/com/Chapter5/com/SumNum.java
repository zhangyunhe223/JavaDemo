package com.Chapter5.com;

public class SumNum {

	public static void main(String[] args) {
		// 求一维数组中各个元素的和
		arr01();
		arr02();
	}

	public static void arr01() {

		// 定义一个一维数组1——9
		int arr01[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 定义一个累加求和的变量
		int sum = 0;
		for (int i = 0; i <= arr01.length; i++) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println("一维数组1——10和sum:" + sum);
		System.out.println("---------------");
	}

	private static void arr02() {
		// 定义一个一维数组1——9
		int arr02[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 定义一个累加求和的变量
		int sum = 0;
		System.out.println("一维数组1——10和sum:");
		for (int i = 0; i < arr02.length; i++) {
			if (i == 9) {
				System.out.print(arr02[i] + "=");
			} else {
				System.out.print(arr02[i] + "+");
			}
			sum = sum + arr02[i];
		}
		System.out.println(sum);
	}

}
