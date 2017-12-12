package com.Chapter6.com;

import java.util.Scanner;

public class Judge {

	public static void main(String[] args) {
		// 通过正则表达式，判断指定的邮箱是否是合法的e-mail地址
/*		String regex = "\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";// ^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$
		String s1 = "aaa";
		String s2 = "aaa@";
		String s3 = "aaa@111.com";
		if (s1.matches(regex)) {
			System.out.println(s1 + "是一个正确的邮箱");
		}if (s2.matches(regex)) {
			System.out.println(s2 + "是一个正确的邮箱");
		}if (s3.matches(regex)) {
			System.out.println(s3 + "是一个正确的邮箱");
		}else {
			System.out.println("不是一个正确的邮箱");
		}*/
		System.out.println("请输入一个正确的邮箱：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";	// \\w{0,}\\@\\w{0,}\\.{1}\\w{0,}
		if (string.matches(regex)) {
			System.out.println(string + ":是一个正确的邮箱");
		}else {
			System.out.println(string + ":不是一个正确的邮箱");
		}
	}

}
