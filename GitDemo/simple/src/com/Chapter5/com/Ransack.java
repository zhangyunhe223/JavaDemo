package com.Chapter5.com;

public class Ransack {

	public static void main(String[] args) {
		// ��ά����Ĵ�ӡ

		// ����һ����λ����
		int array[][][] = new int[][][] { { { 1, 2, 3, }, { 4, 5, 6, } }, { { 7, 8, 9, }, { 10, 11, 12 } },
				{ { 13, 14, 15 }, { 16, 17, 18 } } };

		for (int i = 0; i < array.length; i++) {
			// System.out.println("��ά����ĵ�" + (i+1) + "��Ԫ�ض�ά���飬��������");
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k] + "\t");
				}
				System.out.println();
			}
		}
	}

}
