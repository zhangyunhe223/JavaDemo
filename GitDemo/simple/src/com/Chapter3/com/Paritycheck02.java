package com.Chapter3.com;

import java.util.Scanner;

public class Paritycheck02 {

	public static void main(String[] args) {
		// �ж����ֵ���ż�� ʹ��if...else���
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������һ������");
		long number = scanner.nextLong();
		if (number % 2 == 0) {
			System.err.println("������ǣ�ż��");
		}else {
			System.err.println("������ǣ�����");
		}
			
	}

}
