package com.Chapter6.com;

import java.util.Scanner;

public class Judge {

	public static void main(String[] args) {
		// ͨ��������ʽ���ж�ָ���������Ƿ��ǺϷ���e-mail��ַ
/*		String regex = "\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";// ^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$
		String s1 = "aaa";
		String s2 = "aaa@";
		String s3 = "aaa@111.com";
		if (s1.matches(regex)) {
			System.out.println(s1 + "��һ����ȷ������");
		}if (s2.matches(regex)) {
			System.out.println(s2 + "��һ����ȷ������");
		}if (s3.matches(regex)) {
			System.out.println(s3 + "��һ����ȷ������");
		}else {
			System.out.println("����һ����ȷ������");
		}*/
		System.out.println("������һ����ȷ�����䣺");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";	// \\w{0,}\\@\\w{0,}\\.{1}\\w{0,}
		if (string.matches(regex)) {
			System.out.println(string + ":��һ����ȷ������");
		}else {
			System.out.println(string + ":����һ����ȷ������");
		}
	}

}
