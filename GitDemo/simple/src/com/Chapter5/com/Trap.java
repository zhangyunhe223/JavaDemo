package com.Chapter5.com;

public class Trap {

	public static void main(String[] args) {
		// 打印二维数组
		int array[][] = { { 1, 2, 3,4 }, { 4, 5, 6,7 }, { 7, 8, 9,10 },{10,11,12,13}};
		
/*		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}*/
		for (int[] is : array) {
			for (int i : is) {
				if(i % 4 ==0) {
				}
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}
