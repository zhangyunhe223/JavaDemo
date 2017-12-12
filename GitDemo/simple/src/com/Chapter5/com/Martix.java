package com.Chapter5.com;

import java.util.Scanner;

public class Martix {

	public static void main(String[] args) {
		// 输出一个3行4列且所有元素都为0的矩形
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入行数：");
		int row = scanner.nextInt();
		System.out.println("请输入列数：");
		int list = scanner.nextInt();
		rectangle(row,list);
	}

	private static void rectangle(int row,int list) {
		// 创建一个二维数组
		int array[][] = new int[row][list];
		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
