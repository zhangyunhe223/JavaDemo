package com.Chapter7.com;

public class HanoiTower {
	/*
	 * ͨ���ݹ�����ŵ������
	 */
	public static void moveDish(int level,char from,char inter,char to) {
		if(level == 1) {
			System.out.println("��" + from + " �ƶ�����" + level + " �ŵ�" + to);
		}else {
			moveDish(level - 1, from, to, inter);  
            System.out.println("��" + from + " �ƶ�����" + level + " �ŵ�" + to);  
            moveDish(level - 1, inter, from, to);
		}
	}

	public static void main(String[] args) {
		// ��ŵ������
		int nDisk = 3;
		moveDish(nDisk, 'A', 'B', 'C');
	}

}
