package com.Chapter8.com;

public class Manager extends Employee {
	/*
	 *  编写子类经理类Manager,继承员工Employee类
	 *  并定义一个bonus域,表示经理的奖金
	 *  为其设置getxxx()和setxxx()方法
	 */
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getInfo() {
		return "我是子类：Manager经理！";
	}
}
