package com.Chapter3.com;

import java.util.Scanner;

public class VariableExchange {

	public static void main(String[] args) {
		// ������������ʵ������������
		
		Scanner Scan = new Scanner(System.in);                            // ����ɨ����
		
		System.out.println("���������A��ֵ");                                 
		long A = Scan.nextLong();                                         // ���ܵ�һ������ֵ
		System.out.println("���������B��ֵ");
		long B = Scan.nextLong();                                         // ��ȡ�ڶ����û�����ı���ֵ
		System.out.println("A=" + A + "\tB=" + B);
		System.err.println("ִ�б�������...");
		A = A ^ B;
		B = B ^ A;                                                        // ִ�б�������
		A = A ^ B;
		System.out.println("A=" + A + "\tB=" + B);
	}

}
