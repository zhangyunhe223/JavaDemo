package com.Chapter7.com;

import java.util.Scanner;

public class CelsiusConverter {
	
	public double getFahrenheit(double celsius) {
		// 华氏度(℉)=32+摄氏度(℃)×1.8
		double fahrenheit = 32 + celsius * 1.8;
		return fahrenheit;
	}

	public static void main(String[] args) {
		// 温度单元的转换 摄氏度——华氏度
		System.out.println("请输入你所转换的温度：");
		Scanner scanner = new Scanner(System.in);
		double  celsius = scanner.nextDouble();
		CelsiusConverter celsiusConverter = new CelsiusConverter();
		double fahrenheit = celsiusConverter.getFahrenheit(celsius);
		System.out.println("摄氏度(℃):" + celsius + "℃");
		System.out.println("华氏度(℉):" + String.format("%.2f", fahrenheit) + "℉");
	}

}
