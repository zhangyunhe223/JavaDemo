package com.Chapter6.com;

import java.util.Date;
import java.util.Locale;

public class DateAndTime2 {

	public static void main(String[] args) {
		// ����format��ʽ�����ں�ʱ��
		Date date = new Date();
		System.out.println("Ĭ��ʱ��:" + date);

		String s1 = String.format("%tF", date);
		System.out.println("��-��-�գ�" + s1);
		
		String s2 = String.format("%tD", date);
		System.out.println("��/��/�գ�" + s2);
		
		String s3 = String.format("%tc", date);
		System.out.println(s3);
		String s4 = String.format(Locale.CHINA,"%tc", date);
		System.out.println(s4);
		
		String s5 = String.format("%tr", date);
		System.out.println("(12Сʱ��)ʱ:��:�룺" + s5);
		
		String s6 = String.format("%tT", date);
		System.out.println("(24Сʱ��)ʱ:��:�룺" + s6);
		
		String s7 = String.format("%tR", date);
		System.out.println("(24Сʱ��)ʱ:�֣�" + s7);
	}

}
