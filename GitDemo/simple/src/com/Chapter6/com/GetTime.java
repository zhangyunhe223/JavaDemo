package com.Chapter6.com;

import java.util.Date;
import java.util.Locale;

public class GetTime {

	public static void main(String[] args) {
		// ����format��������ʽ��ʱ��
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
		
		System.out.println("Ĭ��ʱ�䣺" + s1);
		System.out.println("2λ���ֵ�24Сʱ�Ƶ�Сʱ��" + s2 + "��");
		System.out.println("2λ���ֵ�12Сʱ�Ƶ�Сʱ��" + s3);
		System.out.println("2λ���ֵ�24Сʱ�Ƶ�Сʱ��" + s4);
		System.out.println("2λ���ֵ�12Сʱ�Ƶ�Сʱ��" + s5);
		System.out.println("2λ���ķ��ӣ�" + s6 + "��");
		System.out.println("2λ����������" + s7 + "��");
		System.out.println("ָ�����Ի�����,������������ǣ�" + s9);
	}

}
