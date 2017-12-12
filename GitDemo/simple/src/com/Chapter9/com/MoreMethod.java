package com.Chapter9.com;

public class MoreMethod {
	/*
	 * 编写4个典型的方法
	 * 静态的成员方法不带返回值
	 * 公共的带参数的成员方法
	 * 受保护的方法
	 * 私有方法
	 */
	static void staticMethod() {
		System.out.println("执行staticMethod()方法");
	}
	public int publicMethod(int i) {
		System.out.println("执行publicMethod()方法");
		return i * 100;
	}
	protected int protectedMethod(String s,int i) throws NumberFormatException{
		System.out.println("执行protectedMethod()方法");
		return Integer.valueOf(s) + i;
	}
	private String privateMethod(String...strings) {
		System.out.println("执行privateMethod()方法");
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0;i < strings.length;i++) {
			stringBuffer.append(strings[i]);
		}
		return stringBuffer.toString();
	}
}
