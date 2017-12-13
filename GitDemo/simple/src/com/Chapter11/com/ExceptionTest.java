package com.Chapter11.com;

public class ExceptionTest {
	/**
	 * 范例一： 算术异常
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 演示负浮点数除0
		System.out.println("-1.0/0:" + "\n" + (-1.0 / 0));
		// 演示正浮点数除0
		System.out.println("+1.0/0:" + "\n" + (+1.0 / 0));
		// 演示负整数除0
		try {
			System.out.println("-1/0:" + "\n" + (-1 / 0));			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("抛出异常:" + e.getMessage());
		}
		// 演示正整数除0
		try {			
			System.out.println("+1/0:" + "\n" + (+1 / 0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("抛出异常:" + e.getMessage());
		}
	}

}
