package com.Chapter6.com;

import java.util.Date;
import java.util.Locale;

public class GetTime {

	public static void main(String[] args) {
		// 利用format方法，格式化时间
		Date date = new Date();
		String s1 = String.format(Locale.CHINA,"%tc",date);
		String s2 = String.format(Locale.CHINA,"%tH",date);
		String s3 = String.format(Locale.CHINA,"%tI",date);
		String s4 = String.format(Locale.CHINA,"%tk",date);
		String s5 = String.format(Locale.CHINA,"%tl",date);
		String s6 = String.format(Locale.CHINA,"%tM",date);
		String s7 = String.format(Locale.CHINA,"%tS",date);
		String s8 = String.format(Locale.CHINA,"%tL",date);
		String s9 = String.format(Locale.CHINA,"%tp",date);
		
		System.out.println("默认时间：" + s1);
		System.out.println("2位数字的24小时制的小时：" + s2 + "点");
		System.out.println("2位数字的12小时制的小时：" + s3);
		System.out.println("2位数字的24小时制的小时：" + s4);
		System.out.println("2位数字的12小时制的小时：" + s5);
		System.out.println("2位数的分钟：" + s6 + "分");
		System.out.println("2位数的秒数：" + s7 + "秒");
		System.out.println("指定语言环境下,上午或者下午标记：" + s9);
	}

}
