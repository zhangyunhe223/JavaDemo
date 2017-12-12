package com.Chapter8.com;

public class CarFactory {
	/*
	 * ����һ������ΪCarFactory����
	 * ����һ����̬����getCar()
	 */
	public static CarDemo getCar(String name) {
		if (name.equalsIgnoreCase("BMW")) {
			return new BMW();
		}else if (name.equalsIgnoreCase("BENz")) {
			return new Benz();
		}else {
			return null;
		}
	}
}
