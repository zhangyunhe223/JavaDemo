package com.Chapter10.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// Iterator遍历数组
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("通过Iteator迭代器打印：");
		System.out.println("正序排列：" + "\n" + list);
		Iterator<Integer> iterator = list.iterator();
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println("");
		System.out.println("倒叙排列:");
		ListIterator<Integer> iterator2 = list.listIterator();
		for (iterator2 = list.listIterator();iterator2.hasNext();) {
			iterator2.next();			
		}
		for(;iterator2.hasPrevious();) {
			Integer integer = iterator2.previous();
			System.out.print(integer + " ");
		}
	}

}
