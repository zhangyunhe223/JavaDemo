package com.Chapter8.com;

import java.util.Date;

public class Employee {
	/*
	 * ��д������Ա���Ĳ���
	 * ��дԱ����Employee
	 * ����3�����ԣ�Ա��������Ա�����ʡ�Ա������
	 * name��salary��birthday
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
		return "���Ǹ��ࣺEmployeeԱ����";
	}
}
