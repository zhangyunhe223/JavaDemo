package com.Chapter3.com;

import java.util.Scanner;

public class Paritycheck01 {

	public static void main(String[] args) {
		// �ж����ֵ���ż�� ʹ����Ŀ�����
		
		Scanner scanner = new Scanner(System.in);                          // ����������ɨ����
		
		System.out.println("������һ������");
		long number = scanner.nextLong();                                  // ��ȡ�ڶ����û�����ı���ֵ
		String check = (number % 2 == 0) ? "������ǣ�ż��" : "������ǣ�����";
		System.out.println(check);
	}

}
