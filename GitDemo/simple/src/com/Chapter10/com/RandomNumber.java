package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		/**
		 * ��1-28֮�������ȡ9�����ظ�������
		 */
		List<Object> list = new ArrayList<>();
		for (int i = 1; i <= 28; i++) {
			list.add(i);
		}
		Random random = new Random();
		System.out.println("�������9�����֣�");
		for (int i = 1; i <= 9; i++) {
			int t = random.nextInt(list.size());
			System.out.print(" " + list.get(t));
		}
		System.out.println();
		System.out.println("�������9�����ظ����֣�");
		for (int i = 1; i <= 9; i++) {
			int t = random.nextInt(list.size());
			System.out.print(" " + list.get(t));
			// �Ƴ��ظ���Ԫ��
			list.remove(list.get(t));
		}
	}

}
