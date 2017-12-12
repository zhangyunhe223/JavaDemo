package com.Chapter6.com;

public class Decision {

	public static void main(String[] args) {
		// 使用正则表达式，判断指定字符串是否合法
		String string1 = "Abcd567";
		String string2 = "abcd567";
		boolean b1 = string1.matches("^[A-Za-z0-9]+$");
		boolean b2 = string1.matches("^[A-Za-z0-9]+$");
		System.out.println(b1);
		System.out.println(b2);
	}

}
