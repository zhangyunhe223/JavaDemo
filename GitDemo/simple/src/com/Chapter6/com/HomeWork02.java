package com.Chapter6.com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HomeWork02 {

	public static void main(String[] args) {
		// 使用两种方法替换空格
		/*
		 * 第一种,去除前导和后面的空格
		 * 使用trim()方法
		 */
/*		System.out.println("请输入任意字符：");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		System.out.println("去除空格之前：" + s1);
		System.out.println("去除空格之后：" + s1.trim());*/
		
		/*
		 * 第二种，去除所有的空格 StringTokenizer()       replace(" ","")
		 */
/*		System.out.println("请输入任意字符：");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		System.out.println("去除空格之前：" + s1);
		StringTokenizer s2 = new StringTokenizer(s1," ");
		StringBuffer buffer = new StringBuffer();
		for(int i = 0;i < s1.length();i++) {
			if (s2.hasMoreTokens()) {
				buffer.append(s2.nextToken());
			}
		}
		System.out.println("去除空格之后：" + buffer);
		
		String str = "fdasfsaf dfsafffwre           4343 ";
		System.out.println("去除空格之前：" + str);
		System.out.println("去除空格之后：" + str.replace(" ", ""));*/
		
		/*
		 * 不使用以上两种方法，使用for以及if条件语句进行去除空格
		 */
		// 使用foreach方法进行去除
/*		System.out.println("请输入任意字符：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("去除空格之前：" + str);
		String[] s1 = str.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String string : s1) {
			builder.append(string);
		}
		System.out.println("去除空格之后：" + builder);*/
		
		// 使用for以及if条件语句进行去除空格
		System.out.println("请输入任意字符：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("去除空格之前：" + str);
		StringBuilder builder = new StringBuilder(str);
		for(int i = 0;i < builder.length();i++) {
			if (builder.charAt(i) == ' ') {
				builder.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("去除空格之后：" + builder);
	}

}
