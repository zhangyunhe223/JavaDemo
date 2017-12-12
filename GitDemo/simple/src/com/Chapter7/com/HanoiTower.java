package com.Chapter7.com;

public class HanoiTower {
	/*
	 * 通过递归解决汉诺塔问题
	 */
	public static void moveDish(int level,char from,char inter,char to) {
		if(level == 1) {
			System.out.println("从" + from + " 移动盘子" + level + " 号到" + to);
		}else {
			moveDish(level - 1, from, to, inter);  
            System.out.println("从" + from + " 移动盘子" + level + " 号到" + to);  
            moveDish(level - 1, inter, from, to);
		}
	}

	public static void main(String[] args) {
		// 汉诺塔问题
		int nDisk = 3;
		moveDish(nDisk, 'A', 'B', 'C');
	}

}
