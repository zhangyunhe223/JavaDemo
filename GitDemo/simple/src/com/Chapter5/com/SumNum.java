package com.Chapter5.com;

public class SumNum {

	public static void main(String[] args) {
		// ��һά�����и���Ԫ�صĺ�
		arr01();
		arr02();
	}

	public static void arr01() {

		// ����һ��һά����1����9
		int arr01[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// ����һ���ۼ���͵ı���
		int sum = 0;
		for (int i = 0; i <= arr01.length; i++) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println("һά����1����10��sum:" + sum);
		System.out.println("---------------");
	}

	private static void arr02() {
		// ����һ��һά����1����9
		int arr02[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// ����һ���ۼ���͵ı���
		int sum = 0;
		System.out.println("һά����1����10��sum:");
		for (int i = 0; i < arr02.length; i++) {
			if (i == 9) {
				System.out.print(arr02[i] + "=");
			} else {
				System.out.print(arr02[i] + "+");
			}
			sum = sum + arr02[i];
		}
		System.out.println(sum);
	}

}
