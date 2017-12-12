package com.Chapter10.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText {

	public static void main(String[] args) {
		/*
		 * 排序
		 */
		Map<String, Long> map = new HashMap<String,Long>();
		People peo1 = new People("0001.5", 2013);
		People peo2 = new People("0001.3", 2018);
		People peo3 = new People("0003", 2017);
		People peo4 = new People("0000.1", 2013);
		map.put(peo1.getName(), peo1.getId_card());
		map.put(peo2.getName(), peo2.getId_card());
		map.put(peo3.getName(), peo3.getId_card());
		map.put(peo4.getName(), peo4.getId_card());
		System.out.println(map);
		System.out.println("HashMap类实现的Map集合排序前：");
		// 获取Map集合中的key对象集合
		Set<String> set1 = map.keySet();
		for (String string : set1) {
			System.out.println(string + " " + map.get(string));
		}
		System.out.println("HashMap类实现的Map集合排序后：");
		TreeMap<String, Long> map2 = new TreeMap<String,Long>();
		map2.putAll(map);
		// 使用foreach进行遍历
		Set<String> set2 = map2.keySet();
		for (String string : set2) {
			System.out.println(string + " " + map.get(string));
		}
	}
}
