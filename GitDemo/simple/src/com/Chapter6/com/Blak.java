package com.Chapter6.com;

import java.util.StringTokenizer;

public class Blak {

	public static void main(String[] args) {
		// 创建string对象，将字符变量原来的长度和去掉的前导和尾部空格后的长度输出
		String string1 = new String("          java class");
		String string2 = string1.trim();
		
		StringTokenizer string3 = new StringTokenizer(string1," ");
		StringBuffer buffer = new StringBuffer();
/*		int i = 1;
		while(string3.hasMoreTokens()) {
			i++;
			buffer.append(string3.nextToken());
		}*/
		for(int i = 1;i <= string1.length();i++) {
			if(string3.hasMoreTokens()) {
				buffer.append(string3.nextToken());
			}
		}
		
		String str = new String("j a v a 编程");
		System.out.println("原来的长度：" + string1.length());
		System.out.println("去除前后空格的长度：" + string2.length());
		System.out.println("去除前后空格后的字符：" + string2);
		System.out.println("去除所有空格后的字符：" + buffer.toString());
		
		System.out.println("去除所有空格后的字符：" + str.replaceAll(" ", ""));
		System.out.println("去除所有空格后的字符：" + string1.replace(" ", "-"));
		System.out.println("去除所有空格后的字符：" + string1.replaceFirst(" ", "Z"));
	}

}
