package com.Chapter10.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemp {

	public static void main(String[] args) {
		// ����People��
		Set<People> peoples = new HashSet<People>();
		peoples.add(new People("С��", 2012));
		peoples.add(new People("С��", 2013));
		peoples.add(new People("С��", 2014));
		peoples.add(new People("С��", 0224));
		Iterator<People> iterator = peoples.iterator();
		System.out.println("�����е�Ԫ���ǣ�");
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
