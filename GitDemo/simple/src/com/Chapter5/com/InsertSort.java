package com.Chapter5.com;

public class InsertSort {

	public static void main(String[] args) {
		// ʹ��ֱ�Ӳ�����������
		int a[] = { 8,1,5,9,2,45,2,5,0};
		int b[] = { 8,1,5,9,2,45,2,5,0};
		int c[] = { 8,1,5,9,2,45,2,5,0};
		System.out.println("---DirectSort03---");
		DirectSort03(c);
		System.out.println();
		System.out.println("---DirectSort02---");
		DirectSort02(b);
		System.out.println();
		System.out.println("---DirectSort01---");
		DirectSort01(a);
	}
	// ʹ��ð������
	private static void DirectSort03(int[] c) {
		// ͨ��ð������
		System.out.println("��ӡ����ǰ�����飺");
		for(int i = 0;i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("��ӡð�������˳��");
		int tem;
		for(int i = 0;i < c.length-1;i++) {
			for(int j = 0;j <= c.length-1-1;j++) {
				if(c[j] > c[j+1]) {
					tem = c[j];
					c[j] = c[j+1];
					c[j+1] = tem;
				}
			}
		}
		for(int i = 0;i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
	}
	// ʹ��ֱ������
	private static void DirectSort02(int[] b) {
		// ʹ��ֱ�Ӳ����������򷽷�2
		System.out.println("��ӡ����ǰ��˳��");
		for(int i = 0;i < b.length;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("��ӡֱ��������˳��");
		int tem;
		for(int i = 1;i < b.length;i++) {
			for(int j = i;j > 0;j--) {
				if(b[j] < b[j-1]) {
					tem = b[j-1];
					b[j-1] = b[j];
					b[j] = tem;
				}
			}
		}
		for(int i = 0;i < b.length;i++) {
			System.out.print(b[i] + " ");
		}
	}
	// ʹ��ѡ������
	private static void DirectSort01(int[] a) {
		// ʹ��ֱ�Ӳ����������򷽷�1
		
		System.out.println("��ӡ����ǰ��˳��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("��ӡʹ��ѡ��������˳��");
		int temp = 0;
		for (int i = 0; i < a.length - 1;i++) {
			for(int j = i + 1;j < a.length;j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
