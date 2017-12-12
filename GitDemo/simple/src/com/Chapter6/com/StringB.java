package com.Chapter6.com;

import java.util.Scanner;

public class StringB {

	public static void main(String[] args) {
		// 验证字符串是否回文
		System.out.println("请输入一个字符串：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		StringBuilder sBuilder = new StringBuilder(str);
		sBuilder.reverse(); // 使用倒置的方法进行加密
		String newStr = new String(sBuilder);
		if (str.equals(newStr)) {
			System.out.println("该字符串是回文:" + str);
		} else {
			System.out.println("该字符串不是回文:" + str);
		}
/*		System.out.println("-------------");
		String text = "123";
		System.out.println(isHuiWen(text));*/
	}
/*
	public static boolean isHuiWen(String text) {
		int length = text.length();
		for (int i = 0; i < length / 2; i++) {
			if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
				return false;
			}
		}
		return true;
	}*/
}
