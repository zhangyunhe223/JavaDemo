package com.Chapter4.com;

import java.util.Scanner;

public class YanghuiTriang {
	
	// 打印杨辉三角

	public static void main(String[] args) {
		// 调用杨辉三角的的方法函数
		System.out.println("请输入杨辉三角的变量行数：");
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		System.out.println("--------------------");
		YangHui(lines);
	}
	
	// 实现杨辉三角的方法
	public static void YangHui(int lines) {
		// 先定义个二维数组
		int arr[][] = new int[lines][];
		// 再使用for循环遍历
		for(int i = 0;i < arr.length;i++) {
			// 打印每行第一个“*”前的空格数
			for (int h = 1; h <= lines - i; h++) {
				System.out.print(" ");
			}
			// 初始化二层数组大小
			arr[i] = new int[i+1];
			// 遍历二层数组
			for(int j = 0;j <= i;j++) {
				// 设置两侧元素的值为1
				if(i == 0 || j ==0 || i == j) {
					arr[i][j] = 1;
				}else {
					//  并通过以下计算方式计算其他值
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
