package com.Chapter5.com;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// ʹ��ʹ�þ�̬����fill���������е�Ԫ�ؽ����滻
		
		// ͨ��Arrays.fill(array,8);����
		int array[] = new int[5];
		Arrays.fill(array,8);
		System.out.println("ͨ��Arrays.fill(array,8);����:");
		for(int i = 0;i < array.length;i++) {
			System.out.println("��" + (i + 1) + "Ԫ��:"+ " " + array[i]);
		}
	}

}
