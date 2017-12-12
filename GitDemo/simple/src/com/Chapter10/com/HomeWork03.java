package com.Chapter10.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomeWork03 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Emp emp01 = new Emp("001", "name001");
		Emp emp02 = new Emp("002", "name002");
		Emp emp03 = new Emp("003", "name003");
		Emp emp04 = new Emp("004", "name004");
		Emp emp05 = new Emp("005", "name005");
		map.put(emp01.getE_id(), emp01.getE_name());
		map.put(emp02.getE_id(), emp02.getE_name());
		map.put(emp03.getE_id(), emp03.getE_name());
		map.put(emp04.getE_id(), emp04.getE_name());
		map.put(emp05.getE_id(), emp05.getE_name());
		
		System.out.println("打印map所添加的键和值：");
		// 获取Map集合中的key对象集合
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println("打印map所删除id为005的键和值：");
		
//		map.remove(emp04.getE_id());
		map.remove("004");
		Set<String> set2 = map.keySet();
		for (String key : set2) {
			System.out.println(key + " " + map.get(key));
		}
		
		// 通过迭代器进行删除,只能删除value值？
/*		System.out.println("-----------------------------");
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (key.equals("004")) {
				iterator.remove();
				map.remove(key);
			}
			System.out.println(key + " " + map.get(key));
		}*/
	}
}
