package com.Chapter4.com;

public class Circulate {

	public static void main(String[] args) {
		
		// ʹ��forѭ�����
		
		{
			// ʹ��forѭ��������1-100֮������ż��֮��
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
			System.out.println("1-100֮������ż��֮��:" + sum);
		}
		
		{
			// ʹ��forѭ��������1-100֮����������֮��
			int sum = 0;
			for (int i = 1; i <= 100; i += 2) {
					sum += i;
			}
			System.out.println("1-100֮����������֮��:" + sum);
		}
		
		{
			// ʹ��forѭ��������1-100֮����������֮��
			int sum = 0;
			for (int i = 1; i <= 100; i ++) {
					sum += i;
			}
			System.out.println("1-100֮����������֮��:" + sum);
		}
	}

}
