package com.Chapter4.com;

public class Compound {

	public static void main(String[] args) {
		// 在主方法中定义复合语句块，其中包括另一复合语句块
		{
			int y = 40;
			System.out.println("输入Y的值：" + y);
			int z = 245;
			boolean b;
			// 另一复合语句块
			{
				b = y > z;
				System.out.println("y > z成立么：" + b);
			}
		}
		String wString = "hello java";
		System.err.println("输入字符串的值：" + wString);
	}

}
