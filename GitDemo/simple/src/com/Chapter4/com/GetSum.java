package com.Chapter4.com;

public class GetSum {

	public static void main(String[] args) {
		// 通过while循环语句将1-10数字相加
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum = sum + i;
			System.err.println("当i=" + i + "时,sum的值等于=" + sum);
			i++;
		}
		System.out.println("1-10数字相加的和=" + sum);
	}

}
