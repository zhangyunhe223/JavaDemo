package com.Chapter5.com;

import java.util.Arrays;

public class Repeat {

	public static void main(String[] args) {
		// ����һά���飬���������е�����λ��Ϊ0-3֮���Ԫ�ظ��Ƶ���������
		int array01[] = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("��ӡ����ǰ������Ԫ�أ�");
		for (int i = 0; i < array01.length; i++) {
			System.out.print(array01[i] + " ");
		}
		System.out.println();
		System.out.println("��ӡ���ƺ������Ԫ�أ�");
		int array02[] = Arrays.copyOfRange(array01, 0, 3);
		for (int i = 0; i < array02.length; i++) {
			System.out.print(array02[i] + " ");
		}
	}

}
