package com.Chapter3.com;

import java.util.Scanner;

public class Operator03 {
	
	public static void main(String[] args) {
		// 声明两个变量，并赋值作为矩形的长、宽，并计算该矩形的面积
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入矩形的length：");
		double length = scanner.nextDouble();
		System.err.println("请输入矩形的width:");
		double width = scanner.nextDouble();
		
		double area = length * width;
		
		System.out.println("矩形的面积为：" + area);
	}
}
