package com.Chapter4.com;

public class GetSum {

	public static void main(String[] args) {
		// ͨ��whileѭ����佫1-10�������
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum = sum + i;
			System.err.println("��i=" + i + "ʱ,sum��ֵ����=" + sum);
			i++;
		}
		System.out.println("1-10������ӵĺ�=" + sum);
	}

}
