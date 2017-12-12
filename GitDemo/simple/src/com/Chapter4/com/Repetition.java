package com.Chapter4.com;

public class Repetition {

	public static void main(String[] args) {
		// 定义一维数组,并用foreach语句遍历该数组
		
		int arr[] = { 1, 2, 3, 4 };
		System.out.println("一维数组中的元素分别为：");
		for (int i : arr) {
			System.out.println(i + "\t");
		}
	}

}
