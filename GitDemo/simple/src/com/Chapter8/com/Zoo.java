package com.Chapter8.com;

public class Zoo {

	public static void main(String[] args) {
		/*
		 *  �����зֱ𴴽�����Dog��Cat��Sheep����
		 *  ��Ϊ�ö�������ڴ�
		 *  Ȼ��ֱ���ø������cry()����
		 */
		Dog dog = new Dog();
		System.out.println("ִ��dog.cry()�������Ľ����");
		dog.cry();
		Cat cat = new Cat();
		System.out.println("ִ��cat.cry()�������Ľ����");
		cat.cry();
		Sheep sheep = new Sheep();
		System.out.println("ִ��sheep.cry()�������Ľ����");
		sheep.cry();
	}

}
