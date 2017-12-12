package com.Chapter8.com;

public interface ICalculate {
	/*
	 * 定义一个用于计算圆的接口ICalculate
	 * 在该接口中定义一个常量PI和两个方法
	 * 定义一个用于计算面积的方法getArea()
	 * 定义一个用于计算周长的方法getCircumference()
	 */
	final float PI = 3.14159f;
	float getArea(float r);
	float getCircumference(float r);
}
