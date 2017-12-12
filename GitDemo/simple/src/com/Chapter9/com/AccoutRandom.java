package com.Chapter9.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AccoutRandom {
	/*
	 * 
	 */
	public List<String> testRandomString(int order) {

		// 创建List<String>
		List<String> ls = new ArrayList<String>();
//		String ku = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String ku = "0123456789";
		// 定义一个StringBuilder用以保存生成的字符串
		StringBuilder newStr = new StringBuilder();
		// 创建一个Random用以生成伪随机数，也可采用Math.random()来实现
		Random r = new Random();
		for (int j = 0; j < order; j++) {
			do {
				newStr.delete(0, newStr.length());
				int r1 = r.nextInt(10) + 1;
				for (int i = 0; i < r1; i++) {
					int r2 = r.nextInt(ku.length());
					newStr.append(ku.charAt(r2));
				}
			} while (ls.contains(newStr.toString()));
			ls.add(newStr.toString());
		}
		return ls;
	}
	public static void main(String[] args) {
		AccoutRandom t = new AccoutRandom();
		List<String> tattedCode = t.testRandomString(3);
		System.out.println("===排序前===");
		for (String s : tattedCode) {
			System.out.println(s);
		}
		Collections.sort(tattedCode);
		System.out.println("===排序后===");
		for (String sec : tattedCode) {
			System.out.println(sec);
		}
	}
}
