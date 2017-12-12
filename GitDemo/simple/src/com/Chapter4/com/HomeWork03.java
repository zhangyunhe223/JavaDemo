package com.Chapter4.com;

public class HomeWork03 {

	public static void main(String[] args) {
		// 编写Java程序，使用while循环语句计算1+1/2！+1/3！+++1/20!的和
		double sum = 0,a = 1;
		int i = 1;
		while(i <= 20) {
			sum = sum + a; 
			i++;
			a = a * (1.0/i); 
		}
		System.out.println("sum = " + sum);
	}

}
