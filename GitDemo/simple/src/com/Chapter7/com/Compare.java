package com.Chapter7.com;

public class Compare {

	public static void main(String[] args) {
		// ±È½Ï¡°==¡±ºÍ¡°¡±
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = s1;
		System.out.println("==£º" + (s2==s3));
		System.out.println("equals£º" +(s2.equals(s3)));
	}

}
