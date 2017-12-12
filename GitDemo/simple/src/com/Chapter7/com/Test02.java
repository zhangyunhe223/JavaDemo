package com.Chapter7.com;

public class Test02 {
	
	public static void main(String[] args) {
		// 输出Book类中的属性——书名、作者以及价格
		Book book = new Book("《java编程思想》","xxx",12.6);
		System.out.println("书名:" + book.getTitle());
		System.out.println("作者：" + book.getAuthor());
		System.out.println("价格：" + book.getPrice() + "元");
	}
}
