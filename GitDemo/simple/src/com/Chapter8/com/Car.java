package com.Chapter8.com;

public class Car {
	
	/*
	 * Java经典编程300例之实例065 适配器模式的简单应用
	 * 定义两个属性
	 * name:表示汽车的名字
	 * speed：表示汽车的速度
	 * 并为其提供getxxx()以及getxxx()方法，通过重写toString方法输出Car对象
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
		sb.append("车名：" + name + ",");
		sb.append("速度：" + speed+ "千米/小时");
		return sb.toString();
	}
}
