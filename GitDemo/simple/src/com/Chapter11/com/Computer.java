package com.Chapter11.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Computer {
	/**
	 * �����������Ĺ�Լ�� 
	 * 
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			System.out.println("���������������Լ!!");
			System.out.println("�������һ����������");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			int num1 = Integer.parseInt(br1.readLine());
			System.out.println("������ڶ�����������");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			int num2 = Integer.parseInt(br2.readLine());
			int Maxcommin_divisor;
			if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					Maxcommin_divisor = common(num1, num2);
				} else {
					Maxcommin_divisor = common(num2, num1);
				}

				System.out.print("���Լ���ǣ�" + Maxcommin_divisor);
			} else {
				System.out.print("�����������������");
			}
		} catch (Exception e) {
			System.out.print("�����������������");
		}
	}

	private static int common(int a, int b) {
		if (a % b == 0)
			return b;
		else
			return common(b, a % b);
	}
}
