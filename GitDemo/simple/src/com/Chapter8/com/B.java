package com.Chapter8.com;

public class B extends A {

	public B(String string) {
		super(string);
		System.out.println("子类已经实例化！");
	}

	@Override
	public void play() {
		System.out.println("我实现了父类的方法");
	}

}
