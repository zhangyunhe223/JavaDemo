package com.Chapter9.com;

public class StaticInnerClass {
	/*
	 * ����һ����̬�ڲ���Innner
	 */
	static int x = 100;

	static class Innner {
		static void doitInner() {
			System.out.println("�ⲿ�ࣺ" + x);
		}

		public static void main(String[] args) {
			doitInner();
		}
	}
}
