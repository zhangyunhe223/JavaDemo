package com.Chapter9.com;

import java.lang.reflect.Method;

public class MethodTest {

	public static void main(String[] args) {
		/*
		 * 动态调用类中的方法
		 */
		try {
			System.out.println("调用Math类的静态方法sin()");
			Method sin = Math.class.getDeclaredMethod("sin", Double.TYPE);
			Double sin1 = (Double) sin.invoke(null, new Integer(1));
			System.out.println("1的正玄值是：" + sin1);
			System.out.println("调用String类的非静态方法equals()");
			Method equals = String.class.getDeclaredMethod("equals",Object.class);
			Boolean mrsoft = (Boolean) equals.invoke(new String("123"), "123");
			System.out.println("字符串是否是“张运何”:" + "\n" + mrsoft);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
