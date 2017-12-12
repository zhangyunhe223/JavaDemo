package com.Chapter9.com;

public class TestArray {

	public static void main(String[] args) {
		// 初始化数组
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1000 * Math.random();
		}
		System.out.println("数组源：");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("最大值：" + MaxMin.Result.getResult(array).getMax());
		System.out.println("最小值：" + MaxMin.Result.getResult(array).getMin());
	}
}
