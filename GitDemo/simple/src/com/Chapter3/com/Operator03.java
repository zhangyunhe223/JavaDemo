package com.Chapter3.com;

import java.util.Scanner;

public class Operator03 {
	
	public static void main(String[] args) {
		// ������������������ֵ��Ϊ���εĳ�����������þ��ε����
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ε�length��");
		double length = scanner.nextDouble();
		System.err.println("��������ε�width:");
		double width = scanner.nextDouble();
		
		double area = length * width;
		
		System.out.println("���ε����Ϊ��" + area);
	}
}
