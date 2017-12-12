package com.Chapter8.com;

public abstract class A {
	/* 
	 * 创建一个抽象类，验证它是否可以实例化对象
	 * 抽象方法play()
	 * 构造方法HomeWork01()
	 */
	private String string;
	
	public A(String string) {
		System.out.println("父类已经实例化！");
		this.string = string;
		System.out.println(string);
	}
	public abstract void play();
}
