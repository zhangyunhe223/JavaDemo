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

		// ����List<String>
		List<String> ls = new ArrayList<String>();
//		String ku = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String ku = "0123456789";
		// ����һ��StringBuilder���Ա������ɵ��ַ���
		StringBuilder newStr = new StringBuilder();
		// ����һ��Random��������α�������Ҳ�ɲ���Math.random()��ʵ��
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
		System.out.println("===����ǰ===");
		for (String s : tattedCode) {
			System.out.println(s);
		}
		Collections.sort(tattedCode);
		System.out.println("===�����===");
		for (String sec : tattedCode) {
			System.out.println(sec);
		}
	}
}
