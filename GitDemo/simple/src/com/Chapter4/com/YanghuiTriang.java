package com.Chapter4.com;

import java.util.Scanner;

public class YanghuiTriang {
	
	// ��ӡ�������

	public static void main(String[] args) {
		// ����������ǵĵķ�������
		System.out.println("������������ǵı���������");
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		System.out.println("--------------------");
		YangHui(lines);
	}
	
	// ʵ��������ǵķ���
	public static void YangHui(int lines) {
		// �ȶ������ά����
		int arr[][] = new int[lines][];
		// ��ʹ��forѭ������
		for(int i = 0;i < arr.length;i++) {
			// ��ӡÿ�е�һ����*��ǰ�Ŀո���
			for (int h = 1; h <= lines - i; h++) {
				System.out.print(" ");
			}
			// ��ʼ�����������С
			arr[i] = new int[i+1];
			// ������������
			for(int j = 0;j <= i;j++) {
				// ��������Ԫ�ص�ֵΪ1
				if(i == 0 || j ==0 || i == j) {
					arr[i][j] = 1;
				}else {
					//  ��ͨ�����¼��㷽ʽ��������ֵ
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
