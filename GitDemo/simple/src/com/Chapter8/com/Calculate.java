package com.Chapter8.com;

public class Calculate {
	/*
	 * ����һ��������Ϊcalculate����
	 * ����һ�����ڱ�ʾԲ���ʵĳ���PI
	 * �����ж�����������getArea()
	 * �Լ���������draw()�ķ���
	 */
	private float PI = 3.14159f;
	
	// ��Բ�ε����
	public float getArea(float r) {
		float area = PI * r * r;
		return area;
	}
	// ����ε����
	public float getArea(float l,float w) {
		float area = l * w;
		return area;
	}
	// ��������״��ͼ��
	public void draw(int num) {
		System.out.println("��" + num + "��������״��ͼ��");
	}
	// ��ָ������״ͼ��
	public void draw(String shape) {
		System.out.println("��һ��" + shape);
	}
}
