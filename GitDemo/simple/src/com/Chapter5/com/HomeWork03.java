package com.Chapter5.com;

public class HomeWork03 {

	public static void main(String[] args) {
		// ����һ����ά���飬�����е�Ԫ�غ����
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10}};
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				sum = sum + a[i][j] ;
			}
		}
		System.out.print(sum);
	}

}
