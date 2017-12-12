package com.Chapter6.com;

public class Division01 {

	public static void main(String[] args) {
		// 范例1 根据指定的分隔符吧字符串分行
		String string = new String("无言独上西楼，月如钩，寂寞梧桐深院锁清秋。剪不断，理还乱，是离愁。别是一般滋味在心头。");
		System.out.println("分行后显示：");
		String[] s1 = string.split("，|。");
		for(int i = 0;i < s1.length;i++) {
			System.out.println(s1[i]);
		}
	}

}
