package com.Chapter6.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChinseseAmount {

	public static void main(String[] args) {
		// 使用正则表达式匹配汉字：[\\u4e00-\\u9fa5]
		System.out.println("请输入一篇文章：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String regex = "[\\u4e00-\\u9fa5]";
		/*
		 * 判断有没有中文
		 * 听着张杰的歌《我们都一样》：你知道我的梦，你知道我的痛，你知道我们的感受都相同……好像确实应该这样，我们每个人都一样，有着一样的梦想，一样的方向，渴望同样的光芒，同样需要坚强起来，需要勇敢起来。分享你我的力量就可以把对方照亮……
		 */
		if(string.getBytes().length == string.length()) {
			System.out.println("无汉字！");
		}else {
			int count = 0;
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(string);
			while(matcher.find()) {
				count++;
			}
			System.out.println("有多少个汉字：" + count);
		}
	}

}
