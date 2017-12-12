package com.Chapter7.com;

public class Test01 {
	
	private static String book = "123";;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("书名：" + book);
		new Test01();
	}

	public Test01() {
		// 构造方法，与类名相同
		book = "java编程思想";
		System.out.println(book);
	}

	public void methodEx01() {
		// 普通方法，没有返回值
	}

	public String methodEx02(String string) {
		// 普通方法，带返回值
		return string;
	}

}
