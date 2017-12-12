package com.Chapter5.com;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// 使用使用静态方法fill来对数组中的元素进行替换
		
		// 通过Arrays.fill(array,8);方法
		int array[] = new int[5];
		Arrays.fill(array,8);
		System.out.println("通过Arrays.fill(array,8);方法:");
		for(int i = 0;i < array.length;i++) {
			System.out.println("第" + (i + 1) + "元素:"+ " " + array[i]);
		}
	}

}
