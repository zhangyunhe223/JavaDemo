package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gather {

	public static void main(String[] args) {
		String ls1;
		// 创建list集合对象
		List<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		Random random = new Random();
		System.out.println("遍历所有的元素：");
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println("随机获取数组中的一个元素：" + "\n" + list.get(random.nextInt(list.size())));
		list.remove(2);
		System.out.println("移除数组中指定索引为2后所有的元素：");
		for (int j = 0;j < list.size();j++) {
			System.out.print(list.get(j) + " ");
		}
	}

}
