package com.Chapter4.com;

import com.Chapter3.com.SumNumber;

public class MultiplicationTable {

	public static void main(String[] args) {
		{
			// ʹ��forѭ��������99�˷���
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}
				System.out.println();
			}
			System.out.println("----------------------" );
		}
		{
			// ʹ��forѭ������ӡ1-100�����������ĺ�
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			System.out.println("1-100�����������ĺ�:" + sum);
			System.out.println("----------------------" );
		}
		{
			// ʹ��forѭ������ӡ1-100�����������ĺͣ���sum > 1000��ʱ������ѭ��
			int sum = 0;
			String flag = "";
			for(int i = 1 ;i <= 100; i++) {
				sum +=i;
				System.out.println("��i=" + i + "ʱ��sum=" + sum);
				
				// ��sum > 1000��ʱ������ѭ��
				if(sum > 1000) {
					System.out.println("sum > 1000,����ѭ����������£�");
					flag = "��1��" + i +"���������ĺ�:";
					break;
				}
				
			}
			System.out.println(flag + sum);
			System.out.println("----------------------" );
		}
/*		{
			// ʹ��forѭ������ӡ1-100�����������ĺͣ���sum > 1000��ʱ������ѭ��
			int sum = 0;
			for(int i = 1 ;i <= 45; i++) {
				sum +=i;
				System.out.println("��i=" + i + "ʱ��ֵΪ��" + sum);
			}
			System.out.println(sum);
		}*/
	}

}
