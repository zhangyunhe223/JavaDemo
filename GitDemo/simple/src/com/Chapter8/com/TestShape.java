package com.Chapter8.com;

public class TestShape {

	public static void main(String[] args) {
		// 测试 该类中创建Circle和Rectangle对象
		Circle circle = new Circle(1);
		System.out.println("图形的名称：" + circle.getName());
		System.out.println("图形的面积：" + circle.getArea());
		Rectangle rectangle = new Rectangle(1, 2);
		System.out.println("图形的名称：" + rectangle.getName());
		System.out.println("图形的面积：" + rectangle.getArea());
	}

}
