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
		 * int booktime = 4; float practice = 2.5f; System.out.println("���黨�ѣ�" +
		 * booktime + "\n" + "�ϻ����ѣ�" + practice);
		 */
		/*
		 * System.out.println("������һ�����(���ǧ��,����С��,ֻ����2λС�����Ƿ�):"); Scanner scanner = new
		 * Scanner(System.in); double money = scanner.nextDouble(); DecimalFormat fmt =
		 * new DecimalFormat("##,###,###,###,##0.00"); String s1 = fmt.format(money);
		 * System.out.println(s1);
		 * 
		 * 
		 * 
		 * NumberFormat nf = NumberFormat.getCurrencyInstance(); String s2 =
		 * nf.format(money); System.out.println(s2);
		 */
/*		System.out.println("������һƪ���£�");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
//		String str = "123abc�������cde123abcҲҪ��ȡ123ab";
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
		long starTime = System.currentTimeMillis();                // ִ�в�������ʼʱ��
		for(long i = 0;i < 1000;i++) {
			string = string + i;
//			System.out.println(string);
		}
		long endTime = System.currentTimeMillis();                 // ����ִ�в������ʱ��
		long time = endTime - starTime;
		System.out.println("string���ĵ�ʱ�䣺" + time);
		StringBuffer stringBuffer =  new StringBuffer("");
		starTime = System.currentTimeMillis();                // ִ�в�������ʼʱ��
		for(long j = 0;j < 10000;j++) {
			stringBuffer.append(j);
		}
		endTime = System.currentTimeMillis();                 // ����ִ�в������ʱ��
		time = endTime - starTime;
		System.out.println("StringBuffer���ĵ�ʱ�䣺" + time);
		
		StringBuffer stringBuffer2 = new StringBuffer("Sunday");
		StringBuffer stringBuffer3 = new StringBuffer();
		stringBuffer3.append(stringBuffer2);
		System.out.println(stringBuffer3);
		
	}

}
