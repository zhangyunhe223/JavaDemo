package com.Chapter5.com;

public class ArryRowColumnSwap {

	public static void main(String[] args) {
		// 对矩形进行转置运算
		int array[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		System.out.println("转置前的矩形是：");
		PrintArray01(array);
		System.out.println("转置后的矩形是：");

		// 再打印转置后二维数组
		int array02[][] = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array02[j][i] = array[i][j];
			}
		}
		PrintArray01(array02);
	}

	private static void PrintArray01(int[][] array) {
		// 先打印转置前二维数组
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
