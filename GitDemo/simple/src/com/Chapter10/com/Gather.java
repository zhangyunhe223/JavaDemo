package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gather {

	public static void main(String[] args) {
		String ls1;
		// ����list���϶���
		List<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		Random random = new Random();
		System.out.println("�������е�Ԫ�أ�");
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println("�����ȡ�����е�һ��Ԫ�أ�" + "\n" + list.get(random.nextInt(list.size())));
		list.remove(2);
		System.out.println("�Ƴ�������ָ������Ϊ2�����е�Ԫ�أ�");
		for (int j = 0;j < list.size();j++) {
			System.out.print(list.get(j) + " ");
		}
	}

}
