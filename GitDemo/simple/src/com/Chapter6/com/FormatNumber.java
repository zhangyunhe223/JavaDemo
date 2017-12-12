package com.Chapter6.com;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumber {

	public static void main(String[] args) {
		// 将数字格式化货币格式
		System.out.println("请输入金额：");
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("Locale.CHINA: " + format.format(number));
		
		format = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Locale.US: " + format.format(number));
		
		format = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
		System.out.println("Locale.JAPANESE: " + format.format(number));
		
		format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("Locale.FRANCE: " + format.format(number));
		
		format = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		System.out.println("Locale.TAIWAN: " + format.format(number));
	}

}
