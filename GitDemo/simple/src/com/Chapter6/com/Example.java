package com.Chapter6.com;

import java.util.Date;
import java.util.Locale;

public class Example {

	public static void main(String[] args) {
		// 利用format()方法，格式化日期
		Date date = new Date();
		String s1 =  String.format(Locale.CHINA,"%tb", date);
		String s2 =  String.format(Locale.CHINA,"%tB", date);
		String s3 =  String.format(Locale.CHINA,"%ta", date);
		String s4 =  String.format(Locale.CHINA,"%tA", date);
		String s5 =  String.format(Locale.US,"%tb", date);
		String s6 =  String.format(Locale.US,"%tB", date);
		String s7 =  String.format(Locale.US,"%ta", date);
		String s8 =  String.format(Locale.US,"%tA", date);	
		String s9 =  String.format(Locale.US,"%tc", date);
		String s10 =  String.format(Locale.CHINA,"%tc", date);
		
		String s11 =  String.format("%te", date);
		String s12 =  String.format("%tj", date);
		String s13 =  String.format("%tY", date);
		String s14 =  String.format("%ty", date);
		String s15 =  String.format("%tm", date);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println("显示一个月中的某一天:" + s11 + "天");
		System.out.println("一年中的第几天：" + s12 + "天");
		System.out.println("显示4位数的年份：" + s13 + "年");
		System.out.println("显示2位数的年份：" + s14 + "年");
		System.out.println("显示当前年的月份：" + s15 + "月");
	}

}
