package com.Chapter7.com;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * 统计图书销量
		 */
		// 创建书名数组
		String[] array = {"111","222","333"};
		for(int i = 0;i < 5;i++) {
			new Book01(array[new Random().nextInt(3)]);
		}
		System.out.println("一共销售了" + Book01.getCounter() + "本图书！");
	}

}
