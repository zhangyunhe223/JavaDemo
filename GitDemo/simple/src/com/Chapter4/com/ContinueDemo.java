package com.Chapter4.com;

public class ContinueDemo {

	public static void main(String[] args) {
		{
			// 使用continue结合while循环，打印出1-10所有奇数
			System.out.println("----------while-----------");
			System.out.println("打印出1-10所有奇数:");
			
			// 先定义循环增量
			int i = 0;
			while (i < 10) {
				i++;
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			}
		}
		{
			// 使用continue结合for循环，打印出1-10所有奇数
			System.out.println("----------for-----------");
			System.out.println("打印出1-10所有奇数:");
			
			for(int i = 1; i <= 10; i++) {
				if(i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			}
		}
		{
			// 使用continue结合do...while循环，打印出1-10所有奇数
			System.out.println("----------do...while-----------");
			System.out.println("打印出1-10所有奇数:");
			
			// 先定义循环增量
			int i = 0;
			do {
				i++;
				if(i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			} while (i < 10);
		}
	}

}
