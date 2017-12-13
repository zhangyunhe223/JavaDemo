package com.Chapter11.com;

public class Example_12 {
	
	private static final double PI = 3.14;

	/**
	 * 计算圆的面积
	 * 如果半径小于20，则抛出异常
	 * @param args
	 * @throws Exception 
	 */
	public void computeArea(double r) throws NewException {
		if (r <= 20) {
			throw new NewException(r);
		} else {
			double circleArea = PI * r * r;
			System.out.println("半径是" + r + "的面积为：" + circleArea);
		}
	}

	public static void main(String[] args) {
		// test
		Example_12 example_09 = new Example_12();
		try {
			example_09.computeArea(10);
		} catch (NewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
