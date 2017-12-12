package com.Chapter9.com;

public class Farm {

	public static void main(String[] args) {
		// 在该类中执行Fruit类中的harvest()方法
		Apple apple = new Apple();
		apple.harvest();
		System.out.println("---------");
		Orange orange = new Orange();
		orange.harvest();
	}

}
