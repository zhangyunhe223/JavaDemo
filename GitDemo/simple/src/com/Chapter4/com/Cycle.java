package com.Chapter4.com;

public class Cycle {

	public static void main(String[] args) {
		// �Ƚ�while��do...whileѭ����������

		int a = 100;
		while (a == 60) {
			a--;
		}
		System.out.println("1---ʹ�õ�whileѭ�����,�ó�:ok! a=60,�˳�ѭ��");

		int b = 100;
		do {
			System.out.println("2---ʹ�õ�do...whileѭ�����,�ó�:ok! b=30,�˳�ѭ��");
			b--;
		} while (b == 30);
	}

}
