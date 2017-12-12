package com.Chapter4.com;

public class Circulate {

	public static void main(String[] args) {
		
		// 使用for循环语句
		
		{
			// 使用for循环语句计算1-100之间所有偶数之和
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
			System.out.println("1-100之间所有偶数之和:" + sum);
		}
		
		{
			// 使用for循环语句计算1-100之间所有奇数之和
			int sum = 0;
			for (int i = 1; i <= 100; i += 2) {
					sum += i;
			}
			System.out.println("1-100之间所有奇数之和:" + sum);
		}
		
		{
			// 使用for循环语句计算1-100之间所有数字之和
			int sum = 0;
			for (int i = 1; i <= 100; i ++) {
					sum += i;
			}
			System.out.println("1-100之间所有数字之和:" + sum);
		}
	}

}
