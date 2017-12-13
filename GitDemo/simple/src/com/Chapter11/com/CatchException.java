package com.Chapter11.com;

public class CatchException {
	/**
	 * 经典范例一：
	 * 捕获单个异常
	 * @param args
	 */
	public static void main(String[] args) {
		// test
		try {
			System.out.println("进入try语句...");
			@SuppressWarnings("unused")
			Class<?> clazz = Class.forName("com.mingrikeji");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("进入catch语句...");
			e.printStackTrace();
			System.out.println("离开catch语句...");
		} finally {
			System.out.println("进入finally语句...");
		}
	}

}
