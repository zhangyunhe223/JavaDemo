package com.Chapter7.com;

import java.util.Scanner;

public class CelsiusConverter {
	
	public double getFahrenheit(double celsius) {
		// ���϶�(�H)=32+���϶�(��)��1.8
		double fahrenheit = 32 + celsius * 1.8;
		return fahrenheit;
	}

	public static void main(String[] args) {
		// �¶ȵ�Ԫ��ת�� ���϶ȡ������϶�
		System.out.println("����������ת�����¶ȣ�");
		Scanner scanner = new Scanner(System.in);
		double  celsius = scanner.nextDouble();
		CelsiusConverter celsiusConverter = new CelsiusConverter();
		double fahrenheit = celsiusConverter.getFahrenheit(celsius);
		System.out.println("���϶�(��):" + celsius + "��");
		System.out.println("���϶�(�H):" + String.format("%.2f", fahrenheit) + "�H");
	}

}
