package com.Chapter4.com;

import java.util.Scanner;

public class GetTerm {

	public static void main(String[] args) {
		// ʹ��if...else if���֧����ж�x��ֵ����������
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("����������a��ֵ��");
		double a = scanner.nextDouble();
		
		if (a > 30) {
			System.out.println("a > 30");
		}else if (a > 10) {
			System.out.println("10< a <=30");
		}else if (a >= 0) {
			System.out.println("0<= a <=10");
		}else {
			System.out.println("a < 0");
		}
	}

}
