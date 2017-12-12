package com.Chapter8.com;

public class BMW extends CarDemo {
	/*
	 * 继承CarDemo类，并实现getInfo方法
	 * @see com.Chapter8.com.CarDemo#getInfo()
	 */

	@Override
	public String getInfo() {
		// 重写父类中的getInfo()方法
		return "宝马";
	}

}
