package com.Chapter5.com;

public class TestArray02 {

	public static void main(String[] args) {
		/*
		 * 求矩阵的迹
		 * 1.先定义一个二维数组
		 * 2.打印二维数组
		 * 3.在进行计算矩阵的迹
		 */
		int array[][] = new int [][]{{01,2,3},{14,5,6},{17,8,19}};
		int sum = 0;
		System.out.println("先遍历二维数组的所有值：");
		
		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		for(int i = 0;i < array.length;i++) {
			sum = sum + array[i][i];
		}
		System.out.print(sum);
	}

}
