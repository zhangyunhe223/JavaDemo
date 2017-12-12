package com.Chapter5.com;

public class GetDay {

	public static void main(String[] args) {
		// 遍历一维数组
		int day[] = {31,28,31,30,31,30,31,30,31,31,31,30}; 
		for(int i = 0;i < 12;i++) {
			System.out.print((i +1 ) + "月" + day[i] + "天 " + "\t");
			if((i + 1) % 4 == 0) {
				System.out.println();
			}
		}
/*		for (int i : day) {
			System.out.print(i + " ");
		}*/
	}

}
