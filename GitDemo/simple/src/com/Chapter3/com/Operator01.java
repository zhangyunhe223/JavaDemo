package com.Chapter3.com;

public class Operator01 {

	public static void main(String[] args) {
		// ��������������ʹ����Ŀ����������ж����������Ƿ���ȣ�������ȣ�����������нϴ���Ǹ�
		int a = 89;
		int b = 100;
		int g = (a > b) ? a : b;
		int k = (a != b) ? g : a;
//		String c = (a == b) ? "��Сֵ��a=" + a : "���ֵ��b=" + b;
		System.out.println((a == b) ? "���" : (a > b) ? "a��" : "b��");
	}

}
