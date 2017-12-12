package com.Chapter8.com;

import java.awt.Point;

public class GPSCar extends Car implements GPS {

	@Override
	public Point getLocation() {
		/*
		 * 该类集成Car类并实现GPS接口
		 * 在该类中实现getLocation()方法，用于定位汽车位置
		 * 然后重写toString()方法方便输出GPSCar
		 */
		Point point = new Point();
		point.setLocation(super.getSpeed(), super.getSpeed());
		return point;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append(",坐标：(" + getLocation().x + "," + getLocation().y + ")");
		return sb.toString();
	}
	

}
