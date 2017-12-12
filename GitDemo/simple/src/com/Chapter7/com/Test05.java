package com.Chapter7.com;

public class Test05 {

	public static void main(String[] args) {
		// 单利模式的应用
		System.out.println("创建对象！");
		Emperor emperor1 = Emperor.getInstance();
		emperor1.getName();
		System.out.println("创建对象！");
		Emperor emperor2 = Emperor.getInstance();
		emperor1.getName();
		System.out.println("创建对象！");
		Emperor emperor3 = Emperor.getInstance();
		emperor1.getName();
	}
}
