package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;

public class GeneralForDemo {

	public static void main(String[] args) {
		/*
		 * 在类中创建一个ArrayList集合，定义为integer泛型
		 * 并为其添加10个元素，利用for循环语句遍历ArrayList集合，为奇数的的元素
		 */
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			integers.add(i);
		}
		System.out.println("插入的10个元素为" + "\n" + integers);
		System.out.print("为奇数的元素为：");
		for (int i = 0; i < integers.size(); i += 2) {
			System.out.print(" " + integers.get(i));
		}
		System.out.println();
		System.out.print("为偶数的元素为：");
		for (int i = 1; i < integers.size(); i += 2) {
			System.out.print(" " + integers.get(i));
		}
	}

}
