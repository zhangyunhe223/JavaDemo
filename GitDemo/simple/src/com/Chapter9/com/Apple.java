package com.Chapter9.com;

public class Apple extends Fruit {

	@Override
	public void harvest() {
		// 通过重写父类并实现抽象方法
		System.out.println("苹果已经收获！");
	}

}
