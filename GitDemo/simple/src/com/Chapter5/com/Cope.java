package com.Chapter5.com;

import java.util.Arrays;

public class Cope {

	public static void main(String[] args) {
		// 创建一个一维数组长度为3，实现将此数组复制得到一个长度为5的新数组，并打印
		int array[] = new int[] { 45, 87, 45, 154 };
		System.out.println("复制前的数组为：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("复制后的数组为：");
		int array02[] = Arrays.copyOf(array, 8);
		for (int i = 0; i < array02.length; i++) {
			System.out.print(array02[i] + " ");
		}
	}

}
