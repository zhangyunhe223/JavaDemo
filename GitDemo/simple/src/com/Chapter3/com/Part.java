package com.Chapter3.com;

public class Part {
	
	static final double PI = 3.14;                              // ��������PI
	static int age = 24;                                        // ����int�ͱ���age����ֵ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("age1 = " + age);
		final int number = 12345;                               // ����number����
		age = 22;                                               // �ٴζ�age�������и�ֵ
		System.out.println("PI =" + PI);
		System.out.println("number =" + number);
		System.err.println("age2 = " + age);
	}

}
