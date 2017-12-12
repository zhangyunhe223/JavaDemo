package com.Chapter4.com;

import com.Chapter3.com.SumNumber;

public class MultiplicationTable {

	public static void main(String[] args) {
		{
			// 使用for循环语句输出99乘法表
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}
				System.out.println();
			}
			System.out.println("----------------------" );
		}
		{
			// 使用for循环语句打印1-100的连续整数的和
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			System.out.println("1-100的连续整数的和:" + sum);
			System.out.println("----------------------" );
		}
		{
			// 使用for循环语句打印1-100的连续整数的和，当sum > 1000的时候跳出循环
			int sum = 0;
			String flag = "";
			for(int i = 1 ;i <= 100; i++) {
				sum +=i;
				System.out.println("当i=" + i + "时的sum=" + sum);
				
				// 当sum > 1000的时候跳出循环
				if(sum > 1000) {
					System.out.println("sum > 1000,跳出循环，结果如下：");
					flag = "从1到" + i +"连续整数的和:";
					break;
				}
				
			}
			System.out.println(flag + sum);
			System.out.println("----------------------" );
		}
/*		{
			// 使用for循环语句打印1-100的连续整数的和，当sum > 1000的时候跳出循环
			int sum = 0;
			for(int i = 1 ;i <= 45; i++) {
				sum +=i;
				System.out.println("当i=" + i + "时的值为：" + sum);
			}
			System.out.println(sum);
		}*/
	}

}
