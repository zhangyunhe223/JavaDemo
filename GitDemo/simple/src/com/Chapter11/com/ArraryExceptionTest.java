package com.Chapter11.com;

import java.util.Arrays;

public class ArraryExceptionTest {
	/**
	 * �����±�Խ���쳣
	 * ����������±�Խ�緽��
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ������Ϊ5����������
		int[] a = new int[5];
		Arrays.fill(a, 8);
		for (int i = 0; i < 10; i++) {
			// ����ʾ�����±�Խ��
			System.out.println(a[i]);
		}
		
		// ͨ���������ַ�ʽ���Ա��������±�Խ��
/*		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		// foreachѭ������ӡ
/*		for (int i : a) {
			System.out.println(i);
		}*/
	}
}
