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
		 * 分别向set集合以及list集合中添加数据(“A”，“a”，“B”，“b”，“a”)
		 * 是否在set集合中以及list集合中添加成功
		 * 总结：
		 * set集合添加：值不能重复添加
		 * list集合添加：值能进行重复添加
		 * map集合添加：key是唯一 value可以重复添加
		 */
		
		// 要添加到集合中的对象string
		String a = "A",b = "a",c = "B",d = "b",e = "a";
		
		Set<String> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		if (set.size() == 5) {			
			System.out.println("重复值“a”能在Set集合中成功添加:" + set);
		}else {
			System.out.println("重复值“a”不能在Set集合中成功添加:" + set);
		}
		
		List<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		if (list.size() == 5) {			
			System.out.println("重复值“a”能在list集合中成功添加:" + list);
		}else {
			System.out.println("重复值“a”不能在list集合中成功添加:" + list);
		}
		
		Map<String, String> map = new HashMap<>();
		map.put("A1", "a");
		map.put("A1", "a");
		map.put("A2", "a");
		map.put("A3", "a");
		if (map.size() == 5) {			
			System.out.println("重复值“a”能在map集合中成功添加:" + map);
		}else {
			System.out.println("重复值“a”不能在map集合中成功添加:" + map);
		}
	}

}
