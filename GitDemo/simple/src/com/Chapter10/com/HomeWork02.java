package com.Chapter10.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork02 {

	public static void main(String[] args) {
		/**
		 * �ֱ���set�����Լ�list�������������(��A������a������B������b������a��)
		 * �Ƿ���set�������Լ�list��������ӳɹ�
		 * �ܽ᣺
		 * set������ӣ�ֵ�����ظ����
		 * list������ӣ�ֵ�ܽ����ظ����
		 * map������ӣ�key��Ψһ value�����ظ����
		 */
		
		// Ҫ��ӵ������еĶ���string
		String a = "A",b = "a",c = "B",d = "b",e = "a";
		
		Set<String> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		if (set.size() == 5) {			
			System.out.println("�ظ�ֵ��a������Set�����гɹ����:" + set);
		}else {
			System.out.println("�ظ�ֵ��a��������Set�����гɹ����:" + set);
		}
		
		List<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		if (list.size() == 5) {			
			System.out.println("�ظ�ֵ��a������list�����гɹ����:" + list);
		}else {
			System.out.println("�ظ�ֵ��a��������list�����гɹ����:" + list);
		}
		
		Map<String, String> map = new HashMap<>();
		map.put("A1", "a");
		map.put("A1", "a");
		map.put("A2", "a");
		map.put("A3", "a");
		if (map.size() == 5) {			
			System.out.println("�ظ�ֵ��a������map�����гɹ����:" + map);
		}else {
			System.out.println("�ظ�ֵ��a��������map�����гɹ����:" + map);
		}
	}

}
