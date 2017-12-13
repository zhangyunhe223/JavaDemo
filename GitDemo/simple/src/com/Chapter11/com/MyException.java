package com.Chapter11.com;

public class MyException extends Exception {
	/**
	 * MyException是自定义异常类
	 */
	public MyException(int m) {
		System.out.println("抛出异常：你所填写的参数值m大于了1000！");
	}
}
