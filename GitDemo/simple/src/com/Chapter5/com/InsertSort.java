package com.Chapter5.com;

public class InsertSort {

	public static void main(String[] args) {
		// 使用直接插入排序法排序
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
	// 使用冒泡排序
	private static void DirectSort03(int[] c) {
		// 通过冒泡排序
		System.out.println("打印排序前的数组：");
		for(int i = 0;i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("打印冒泡排序后顺序：");
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
	// 使用直接排序
	private static void DirectSort02(int[] b) {
		// 使用直接插入排序法排序方法2
		System.out.println("打印排序前的顺序：");
		for(int i = 0;i < b.length;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("打印直接排序后的顺序：");
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
	// 使用选择排序
	private static void DirectSort01(int[] a) {
		// 使用直接插入排序法排序方法1
		
		System.out.println("打印排序前的顺序：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("打印使用选择排序后的顺序：");
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
