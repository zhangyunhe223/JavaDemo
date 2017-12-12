package com.Chapter9.com;

public class StaticInnerClass {
	/*
	 * 定义一个静态内部类Innner
	 */
	static int x = 100;

	static class Innner {
		static void doitInner() {
			System.out.println("外部类：" + x);
		}

		public static void main(String[] args) {
			doitInner();
		}
	}
}
