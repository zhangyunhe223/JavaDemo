package com.Chapter8.com;

public class Customer {

	public static void main(String[] args) {
		System.out.println("�û�ѡ��BMW��");
		CarDemo BMW = CarFactory.getCar("BMW");
		System.out.println("�û���ȡ�ˣ�" + BMW.getInfo());
		System.out.println("�û�ѡ��Benz��");
		CarDemo Benz = CarFactory.getCar("Benz");
		System.out.println("�û���ȡ�ˣ�" + Benz.getInfo());
	}

}
