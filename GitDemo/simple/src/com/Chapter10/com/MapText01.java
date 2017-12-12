package com.Chapter10.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText01 {

	public static void main(String[] args) {
		/*
		 * 打印HashMap
		 * 并通过TreeMap排序
		 */
		Map<String,String>  map = new HashMap<>();
		// 创建Emp对象
		Emp emp01 = new Emp("0009", "name01");
		Emp emp02 = new Emp("0010", "name02");
		Emp emp03 = new Emp("0006", "name03");
		Emp emp04 = new Emp("0003", "name04");
		// 将对象添加到集合中
		map.put(emp01.getE_id(), emp01.getE_name());
		map.put(emp02.getE_id(), emp02.getE_name());
		map.put(emp03.getE_id(), emp03.getE_name());
		map.put(emp04.getE_id(), emp04.getE_name());
		// 获取Map集合中的key对象集合
		Set<String> set = map.keySet();
		// 创建集合迭代器
		Iterator<String> iterable = set.iterator(); 
		// 遍历Map集合
		System.out.println("排序前：");
		while (iterable.hasNext()) {
			String string = iterable.next();
			String name = map.get(string);
			System.out.println(string + " " + name);
		}
		System.out.println("foreach排序后：");
		// 创建TreeMap集合对象
		TreeMap<String, String> map2 = new TreeMap<>(); 
		// 向集合中添加对象
		map2.putAll(map);
		// 通过foreach遍历
		Set<String> set2 = map2.keySet();
		for (String string : set2) {
			System.out.println(string + " " + map2.get(string));
		}
		System.out.println("通过迭代器进行遍历");
		// 通过迭代器进行遍历
		Iterator<String> iterator = map2.keySet().iterator();
		while (iterator.hasNext()) {
			// 获取集合中所有key的对象
			String string = iterator.next();
			// 获取集合中所有values的值
			String name = map2.get(string);
			System.out.println(string + " " + name);
		}
	}

}
