package com.Chapter4.com;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// ��ϰ1����дjava������forѭ����ӡ����
		System.out.println("���������εĳ������lay��");
		Scanner scanner = new Scanner(System.in);
		int lay = scanner.nextInt();
		// ��������ʵ�ֵķ�������
		LingXing(lay);
	}
	
	// ʵ�����εķ���
	public static void LingXing(int lay) {
		// �����ϰ벿��
		for(int i = 1;i <= lay;i++) {
			for(int j = 1;j <= lay -i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= 2 * i - 1;k++) {
				if(k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// �����°벿��
		for(int i = 1;i <= lay;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= 2 * (lay -i) - 1;k++) {
				if(k == 1 || k== 2 * (lay -i) - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
