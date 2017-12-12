package com.Chapter8.com;

public class HomeWork02 {
	/*
	 * 创建一个父类Father，在父类中创建两个方法
	 * 在子类Son中覆盖第二个方法
	 * 为子类创建一个对象,将它向上转型到基类并调用这个方法
	 */
	public static void main(String[] args) {		
		Father son = new Son();
		son.say();
	}
}
