package com.Chapter4.com;

import java.util.Scanner;

public class AirPyrmid {

	public static void main(String[] args) {

		System.out.println("���������εı�����");
		Scanner scanner = new Scanner(System.in);
		int lay = scanner.nextInt();
		rhombus(lay);

	}

	public static void rhombus(int lay) {
		for (int a = 1; a <= lay; a++) {
			for (int b = 1; b <= lay - a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 2 * a - 1; c++) {
				if (c == 1 || c == 2 * a - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int a = 1;a <= lay;a++) {
			for(int b = 1;b <= a; b++) {
				System.out.print(" ");
			}
			for(int c = 1;c <= 2 * (lay - a) - 1;c++) {
				if(c == 1 || c == 2 * (lay - a) - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
