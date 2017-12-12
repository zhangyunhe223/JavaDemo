package com.Chapter3.com;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// 闰年判断规则(能被4整除，且不能被100整除，或者能被400整除的)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一个年份：");
		long year = scanner.nextLong();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "此年是闰年");
		}else {
			System.out.println(year + "此年不是闰年" );
		}
	}

}
