package com.Chapter7.com;

import java.awt.Color;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * ���¼������Ĺ�ϣ�� 
		 * ����4����Ա�����ֱ��ʾè������֡����䡢��������ɫ
		 */
		Cat cat01 = new Cat("Java", 12, 21.5, Color.black);
		Cat cat02 = new Cat("C++", 12, 15.6, Color.BLUE);
		Cat cat03 = new Cat("Java", 12, 21.5,Color.black);
		
		System.out.println("è��1�ŵĹ�ϣ�룺" + cat01.hashCode());
		System.out.println("è��2�ŵĹ�ϣ�룺" + cat02.hashCode());
		System.out.println("è��3�ŵĹ�ϣ�룺" + cat03.hashCode());
		System.out.println("è��1���Ƿ���è��2����ȣ�" + cat01.equals(cat02));
		System.out.println("è��1���Ƿ���è��3����ȣ�" + cat01.equals(cat03));
	}

}
