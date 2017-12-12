package com.Chapter8.com;

public class Son extends Father {
	/*
	 * 在子类Son中覆盖第二个方法
	 */
	@Override
	void speak() {
		super.speak();
		System.out.println("hey son");
	}
}
