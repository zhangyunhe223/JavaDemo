package com.Chapter4.com;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// ��ϰ1����дjava����ʵ���жϱ���x����������ż��
		System.out.println("���������x=");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x % 2 ==0 ) {
			System.out.println("x = " + x + "��ż����");
		}else {
			System.out.println("x = " + x + "��������");
		}
	}

}
