package com.Chapter11.com;

import java.util.Scanner;

public class Number {
	/**
	 * ������Number��ͨ�����еķ���count�ɵõ�������������˵Ľ�������ڵ��ø÷�������������ʹ��try-catch��䲶׽���ܷ������쳣
	 * @return 
	 */
	public int count(int a,int b) throws Exception{
		System.out.println("�õ�������������˵Ľ��:" + a * b);
		return a * b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number = new Number();
		try {
			System.out.println("������a��ֵ��");
			Scanner scanner1 = new Scanner(System.in);
			int a = scanner1.nextInt();
			System.out.println("������b��ֵ��");
			Scanner scanner2 = new Scanner(System.in);
			int b = scanner2.nextInt();
			number.count(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
