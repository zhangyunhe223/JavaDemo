package com.Chapter8.com;

import java.awt.Point;

public class GPSCar extends Car implements GPS {

	@Override
	public Point getLocation() {
		/*
		 * ���༯��Car�ಢʵ��GPS�ӿ�
		 * �ڸ�����ʵ��getLocation()���������ڶ�λ����λ��
		 * Ȼ����дtoString()�����������GPSCar
		 */
		Point point = new Point();
		point.setLocation(super.getSpeed(), super.getSpeed());
		return point;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append(",���꣺(" + getLocation().x + "," + getLocation().y + ")");
		return sb.toString();
	}
	

}
