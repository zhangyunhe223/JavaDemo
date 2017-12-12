package com.Chapter6.com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class HomeWork03 {

	public static void main(String[] args) {
		// 将今天的全部信息格式化输出，再将日期以“年-月-日”的格式输出
		Date date = new Date();
		System.out.println("今天的全部信息格式化输出:" +"\n"+ String.format(Locale.CHINA, "%tc", date));
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(shortDateFormat.format(date));
		System.out.println(mediumDateFormat.format(date));
		System.out.println(longDateFormat.format(date));
		System.out.println(fullDateFormat.format(date));
		String s1 = String.format("%tF", date);
		System.out.println("年-月-日：" + s1);
	}

}
