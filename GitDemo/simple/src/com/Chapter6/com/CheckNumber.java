package com.Chapter6.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {

	public static void main(String[] args) {
		// 判断字符串是否是数字格式
//		String string = "12.63";
		System.out.println("请输入一个金额:");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (CheckNumber.isNumeric(string)) {
			System.out.println(string+ "是数字格式！");
		} else {
			System.out.println(string + "不是数字格式！");
		}
	}

/*	private static boolean IsNumber(String string) {
		char[] c = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(c[i])) {
			} else {
				return false;
			}
		}
		return true;
	}*/

	public static boolean isNumeric(String string) {
		Pattern pattern = Pattern.compile("-*\\d+(\\.\\d+)?"); // 即可匹配所有数字:-*\\d+(\\.\\d+)?
		Matcher isNum = pattern.matcher(string);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}
}
