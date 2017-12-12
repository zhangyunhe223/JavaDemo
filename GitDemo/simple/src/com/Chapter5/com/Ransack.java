package com.Chapter5.com;

public class Ransack {

	public static void main(String[] args) {
		// 三维数组的打印

		// 定义一个三位数组
		int array[][][] = new int[][][] { { { 1, 2, 3, }, { 4, 5, 6, } }, { { 7, 8, 9, }, { 10, 11, 12 } },
				{ { 13, 14, 15 }, { 16, 17, 18 } } };

		for (int i = 0; i < array.length; i++) {
			// System.out.println("三维数组的第" + (i+1) + "个元素二维数组，内容如下");
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k] + "\t");
				}
				System.out.println();
			}
		}
	}

}
