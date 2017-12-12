package com.Chapter6.com;

public class StartOrEnd {

	public static void main(String[] args) {
		String num1 = "225454618";
		String num2 = "215454666";
		
		String num3 = "zhang YUNHE";
		String s1 = num3.toLowerCase();
		String s2 = num3.toUpperCase();
		
		System.out.println(num1.startsWith("22"));
		System.out.println(num2.endsWith("18"));
		System.out.println(num1.startsWith("21"));
		System.out.println(num2.endsWith("66"));
		
		System.out.println("转换成小写：" + s1);
		System.out.println("转换成大写：" + s2);
	}

}
