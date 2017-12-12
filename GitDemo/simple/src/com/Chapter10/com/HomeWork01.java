package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		 *  将1-100之间的所有正整数存放在一个list集合中
		 *  并将集合中索引位置是10的对象从集合中删除
		 */
		List<Integer> integers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			integers.add(i);
		}
		System.out.println("移除前所有的集合：" + "\n" + integers);
		System.out.println("获得索引位置为10的对象：" + integers.get(10)); // 获取指定索引元素
		integers.remove(10); // 移除指定索引元素
		System.out.println("移除后所有的集合：" + "\n" + integers);
	}

}
