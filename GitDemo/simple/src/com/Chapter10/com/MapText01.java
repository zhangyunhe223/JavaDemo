package com.Chapter10.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText01 {

	public static void main(String[] args) {
		/*
		 * ��ӡHashMap
		 * ��ͨ��TreeMap����
		 */
		Map<String,String>  map = new HashMap<>();
		// ����Emp����
		Emp emp01 = new Emp("0009", "name01");
		Emp emp02 = new Emp("0010", "name02");
		Emp emp03 = new Emp("0006", "name03");
		Emp emp04 = new Emp("0003", "name04");
		// ��������ӵ�������
		map.put(emp01.getE_id(), emp01.getE_name());
		map.put(emp02.getE_id(), emp02.getE_name());
		map.put(emp03.getE_id(), emp03.getE_name());
		map.put(emp04.getE_id(), emp04.getE_name());
		// ��ȡMap�����е�key���󼯺�
		Set<String> set = map.keySet();
		// �������ϵ�����
		Iterator<String> iterable = set.iterator(); 
		// ����Map����
		System.out.println("����ǰ��");
		while (iterable.hasNext()) {
			String string = iterable.next();
			String name = map.get(string);
			System.out.println(string + " " + name);
		}
		System.out.println("foreach�����");
		// ����TreeMap���϶���
		TreeMap<String, String> map2 = new TreeMap<>(); 
		// �򼯺�����Ӷ���
		map2.putAll(map);
		// ͨ��foreach����
		Set<String> set2 = map2.keySet();
		for (String string : set2) {
			System.out.println(string + " " + map2.get(string));
		}
		System.out.println("ͨ�����������б���");
		// ͨ�����������б���
		Iterator<String> iterator = map2.keySet().iterator();
		while (iterator.hasNext()) {
			// ��ȡ����������key�Ķ���
			String string = iterator.next();
			// ��ȡ����������values��ֵ
			String name = map2.get(string);
			System.out.println(string + " " + name);
		}
	}

}
