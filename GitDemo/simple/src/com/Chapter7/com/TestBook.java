package com.Chapter7.com;

public class TestBook {
	/*
	 * 定义一个图书类Book
	 * Book类中设置图书编号、图书名称、图书类别
	 * 定义id、name category3个成员变量
	 * private 权限修饰符
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
		// 返回Book类引用
		return this;
	}
}
