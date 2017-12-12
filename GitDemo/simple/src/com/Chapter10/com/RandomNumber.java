package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		/**
		 * 从1-28之间随机抽取9个不重复的数字
		 */
		List<Object> list = new ArrayList<>();
		for (int i = 1; i <= 28; i++) {
			list.add(i);
		}
		Random random = new Random();
		System.out.println("随机生成9个数字：");
		for (int i = 1; i <= 9; i++) {
			int t = random.nextInt(list.size());
			System.out.print(" " + list.get(t));
		}
		System.out.println();
		System.out.println("随机生成9个不重复数字：");
		for (int i = 1; i <= 9; i++) {
			int t = random.nextInt(list.size());
			System.out.print(" " + list.get(t));
			// 移除重复的元素
			list.remove(list.get(t));
		}
	}

}
