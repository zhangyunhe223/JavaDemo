package com.Chapter5.com;

public class HomeWork02 {

	public static void main(String[] args) {
		// ����һά���飬�����ֵ���
		int a[] = { 8,1,5,9,2,45,2,5,0};
		
		int max = 0;
		for(int i = 0;i < a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.print("���ֵΪ��" + max);
	}

}
