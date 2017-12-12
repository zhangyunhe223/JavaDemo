package com.Chapter5.com;

import java.util.Arrays;
import java.util.Collections;

public class Taxis {

	public static void main(String[] args) {
		// 创建一维数组后，并将数组排序后输出
		Integer array[] = { 52, 94, 36, 58, 74, 215, 54 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("顺序排列：");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("倒叙排列：");
		Arrays.sort(array, Collections.reverseOrder());
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
