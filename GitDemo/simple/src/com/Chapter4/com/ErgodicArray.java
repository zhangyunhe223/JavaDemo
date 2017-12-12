package com.Chapter4.com;

public class ErgodicArray {

	public static void main(String[] args) {

		/*
		 * 利用自增运算符结合while循环遍历数组 
		 * 1.创建一个鸟类数组 
		 * 2.创建一个索引变量
		 */
		String aves[] = { "白鹭", "喜鹊", "白鸽", "猫头鹰", "天鹅", "丑小鸭", "百灵鸟", "乌鸦" };
		int index = 0;
		
		{
			System.out.println("我家公园里有很多鸟,主要有：");
			System.out.println("利用自增运算符结合while循环遍历数组：");
			while(index < aves.length) {
				// 自增索引值
				System.out.println(aves[index++] + " ");
			}
			System.out.println("---------------------");
		}
		
		// 利用foreach循环遍历数组 
		{
			System.out.println("利用foreach循环遍历数组 ：");
			for (String string : aves) {
				System.out.println(string + "\t");
			}
		}
	}

}
