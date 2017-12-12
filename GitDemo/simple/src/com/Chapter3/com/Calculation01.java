package com.Chapter3.com;

public class Calculation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		boolean result1 = ((a > b) && (a != b));
		boolean result2 = ((a > b) || (a != b));
		System.out.println("(a > b) && (a != b)=" + result1);
		System.out.println("(a > b) || (a != b)=" + result2);
	}

}
