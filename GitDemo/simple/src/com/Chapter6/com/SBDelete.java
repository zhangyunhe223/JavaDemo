package com.Chapter6.com;

public class SBDelete {

	public static void main(String[] args) {
		// 将重复的字符去掉
		String s = "我静静地​坐在窗前，冷风一阵又一阵的向我呼呼吹来，我的脑海了回想起了同学们一次次嘲笑我考试考不好的事，"
				+ "眼前闪过一幕幕令人不愉快的事，望着窗外沙沙飘落的树叶，我不禁感到异常愁胀。";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s);
		System.out.println("一共" + s.length() + "字符");
		for(int i = 0;i < sb.length();i++) {
			for(int j = i + 1;j < sb.length();j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
