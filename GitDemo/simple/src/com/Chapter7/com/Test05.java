package com.Chapter7.com;

public class Test05 {

	public static void main(String[] args) {
		// ����ģʽ��Ӧ��
		System.out.println("��������");
		Emperor emperor1 = Emperor.getInstance();
		emperor1.getName();
		System.out.println("��������");
		Emperor emperor2 = Emperor.getInstance();
		emperor1.getName();
		System.out.println("��������");
		Emperor emperor3 = Emperor.getInstance();
		emperor1.getName();
	}
}
