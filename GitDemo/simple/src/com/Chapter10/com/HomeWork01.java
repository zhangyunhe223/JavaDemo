package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		 *  ��1-100֮������������������һ��list������
		 *  ��������������λ����10�Ķ���Ӽ�����ɾ��
		 */
		List<Integer> integers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			integers.add(i);
		}
		System.out.println("�Ƴ�ǰ���еļ��ϣ�" + "\n" + integers);
		System.out.println("�������λ��Ϊ10�Ķ���" + integers.get(10)); // ��ȡָ������Ԫ��
		integers.remove(10); // �Ƴ�ָ������Ԫ��
		System.out.println("�Ƴ������еļ��ϣ�" + "\n" + integers);
	}

}
