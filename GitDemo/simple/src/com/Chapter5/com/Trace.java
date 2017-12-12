package com.Chapter5.com;

public class Trace {

	public static void main(String[] args) {
		// 求方阵的迹
		// 先打印一个方阵
		int array[][] = { { 1, 2, 3,4 }, { 4, 5, 6,7 }, { 7, 8, 9,10 },{10,11,12,13}};
		int sum = 0;

		int matrix_width = array.length;
		int matrix_height = array[0].length;

		// 判断矩阵是否正确
		if (matrix_width != matrix_height) {
			System.out.println("这个矩阵是错误的！");
		} else {

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("方阵的迹:");
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i][i];
				if(array[i].length == i + 1 ) { // array[i].length表示一维数组的长度
					System.out.print(array[i][i] + "=");
				}else {					
					System.out.print(array[i][i] + "+");
				}
			}
			System.out.println(sum);
		}
	}

}
