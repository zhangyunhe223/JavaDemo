package com.Chapter7.com;

public class Test02 {
	
	public static void main(String[] args) {
		// ���Book���е����ԡ��������������Լ��۸�
		Book book = new Book("��java���˼�롷","xxx",12.6);
		System.out.println("����:" + book.getTitle());
		System.out.println("���ߣ�" + book.getAuthor());
		System.out.println("�۸�" + book.getPrice() + "Ԫ");
	}
}
