package com.Chapter7.com;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		// �������в����ĸ���������ӡ����iֵ�Ĵ���
		System.out.println("���������");
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		for (int i = 1; i <= time; i++) {
			System.out.println("��" + i + "��");
		}
/*		if (args.length == 0) {
			System.out.println("no extra parameters");
			return;
		}
		System.out.println("parameters:");
		for (int i = 1; i <= args.length; i++) {
			System.out.println("��" + i + "��");
		}*/
	}

}
