package com.Chapter3.com;

public class TypeConvertion02 {

	public static void main(String[] args) {
		// ����*����λ���������21*16����ֵ�Ƕ���
/*		long a = 21L;
		int x = 1;
		for (int i = 1; i < 5; i++) {
			x *= 2;
			a = a << 1;
			System.out.println("21���ƶ�" + i + "λ���ǳ���" + x + "���Ϊ" + a);
		}*/
		int a = 21;
		int b = 6; 
		System.err.println("21 * 16 = " + (a << b));
	}
}
