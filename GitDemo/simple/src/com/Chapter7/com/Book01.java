package com.Chapter7.com;

public class Book01 {

	/*
	 * ͳ��ͼ������
	 */
	// ����һ��������
	private static int counter = 0;

	public Book01(String title) {
		System.out.println("����ͼ�飺" + title);
		counter++;
	}

	public static int getCounter() {
		return counter;
	}
}
