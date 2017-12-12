package com.Chapter6.com;

public class General {

	public static void main(String[] args) {
		// 打印不同数据类型到字符串转换
		String str1 = String.format("%d", 400/23);
		System.out.println(str1);
		
		String str2 = String.format("%b", 400 > 23);
		System.out.println(str2);
		
		String str3 = String.format("%x", 200);
		System.out.println(str3);
	}
}
