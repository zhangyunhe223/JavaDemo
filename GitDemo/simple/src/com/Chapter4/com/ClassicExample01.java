package com.Chapter4.com;

public class ClassicExample01 {
	// ʹ��forѭ��������ĵ�����

	/*
	 * 1.���ȴ�ӡ������
	 * 2.�ٴ�ӡ���Ľ�����
	 * 3.����ڴ�ӡ��������
	 */
	public static void main(String[] args) {
		// �����ĵ���
		Pyramid(5);
		ReflectionSolidPyramid(5);
		ReflectionPyramid(5);
		AirPyrmid(5);
		AirRhombus(5);
	}

	// ʹ��forѭ����ӡ������
	public static void Pyramid(int lay) {
		for (int i = 1; i <= lay; i++) {
			// ��ӡÿ�е�һ����*��ǰ�Ŀո���
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			// ��ӡÿ�еġ�*��
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}

	// ��ӡ��Ӱʵ�ĵĽ�����
	public static void ReflectionSolidPyramid(int lay) {
		// ��ӡ��Ӱ�Ľ�����
		// ���ϴ�ӡ�������ǿ�������
		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// ���ϴ�ӡ�������ǿ������ε��²���
		for (int i = 1; i <= lay - 1; i++) {
			// ÿ�пո���
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// �°벿��ÿ���ܵ�"*"��
			for (int k = 1; k <= 2 * (lay - i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}

	// ��ӡ��Ӱ�Ľ�����
	public static void ReflectionPyramid(int lay) {
		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---��Ӱ---");

		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (lay - i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	
	// ʹ��forѭ����ӡ���Ľ�����
	public static void AirPyrmid(int lay) {
		for (int i = 1; i <= lay; i++) {
			// ��ӡÿ�е�һ����*��ǰ�Ŀո���
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			// ��ӡÿ�еġ�*��
			for (int k = 1; k <= 2 * i - 1; k++) {
				// System.out.print("*");
				if (i == 1 || i == lay) {
					System.out.print("*");
				} else if (k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}

	// ʹ��forѭ����ӡ��������
	public static void AirRhombus(int lay) {
		for (int i = 1; i <= lay; i++) {
			for (int j = 1; j <= lay - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				// ��ӡ���Ľ�����
				if (k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// ���ϴ�ӡ�������ǿ������ε��ϰ벿��
		// ���������°벿�ֵ�����Ϊlay-1�У������ϰ벿��4�У����°벿��Ϊ3�в��ܹ�������

		for (int i = 1; i <= lay - 1; i++) {
			// ÿ�пո���
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// �°벿��ÿ���ܵ�"*"��
			for (int k = 1; k <= 2 * (lay - i) - 1; k++) {
				// ���"*"���ڵ�һ�����һλ���ӡ����
				if (k == 1 || k == 2 * (lay - i) - 1) {
					System.out.print("*");
				} else {
					// ���"*"���Ǵ��ڵ�һ�����һλ���ӡ���ո�
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
