package com.Chapter4.com;

public class ContinueDemo {

	public static void main(String[] args) {
		{
			// ʹ��continue���whileѭ������ӡ��1-10��������
			System.out.println("----------while-----------");
			System.out.println("��ӡ��1-10��������:");
			
			// �ȶ���ѭ������
			int i = 0;
			while (i < 10) {
				i++;
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			}
		}
		{
			// ʹ��continue���forѭ������ӡ��1-10��������
			System.out.println("----------for-----------");
			System.out.println("��ӡ��1-10��������:");
			
			for(int i = 1; i <= 10; i++) {
				if(i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			}
		}
		{
			// ʹ��continue���do...whileѭ������ӡ��1-10��������
			System.out.println("----------do...while-----------");
			System.out.println("��ӡ��1-10��������:");
			
			// �ȶ���ѭ������
			int i = 0;
			do {
				i++;
				if(i % 2 == 0) {
					continue;
				}
				System.out.println(i);
			} while (i < 10);
		}
	}

}
