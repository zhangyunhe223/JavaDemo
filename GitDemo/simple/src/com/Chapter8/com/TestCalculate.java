package com.Chapter8.com;

public class TestCalculate {

	public static void main(String[] args) {
		// ����Calculate���еĵ����з���
		Calculate calculate = new Calculate();
		float r = 2;
		System.out.println("Բ�İ뾶��" + r);
		System.out.println("Բ�ε������" + calculate.getArea(r));
		float l = 20;
		float w = 30;
		float areaRectangle = calculate.getArea(l, w);
		System.out.println("�����εĳ���" + l);
		System.out.println("�����εĿ�" + w);
		System.out.println("�����ε������" + areaRectangle);
		int num = 7;
		calculate.draw(num);
		calculate.draw("������");
	}

}
