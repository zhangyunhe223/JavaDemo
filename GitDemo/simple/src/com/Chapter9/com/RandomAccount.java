package com.Chapter9.com;

public class RandomAccount {

	public static void main(String[] args) {
		// ��ʼ������ 
		System.out.println("����Դ��");
		int[] array = new int[5];
		for(int i =0;i < array.length;i++) {
			array[i] = (int) (1000 * Math.random());
			System.out.println(array[i] + "@qq.com");
		}
	}

}
