package com.Chapter7.com;

public class StaticTest {
	static double PI = 3.14;
	static int id;
	
	public static void method01() {
		// ������
	}
	
	public void method2() {
		System.out.println(StaticTest.id);
		System.out.println(StaticTest.PI);
		StaticTest.method01();
	}
	public static StaticTest method3() {
		/*
		 * 1.�ھ�̬�����в���ʹ��this�ؼ���
		 * 2.�ھ�̬�����в���ֱ�ӵ��÷Ǿ�̬����
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
