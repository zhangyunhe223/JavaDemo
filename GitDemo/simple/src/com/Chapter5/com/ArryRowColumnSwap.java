package com.Chapter5.com;

public class ArryRowColumnSwap {

	public static void main(String[] args) {
		// �Ծ��ν���ת������
		int array[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		System.out.println("ת��ǰ�ľ����ǣ�");
		PrintArray01(array);
		System.out.println("ת�ú�ľ����ǣ�");

		// �ٴ�ӡת�ú��ά����
		int array02[][] = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array02[j][i] = array[i][j];
			}
		}
		PrintArray01(array02);
	}

	private static void PrintArray01(int[][] array) {
		// �ȴ�ӡת��ǰ��ά����
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
