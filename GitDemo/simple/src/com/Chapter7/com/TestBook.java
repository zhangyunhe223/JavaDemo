package com.Chapter7.com;

public class TestBook {
	/*
	 * ����һ��ͼ����Book
	 * Book��������ͼ���š�ͼ�����ơ�ͼ�����
	 * ����id��name category3����Ա����
	 * private Ȩ�����η�
	 */
	private int id;
	private String name;
	private String category;
	
	public String getName() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TestBook getBook() {
		// ����Book������
		return this;
	}
}
