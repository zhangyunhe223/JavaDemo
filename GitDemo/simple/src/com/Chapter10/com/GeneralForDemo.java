package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;

public class GeneralForDemo {

	public static void main(String[] args) {
		/*
		 * �����д���һ��ArrayList���ϣ�����Ϊinteger����
		 * ��Ϊ�����10��Ԫ�أ�����forѭ��������ArrayList���ϣ�Ϊ�����ĵ�Ԫ��
		 */
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			integers.add(i);
		}
		System.out.println("�����10��Ԫ��Ϊ" + "\n" + integers);
		System.out.print("Ϊ������Ԫ��Ϊ��");
		for (int i = 0; i < integers.size(); i += 2) {
			System.out.print(" " + integers.get(i));
		}
		System.out.println();
		System.out.print("Ϊż����Ԫ��Ϊ��");
		for (int i = 1; i < integers.size(); i += 2) {
			System.out.print(" " + integers.get(i));
		}
	}

}
