package com.Chapter5.com;


public class NineTable {
	// 打印九宮格
	public static void main(String[] args) {
		int array[][] = new int[3][3];
		int a = 2;
		int b = 3/2;
		for(int i = 1;i <= 9;i++) {
			array[a++][b++] = i;
			if(i % 3 == 0) {
				a = a - 2;
				b = b - 1;
			}else {
				a = a % 3;
				b = b % 3;
			}
		}
		System.out.println("打印九宮格");
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
