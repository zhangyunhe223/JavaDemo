package com.Chapter3.com;

import java.util.Scanner;

public class Volume {
	
	static final double PI = 3.1415962;
	
	public static void main(String[] args) {
		// ����������� (4.0 / 3.0 * PI * r * r * r)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��������İ뾶��");
		double r = scanner.nextDouble();
		double volume = 4.0 / 3.0 * PI * r * r * r;
		
		System.out.println("��ӡ��뾶��ֵ��" + r);
		System.out.println("��ӡPI��ֵ��" + PI);
		System.out.println("��ӡ������:" + volume);
	}

}
