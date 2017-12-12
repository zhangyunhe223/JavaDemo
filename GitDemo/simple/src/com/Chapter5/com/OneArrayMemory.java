package com.Chapter5.com;

public class OneArrayMemory {

	public static void main(String[] args) {
		// 对比一维数组、二维数组所占大小

		// 创建一维数组，所占内存大小
		int num1 = 1024 * 1024;
		int[] array1 = new int[num1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
		}
		// 获取占用内存总数
		long memory1 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.println("用一维数组存储所占的内存空间为：" + memory1);

		// 创建一维数组，所占内存大小
		int num2 = 1024 * 1024;
		int[][] array2 = new int[num2][2];
		for (int i = 0; i < array2.length; i++) {
			array2[i][0] = i;
			array2[i][1] = i;
		}
		// 获取占用内存总数
		long memory2 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.println("用二维数组存储所占的内存空间为：" + memory2);

	}

}
