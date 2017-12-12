package com.Chapter7.com;

public class StaticTest {
	static double PI = 3.14;
	static int id;
	
	public static void method01() {
		// 方法体
	}
	
	public void method2() {
		System.out.println(StaticTest.id);
		System.out.println(StaticTest.PI);
		StaticTest.method01();
	}
	public static StaticTest method3() {
		/*
		 * 1.在静态方法中不能使用this关键字
		 * 2.在静态方法中不能直接调用非静态方法
		 */
/*		method02();
		return this;*/
		return null;
	}
	public void method() {
//		static int i = 0;
	}
	static {
		int i = 0;
	}
}
