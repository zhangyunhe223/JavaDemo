package com.Chapter3.com;

import java.util.Scanner;

public class Volume {
	
	static final double PI = 3.1415962;
	
	public static void main(String[] args) {
		// 球型体积计算 (4.0 / 3.0 * PI * r * r * r)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入球的半径：");
		double r = scanner.nextDouble();
		double volume = 4.0 / 3.0 * PI * r * r * r;
		
		System.out.println("打印球半径的值：" + r);
		System.out.println("打印PI的值：" + PI);
		System.out.println("打印球的体积:" + volume);
	}

}
