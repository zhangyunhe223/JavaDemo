package com.Chapter10.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemp {

	public static void main(String[] args) {
		// 测试People类
		Set<People> peoples = new HashSet<People>();
		peoples.add(new People("小王", 2012));
		peoples.add(new People("小张", 2013));
		peoples.add(new People("小李", 2014));
		peoples.add(new People("小四", 0224));
		Iterator<People> iterator = peoples.iterator();
		System.out.println("集合中的元素是：");
		while (iterator.hasNext()) {
			People people = iterator.next();
			System.out.println(people.getName() + " " + people.getId_card());
		}
		System.out.println();
		for (People people : peoples) {
			System.out.println(people.getName() + " " + people.getId_card());
		}
	}

}
