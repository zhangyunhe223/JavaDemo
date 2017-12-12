package com.Chapter5.com;

public class OneArrayMemory {

	public static void main(String[] args) {
		// �Ա�һά���顢��ά������ռ��С

		// ����һά���飬��ռ�ڴ��С
		int num1 = 1024 * 1024;
		int[] array1 = new int[num1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
		}
		// ��ȡռ���ڴ�����
		long memory1 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.println("��һά����洢��ռ���ڴ�ռ�Ϊ��" + memory1);

		// ����һά���飬��ռ�ڴ��С
		int num2 = 1024 * 1024;
		int[][] array2 = new int[num2][2];
		for (int i = 0; i < array2.length; i++) {
			array2[i][0] = i;
			array2[i][1] = i;
		}
		// ��ȡռ���ڴ�����
		long memory2 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.println("�ö�ά����洢��ռ���ڴ�ռ�Ϊ��" + memory2);

	}

}
