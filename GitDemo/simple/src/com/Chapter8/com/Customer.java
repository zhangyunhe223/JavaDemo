package com.Chapter8.com;

public class Customer {

	public static void main(String[] args) {
		System.out.println("用户选择BMW！");
		CarDemo BMW = CarFactory.getCar("BMW");
		System.out.println("用户提取了：" + BMW.getInfo());
		System.out.println("用户选择Benz！");
		CarDemo Benz = CarFactory.getCar("Benz");
		System.out.println("用户提取了：" + Benz.getInfo());
	}

}
