package com.Chapter10.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		/*
		 * set()
		 * add()
		 * addAll()
		 */
		// 要添加到集合中的对象string
		String a = "A",b = "B",c = "C",d = "D",e = "E",apple = "apple";
		// 创建List集合
		List<String> list = new LinkedList<String>();
		list.add(a);
		list.add(e);
		list.add(d);
		System.out.println("修改前的集合：" + list);
		list.add(apple);
		list.set(1, b);
		list.add(apple);
		list.add(4, c);
		System.out.print("修改后的集合：");
		// 创建集合的迭代器并打印
		Iterator<String> iterator = list.iterator();
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println("\n" + "apple第一次出现的索引位置：" + list.indexOf(apple));
		System.out.println("apple最后一次出现的索引位置：" + list.lastIndexOf(apple));
		System.out.println(list);
		Set<String> setString = new HashSet<>();
		setString.addAll(list);
		Iterator<String> iterator1 = list.iterator();
		for (String string : setString) {
			System.out.print(string + " ");
		}
		
		// 添加元素
		System.out.println();
		System.out.println("----------------");
		List<String> list2 = new ArrayList<>();
		list2.add("apple");
		list2.add("red");
		list2.add("bule");
		list2.add("apple");
		System.out.println(list2);
		Set<String> set = new HashSet<>();
		set.addAll(list2);
		Iterator<String> iterator2 = list2.iterator();
		for (String string : set) {
			System.out.print(string + " ");
		}
	}

}
