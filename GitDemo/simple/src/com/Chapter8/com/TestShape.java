package com.Chapter8.com;

public class TestShape {

	public static void main(String[] args) {
		// ���� �����д���Circle��Rectangle����
		Circle circle = new Circle(1);
		System.out.println("ͼ�ε����ƣ�" + circle.getName());
		System.out.println("ͼ�ε������" + circle.getArea());
		Rectangle rectangle = new Rectangle(1, 2);
		System.out.println("ͼ�ε����ƣ�" + rectangle.getName());
		System.out.println("ͼ�ε������" + rectangle.getArea());
	}

}
