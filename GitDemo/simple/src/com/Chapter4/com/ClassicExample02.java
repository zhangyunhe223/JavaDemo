package com.Chapter4.com;

import java.util.Scanner;

public class ClassicExample02 {

	public static void main(String[] args) {
		System.out.println("How many lines you want:");
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();

        
		YanghuiTruang01(lines);
		YanghuiTruang02(lines);
	}
	public static void YanghuiTruang01(int lines) {
        int[] a = new int[lines + 1];
        int previous = 1;
        for (int i = 1; i <= lines; i ++){
            for (int j = 1; j <= i; j++){
                int current = a[j];
                a[j] = previous + current;
                previous = current;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
	public static void YanghuiTruang02(int lines) {
		// 使用for循环输出杨辉三角
		
		/**
	     * 1.要理解下面的实现，首先要明白int数组中元素默认值为 0
	     * 2.然后每一次迭代打印新的一行的元素的时候：
	     * 新的特定位置的元素 = 该位置原来的元素 + 该位置的前一个位置的值
	     */
		
		// 创建一个二维数组，并指定数组的长度
		int arr[][] = new int[lines][]; 
		// 再遍历数组
		for(int i = 0;i < arr.length;i++) {
			// 初始化第二层数组的大小
			arr[i] = new int[i+1];
			for(int j = 0;j <= arr[i].length-1;j++) {
				if(i == 0 || j == 0 || j == arr[i].length-1) {
					// 将两侧的数组元素赋值为1
					arr[i][j] = 1;
				}else {
					// 中间的数组元素通过公式进行运算
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
