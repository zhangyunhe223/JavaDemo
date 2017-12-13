package com.Chapter11.com;

import java.util.Arrays;

public class ArraryExceptionTest {
	/**
	 * 数组下标越界异常
	 * 并解决数组下标越界方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 声明一个长度为5的整型数组
		int[] a = new int[5];
		Arrays.fill(a, 8);
		for (int i = 0; i < 10; i++) {
			// 会提示数组下标越界
			System.out.println(a[i]);
		}
		
		// 通过以下两种方式可以避免数组下标越界
/*		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		// foreach循环语句打印
/*		for (int i : a) {
			System.out.println(i);
		}*/
	}
}
