package com.Chapter6.com;

import java.util.Date;
import java.util.Locale;

public class DateAndTime2 {

	public static void main(String[] args) {
		// 利用format格式化日期和时间
		Date date = new Date();
		System.out.println("默认时间:" + date);

		String s1 = String.format("%tF", date);
		System.out.println("年-月-日：" + s1);
		
		String s2 = String.format("%tD", date);
		System.out.println("年/月/日：" + s2);
		
		String s3 = String.format("%tc", date);
		System.out.println(s3);
		String s4 = String.format(Locale.CHINA,"%tc", date);
		System.out.println(s4);
		
		String s5 = String.format("%tr", date);
		System.out.println("(12小时制)时:分:秒：" + s5);
		
		String s6 = String.format("%tT", date);
		System.out.println("(24小时制)时:分:秒：" + s6);
		
		String s7 = String.format("%tR", date);
		System.out.println("(24小时制)时:分：" + s7);
	}

}
