package com.Chapter7.com;

public class HomeWork02 {
	
	// ���峤�Ϳ� 
	private double length;
	private double width;
	
	// �ڹ��췽���У������Ϳ��ʼ��
	public HomeWork02(double length,double width) {
		this.length = length;
		this.width = width;
	}
	// ����һ����Ա������˾��ε����
	public double getArea() {
		return this.length * this.width;
	}
}
