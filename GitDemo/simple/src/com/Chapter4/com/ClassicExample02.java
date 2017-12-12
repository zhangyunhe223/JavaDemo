package com.Chapter4.com;

import java.util.Scanner;

public class ClassicExample02 {

	public static void main(String[] args) {
		System.out.println("How many lines you want:");
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();

        
		YanghuiTruang01(lines);
		YanghuiTruang02(lines);
	}
	public static void YanghuiTruang01(int lines) {
        int[] a = new int[lines + 1];
        int previous = 1;
        for (int i = 1; i <= lines; i ++){
            for (int j = 1; j <= i; j++){
                int current = a[j];
                a[j] = previous + current;
                previous = current;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
	public static void YanghuiTruang02(int lines) {
		// ʹ��forѭ������������
		
		/**
	     * 1.Ҫ��������ʵ�֣�����Ҫ����int������Ԫ��Ĭ��ֵΪ 0
	     * 2.Ȼ��ÿһ�ε�����ӡ�µ�һ�е�Ԫ�ص�ʱ��
	     * �µ��ض�λ�õ�Ԫ�� = ��λ��ԭ����Ԫ�� + ��λ�õ�ǰһ��λ�õ�ֵ
	     */
		
		// ����һ����ά���飬��ָ������ĳ���
		int arr[][] = new int[lines][]; 
		// �ٱ�������
		for(int i = 0;i < arr.length;i++) {
			// ��ʼ���ڶ�������Ĵ�С
			arr[i] = new int[i+1];
			for(int j = 0;j <= arr[i].length-1;j++) {
				if(i == 0 || j == 0 || j == arr[i].length-1) {
					// �����������Ԫ�ظ�ֵΪ1
					arr[i][j] = 1;
				}else {
					// �м������Ԫ��ͨ����ʽ��������
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
