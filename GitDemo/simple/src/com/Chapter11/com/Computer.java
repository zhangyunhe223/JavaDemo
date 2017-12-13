package com.Chapter11.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Computer {
	/**
	 * 计算两个数的公约数 
	 * 
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			System.out.println("计算两个数的最大公约!!");
			System.out.println("请输入第一个正整数：");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			int num1 = Integer.parseInt(br1.readLine());
			System.out.println("请输入第二个正整数：");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			int num2 = Integer.parseInt(br2.readLine());
			int Maxcommin_divisor;
			if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					Maxcommin_divisor = common(num1, num2);
				} else {
					Maxcommin_divisor = common(num2, num1);
				}

				System.out.print("最大公约数是：" + Maxcommin_divisor);
			} else {
				System.out.print("输入的数不是正整数");
			}
		} catch (Exception e) {
			System.out.print("输入的数不是正整数");
		}
	}

	private static int common(int a, int b) {
		if (a % b == 0)
			return b;
		else
			return common(b, a % b);
	}
}
