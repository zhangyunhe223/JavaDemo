package com.Chapter8.com;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestClassicExample01 {

	public static void main(String[] args) {
		/*
		 * ���������ȶ���һ��List����������3��Employee���󣬲�ͨ��������������е�Ԫ��
		 * ��ͨ��Collections.sort()����ִ���Զ�����
		 * �����ͨ��������������ļ����е�Ԫ��
		 */
		List<ClassicExample01> list = new ArrayList<ClassicExample01>();
		list.add(new ClassicExample01(196, "123", 25));
		list.add(new ClassicExample01(196, "123", 25));
		list.add(new ClassicExample01(456, "456", 12));
		list.add(new ClassicExample01(189, "432", 56));
		System.out.println("����ǰ��");
		for (ClassicExample01 classicExample01 : list) {
			System.out.println(classicExample01);
		}
		System.out.println("����ǰ��");
		Collections.sort(list);
		for (ClassicExample01 classicExample01 : list) {
			System.out.println(classicExample01);
		}
	}

}
