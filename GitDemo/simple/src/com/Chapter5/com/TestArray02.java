package com.Chapter5.com;

public class TestArray02 {

	public static void main(String[] args) {
		/*
		 * �����ļ�
		 * 1.�ȶ���һ����ά����
		 * 2.��ӡ��ά����
		 * 3.�ڽ��м������ļ�
		 */
		int array[][] = new int [][]{{01,2,3},{14,5,6},{17,8,19}};
		int sum = 0;
		System.out.println("�ȱ�����ά���������ֵ��");
		
		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		for(int i = 0;i < array.length;i++) {
			sum = sum + array[i][i];
		}
		System.out.print(sum);
	}

}
