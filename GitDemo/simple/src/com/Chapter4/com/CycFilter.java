package com.Chapter4.com;

public class CycFilter {

	public static void main(String[] args) {
		/*
		 * 1.创建鸟类名称的字符串数组，其中包括“老鹰”字符串 
		 * 2.然后通过foreach循环遍历该数组 
		 * 3.把“老鹰”的信息过滤掉
		 */
		String aves[] = { "白鹭", "老鹰", "喜鹊", "白鸽", "老鹰", "猫头鹰", "天鹅", "丑小鸭", "百灵鸟", "老鹰", "乌鸦" };
		System.out.println("最近院子来了老鹰，请把它们抓走...");

		// 定义循环增量
		int birdCount = 0;
		for (String string : aves) {
			System.out.println("寻找中...");
			if (string.equals("老鹰")) {
				System.out.println("发现一只老鹰，已经抓走了...");
				birdCount++;
				continue;
			}
			System.out.println("寻找鸟类，发现了" + string);
		}
		System.out.println("一共抓到" + birdCount + "老鹰！");
	}

}
