package com.Chapter4.com;

public class BreakCycle {

	public static void main(String[] args) {
		// 终止循环体

		System.out.println("-------终止单层循环--------");
		/*
		 * 1.创建一个字符串数组aves[]
		 * 2.再使用foreach语句遍历
		 * 3.当发现数组中包含"猫头鹰"时，立刻终止循环
		 */
		String aves[] = { "白鹭", "喜鹊", "白鸽", "猫头鹰", "天鹅", "丑小鸭", "百灵鸟", "乌鸦" };
		System.out.println("当你看你猫头鹰时,你所看到的有哪些鸟:");

		// 利用foreach循环遍历数组
		for (String string : aves) {
			if (string.equals("猫头鹰")) {
				break;
			}
			System.out.println("有：" + string + "\t");
		}
		
		/*
		 * 1.创建一个整数类型二维数组
		 * 2.再使用双层foreach语句循环遍历
		 * 3.当发现一个小于60的数组元素时，立刻终止整个双层循环
		 */
		System.out.println("-------终止双层循环--------");
		int[][] arry = new int[][]{{67,87,95,14,},{60,41,50},{70,50,60},{10,20,30}};
		System.out.println("宝宝这次成绩为：\n 数学\t 语文\t 英语\t 美术\t 历史\t");
		
		No1 : for (int[] is : arry) {
			for (int i : is) {
				System.out.print(i + "\t");
				if(i < 60) {
					System.out.print("\n等等..." + "“"+ i + "”" + "分是什么？这个为什么不及格？");
					break No1;
				}
			}
		}
	}

}
