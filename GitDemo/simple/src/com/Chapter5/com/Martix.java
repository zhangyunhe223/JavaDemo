package com.Chapter5.com;

import java.util.Scanner;

public class Martix {

	public static void main(String[] args) {
		// ���һ��3��4��������Ԫ�ض�Ϊ0�ľ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		int row = scanner.nextInt();
		System.out.println("������������");
		int list = scanner.nextInt();
		rectangle(row,list);
	}

	private static void rectangle(int row,int list) {
		// ����һ����ά����
		int array[][] = new int[row][list];
		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
