package com.Chapter6.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {

	public static void main(String[] args) {
		// �ж��ַ����Ƿ������ָ�ʽ
//		String string = "12.63";
		System.out.println("������һ�����:");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (CheckNumber.isNumeric(string)) {
			System.out.println(string+ "�����ָ�ʽ��");
		} else {
			System.out.println(string + "�������ָ�ʽ��");
		}
	}

/*	private static boolean IsNumber(String string) {
		char[] c = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(c[i])) {
			} else {
				return false;
			}
		}
		return true;
	}*/

	public static boolean isNumeric(String string) {
		Pattern pattern = Pattern.compile("-*\\d+(\\.\\d+)?"); // ����ƥ����������:-*\\d+(\\.\\d+)?
		Matcher isNum = pattern.matcher(string);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}
}
