package com.Chapter8.com;

public class Manager extends Employee {
	/*
	 *  ��д���ྭ����Manager,�̳�Ա��Employee��
	 *  ������һ��bonus��,��ʾ����Ľ���
	 *  Ϊ������getxxx()��setxxx()����
	 */
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getInfo() {
		return "�������ࣺManager����";
	}
}
