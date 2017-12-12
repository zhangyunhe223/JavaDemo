package com.Chapter8.com;

public class Cire implements ICalculate {
	/*
	 * 该类实现ICalculate的接口
	 * @see com.Chapter8.com.ICalculate#getArea(float)
	 */

	@Override
	public float getArea(float r) {
		// 定义一个用于计算面积的方法getArea()
		float area = PI * r * r;
		return area;
	}

	@Override
	public float getCircumference(float r) {
		// 定义一个用于计算周长的方法getCircumference()
		float circumference = 2 * PI * r;
		return circumference;
	}
	
	public static void main(String[] args) {
		Cire cire = new Cire();
		float f1 = cire.getArea(2);
		float f2 = cire.getCircumference(3);
		System.out.println("圆的面积为：" + Float.toString(f1));
		System.out.println("圆的周长为：" + Float.toString(f2));
	}
}
