package com.Chapter7.com;

public class Test01 {
	
	private static String book = "123";;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������" + book);
		new Test01();
	}

	public Test01() {
		// ���췽������������ͬ
		book = "java���˼��";
		System.out.println(book);
	}

	public void methodEx01() {
		// ��ͨ������û�з���ֵ
	}

	public String methodEx02(String string) {
		// ��ͨ������������ֵ
		return string;
	}

}
