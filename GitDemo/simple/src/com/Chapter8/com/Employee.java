package com.Chapter8.com;

import java.util.Date;

public class Employee {
	/*
	 * 编写经理与员工的差异
	 * 编写员工类Employee
	 * 定义3个属性：员工姓名、员工工资、员工生日
	 * name、salary、birthday
	 */
	private String name;
	private double salary;
	private Date birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getInfo() {
		return "我是父类：Employee员工！";
	}
}
