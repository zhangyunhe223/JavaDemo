package com.Chapter3.com;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// �����жϹ���(�ܱ�4�������Ҳ��ܱ�100�����������ܱ�400������)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������һ����ݣ�");
		long year = scanner.nextLong();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "����������");
		}else {
			System.out.println(year + "���겻������" );
		}
	}

}
