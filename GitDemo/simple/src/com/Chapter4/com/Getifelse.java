package com.Chapter4.com;

public class Getifelse {

	public static void main(String[] args) {
		// 通过使用if...else语句判断变量的值来决定输出的结果
		int math = 95;
		int english = 56;
		
		if (math > 60) {
			System.out.println("数学及格了...");
		}else {
			System.out.println("数学没有及格...");
		}
		
		if (english > 60) {
			System.out.println("英语及格了...");
		} else {
			System.out.println("英语没有及格...");
		}
	}

}
