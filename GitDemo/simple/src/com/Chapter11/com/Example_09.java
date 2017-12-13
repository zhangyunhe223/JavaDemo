package com.Chapter11.com;

public class Example_09 {
	
	private static final double PI = 3.14;

	/**
	 * 计算圆的面积
	 * 如果半径小于20，则抛出异常
	 * @param args
	 * @throws Exception 
	 */
	public void computeArea(double r) throws Exception {
		if (r <= 20) {
			throw new Exception("程序异常：" + "\n" + "半径为：" + r + " 半径不能小于20");
		} else {
			double circleArea = PI * r * r;
			System.out.println("半径是" + r + "的面积为：" + circleArea);
		}
	}

	public static void main(String[] args) {
		// test
		Example_09 example_09 = new Example_09();
		try {
			example_09.computeArea(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}

}
