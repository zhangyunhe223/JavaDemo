package com.Chapter6.com;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * char a[] = { 's','t','u','d','e','n','t'}; String string = new String(a,2,4);
		 * System.out.println(string);
		 * 
		 * int booktime = 4; float practice = 2.5f; System.out.println("看书花费：" +
		 * booktime + "\n" + "上机花费：" + practice);
		 */
		/*
		 * System.out.println("请输入一个金额(最大到千亿,如有小数,只保留2位小数即角分):"); Scanner scanner = new
		 * Scanner(System.in); double money = scanner.nextDouble(); DecimalFormat fmt =
		 * new DecimalFormat("##,###,###,###,##0.00"); String s1 = fmt.format(money);
		 * System.out.println(s1);
		 * 
		 * 
		 * 
		 * NumberFormat nf = NumberFormat.getCurrencyInstance(); String s2 =
		 * nf.format(money); System.out.println(s2);
		 */
/*		System.out.println("请输入一篇文章：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
//		String str = "123abc这个中文cde123abc也要提取123ab";
		Pattern p = null;
		Matcher m = null;
		String value = null;
		p = Pattern.compile("([\u4e00-\u9fa5]+)");
		m = p.matcher(str);
		while (m.find()) {
			value = m.group(0);
			System.out.println(value);

		}*/
		String string = "";
		long starTime = System.currentTimeMillis();                // 执行操作的起始时间
		for(long i = 0;i < 1000;i++) {
			string = string + i;
//			System.out.println(string);
		}
		long endTime = System.currentTimeMillis();                 // 计算执行操作后的时间
		long time = endTime - starTime;
		System.out.println("string消耗的时间：" + time);
		StringBuffer stringBuffer =  new StringBuffer("");
		starTime = System.currentTimeMillis();                // 执行操作的起始时间
		for(long j = 0;j < 10000;j++) {
			stringBuffer.append(j);
		}
		endTime = System.currentTimeMillis();                 // 计算执行操作后的时间
		time = endTime - starTime;
		System.out.println("StringBuffer消耗的时间：" + time);
		
		StringBuffer stringBuffer2 = new StringBuffer("Sunday");
		StringBuffer stringBuffer3 = new StringBuffer();
		stringBuffer3.append(stringBuffer2);
		System.out.println(stringBuffer3);
		
	}

}
