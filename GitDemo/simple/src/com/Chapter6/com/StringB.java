package com.Chapter6.com;

import java.util.Scanner;

public class StringB {

	public static void main(String[] args) {
		// ��֤�ַ����Ƿ����
		System.out.println("������һ���ַ�����");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		StringBuilder sBuilder = new StringBuilder(str);
		sBuilder.reverse(); // ʹ�õ��õķ������м���
		String newStr = new String(sBuilder);
		if (str.equals(newStr)) {
			System.out.println("���ַ����ǻ���:" + str);
		} else {
			System.out.println("���ַ������ǻ���:" + str);
		}
/*		System.out.println("-------------");
		String text = "123";
		System.out.println(isHuiWen(text));*/
	}
/*
	public static boolean isHuiWen(String text) {
		int length = text.length();
		for (int i = 0; i < length / 2; i++) {
			if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
				return false;
			}
		}
		return true;
	}*/
}
