package com.Chapter11.com;

import java.util.Scanner;

public class Number {
	/**
	 * 创建类Number，通过类中的方法count可得到任意两个数相乘的结果，并在调用该方法的主方法中使用try-catch语句捕捉可能发生的异常
	 * @return 
	 */
	public int count(int a,int b) throws Exception{
		System.out.println("得到任意两个数相乘的结果:" + a * b);
		return a * b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number = new Number();
		try {
			System.out.println("请输入a的值：");
			Scanner scanner1 = new Scanner(System.in);
			int a = scanner1.nextInt();
			System.out.println("请输入b的值：");
			Scanner scanner2 = new Scanner(System.in);
			int b = scanner2.nextInt();
			number.count(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
