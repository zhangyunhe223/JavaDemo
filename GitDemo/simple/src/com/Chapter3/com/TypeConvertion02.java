package com.Chapter3.com;

public class TypeConvertion02 {

	public static void main(String[] args) {
		// 不用*用移位运算符计算21*16的数值是多少
/*		long a = 21L;
		int x = 1;
		for (int i = 1; i < 5; i++) {
			x *= 2;
			a = a << 1;
			System.out.println("21左移动" + i + "位就是乘以" + x + "结果为" + a);
		}*/
		int a = 21;
		int b = 6; 
		System.err.println("21 * 16 = " + (a << b));
	}
}
