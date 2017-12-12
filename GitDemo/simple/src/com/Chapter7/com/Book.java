package com.Chapter7.com;

public class Book {

	/*
	 * 定义3个成员变量 分别表示书名、作者和价格
	 */
	private String title;
	private String author;
	private double price;
	
	public Book(String title,String anthor,double price) {
		this.title = title;
		this.author = anthor;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}
}
