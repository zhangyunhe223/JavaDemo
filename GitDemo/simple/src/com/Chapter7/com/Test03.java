package com.Chapter7.com;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * ͳ��ͼ������
		 */
		// ������������
		String[] array = {"111","222","333"};
		for(int i = 0;i < 5;i++) {
			new Book01(array[new Random().nextInt(3)]);
		}
		System.out.println("һ��������" + Book01.getCounter() + "��ͼ�飡");
	}

}
