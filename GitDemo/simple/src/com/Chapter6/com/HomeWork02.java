package com.Chapter6.com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HomeWork02 {

	public static void main(String[] args) {
		// ʹ�����ַ����滻�ո�
		/*
		 * ��һ��,ȥ��ǰ���ͺ���Ŀո�
		 * ʹ��trim()����
		 */
/*		System.out.println("�����������ַ���");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		System.out.println("ȥ���ո�֮ǰ��" + s1);
		System.out.println("ȥ���ո�֮��" + s1.trim());*/
		
		/*
		 * �ڶ��֣�ȥ�����еĿո� StringTokenizer()       replace(" ","")
		 */
/*		System.out.println("�����������ַ���");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		System.out.println("ȥ���ո�֮ǰ��" + s1);
		StringTokenizer s2 = new StringTokenizer(s1," ");
		StringBuffer buffer = new StringBuffer();
		for(int i = 0;i < s1.length();i++) {
			if (s2.hasMoreTokens()) {
				buffer.append(s2.nextToken());
			}
		}
		System.out.println("ȥ���ո�֮��" + buffer);
		
		String str = "fdasfsaf dfsafffwre           4343 ";
		System.out.println("ȥ���ո�֮ǰ��" + str);
		System.out.println("ȥ���ո�֮��" + str.replace(" ", ""));*/
		
		/*
		 * ��ʹ���������ַ�����ʹ��for�Լ�if����������ȥ���ո�
		 */
		// ʹ��foreach��������ȥ��
/*		System.out.println("�����������ַ���");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("ȥ���ո�֮ǰ��" + str);
		String[] s1 = str.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String string : s1) {
			builder.append(string);
		}
		System.out.println("ȥ���ո�֮��" + builder);*/
		
		// ʹ��for�Լ�if����������ȥ���ո�
		System.out.println("�����������ַ���");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("ȥ���ո�֮ǰ��" + str);
		StringBuilder builder = new StringBuilder(str);
		for(int i = 0;i < builder.length();i++) {
			if (builder.charAt(i) == ' ') {
				builder.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("ȥ���ո�֮��" + builder);
	}

}
