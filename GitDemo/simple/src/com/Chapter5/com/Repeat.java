package com.Chapter5.com;

import java.util.Arrays;

public class Repeat {

	public static void main(String[] args) {
		// 创建一维数组，并将数组中的索引位置为0-3之间的元素复制到新数组中
		int array01[] = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("打印复制前的数组元素：");
		for (int i = 0; i < array01.length; i++) {
			System.out.print(array01[i] + " ");
		}
		System.out.println();
		System.out.println("打印复制后的数组元素：");
		int array02[] = Arrays.copyOfRange(array01, 0, 3);
		for (int i = 0; i < array02.length; i++) {
			System.out.print(array02[i] + " ");
		}
	}

}
