package com.Chapter5.com;

public class TestArrary01 {

	public static void main(String[] args) {

		int array[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		System.out.println("转换前的矩形是：");
		PrintArray01(array);
		System.out.println("转换后的矩形是：");
		PrintArrary02(array);
	}

	private static void PrintArrary02(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
	}

	private static void PrintArray01(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
