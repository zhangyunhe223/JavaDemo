package com.Chapter6.com;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * 判断字符串mingrikejijavabu 中字符'i'出现几次
		 */
		// 截取法
		String s1 = "mingrikejijavabu";
		int count = 0;
		for(int j = 0;j < s1.length();j++) {
			String s2 = s1.substring(j, j + 1);
			if (s2.equals("i")) {
				count++;
			}
		}
		System.out.println("出现的次数：" + count);
		// 
	}

}
