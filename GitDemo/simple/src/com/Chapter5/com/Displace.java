package com.Chapter5.com;

import java.util.Arrays;

public class Displace {

	public static void main(String[] args) {
		// ʹ��ʹ�þ�̬����fill���������е�Ԫ�ؽ����滻
		// ͨ��Arrays.fill(a, fromIndex, toIndex, val);����,
		int array[] = new int[] {1,2,3,4,5,6};
		Arrays.fill(array, 0, 4, 9);
		System.out.println("ͨ��Arrays.fill(a, fromIndex, toIndex, val);����:");
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("-------------");
		for(int i = 0;i < array.length;i++) {
			System.out.println("��" + (i + 1) + "Ԫ��:"+ " " + array[i]);
		}
	}

}
