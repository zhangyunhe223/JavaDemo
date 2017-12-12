package com.Chapter8.com;

public class Zoo {

	public static void main(String[] args) {
		/*
		 *  该类中分别创建子类Dog、Cat、Sheep对象
		 *  并为该对象分配内存
		 *  然后分别调用各对象的cry()方法
		 */
		Dog dog = new Dog();
		System.out.println("执行dog.cry()语句输出的结果：");
		dog.cry();
		Cat cat = new Cat();
		System.out.println("执行cat.cry()语句输出的结果：");
		cat.cry();
		Sheep sheep = new Sheep();
		System.out.println("执行sheep.cry()语句输出的结果：");
		sheep.cry();
	}

}
