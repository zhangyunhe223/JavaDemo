package com.Chapter8.com;

public class TestCalculate {

	public static void main(String[] args) {
		// 测试Calculate类中的的所有方法
		Calculate calculate = new Calculate();
		float r = 2;
		System.out.println("圆的半径：" + r);
		System.out.println("圆形的面积：" + calculate.getArea(r));
		float l = 20;
		float w = 30;
		float areaRectangle = calculate.getArea(l, w);
		System.out.println("长方形的长：" + l);
		System.out.println("长方形的宽：" + w);
		System.out.println("长方形的面积：" + areaRectangle);
		int num = 7;
		calculate.draw(num);
		calculate.draw("三角形");
	}

}
