package com.Chapter8.com;

public class Car {
	
	/*
	 * Java������300��֮ʵ��065 ������ģʽ�ļ�Ӧ��
	 * ������������
	 * name:��ʾ����������
	 * speed����ʾ�������ٶ�
	 * ��Ϊ���ṩgetxxx()�Լ�getxxx()������ͨ����дtoString�������Car����
	 */
	private String name;
	private double speed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("������" + name + ",");
		sb.append("�ٶȣ�" + speed+ "ǧ��/Сʱ");
		return sb.toString();
	}
}
