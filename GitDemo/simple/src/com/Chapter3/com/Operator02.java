package com.Chapter3.com;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		
		// ��������������ʹ����Ŀ����������ж����������Ƿ���ȣ�������ȣ�����������нϴ���Ǹ�
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������һ������A=");
		double a = scanner.nextDouble();
		System.out.print("������һ������B=");
		double b = scanner.nextDouble();
		
		double w = (a > b) ? a : b;
		double y = (a != b) ? w : a;
		System.out.println((a == b) ? "a=b" : (a > b) ? "a>b" : "a<b");
	}

}
