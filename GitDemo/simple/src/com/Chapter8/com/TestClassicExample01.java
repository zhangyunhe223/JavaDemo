package com.Chapter8.com;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestClassicExample01 {

	public static void main(String[] args) {
		/*
		 * 该类中首先定义一个List集合来保存3个Employee对象，并通过遍历输出集合中的元素
		 * 再通过Collections.sort()方法执行自动排序
		 * 最后再通过遍历输出排序后的集合中的元素
		 */
		List<ClassicExample01> list = new ArrayList<ClassicExample01>();
		list.add(new ClassicExample01(196, "123", 25));
		list.add(new ClassicExample01(196, "123", 25));
		list.add(new ClassicExample01(456, "456", 12));
		list.add(new ClassicExample01(189, "432", 56));
		System.out.println("排序前：");
		for (ClassicExample01 classicExample01 : list) {
			System.out.println(classicExample01);
		}
		System.out.println("排序前：");
		Collections.sort(list);
		for (ClassicExample01 classicExample01 : list) {
			System.out.println(classicExample01);
		}
	}

}
