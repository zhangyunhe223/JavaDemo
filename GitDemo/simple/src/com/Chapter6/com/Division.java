package com.Chapter6.com;

public class Division {

	public static void main(String[] args) {
		String string = new String("dfas-fa-qewrq-dfa-fas");
		String[] s1 = string.split("-");
		String[] s2 = string.split("-", 4);
		System.out.println("被分割出来的字符串为：");
		for(int i = 0;i < s1.length;i++) {
			System.out.println(s1[i]);
		}
		System.out.println("--------");
		for(int i = 0;i < s2.length;i++) {
			System.out.println(s2[i]);
		}
	}

}
