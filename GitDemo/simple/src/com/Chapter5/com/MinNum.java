package com.Chapter5.com;

public class MinNum {

	public static void main(String[] args) {
		System.out.println("���һά���飺");
		int arr[] = {55,66,88,22,99,44,101,9,9};
		int max = GetMax(arr);
		System.out.println("���ֵ��" + max);
//		int min = GetMax(arr);
//		System.out.println("��Сֵ��" + min);
		
	}

	public static int GetMax(int[] arr) {
		// ��ȡһά�������Сֵ
		int max = 0;
		int min = 0;
		for(int i = 0;i <arr.length;i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] > max) {
				max = arr[i];
			}else
				min = arr[i];
		}
		return max;
	}

}
