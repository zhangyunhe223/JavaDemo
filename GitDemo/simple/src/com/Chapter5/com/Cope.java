package com.Chapter5.com;

import java.util.Arrays;

public class Cope {

	public static void main(String[] args) {
		// ����һ��һά���鳤��Ϊ3��ʵ�ֽ������鸴�Ƶõ�һ������Ϊ5�������飬����ӡ
		int array[] = new int[] { 45, 87, 45, 154 };
		System.out.println("����ǰ������Ϊ��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("���ƺ������Ϊ��");
		int array02[] = Arrays.copyOf(array, 8);
		for (int i = 0; i < array02.length; i++) {
			System.out.print(array02[i] + " ");
		}
	}

}
