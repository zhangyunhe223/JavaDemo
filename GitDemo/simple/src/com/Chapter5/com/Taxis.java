package com.Chapter5.com;

import java.util.Arrays;
import java.util.Collections;

public class Taxis {

	public static void main(String[] args) {
		// ����һά����󣬲���������������
		Integer array[] = { 52, 94, 36, 58, 74, 215, 54 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("˳�����У�");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("�������У�");
		Arrays.sort(array, Collections.reverseOrder());
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
