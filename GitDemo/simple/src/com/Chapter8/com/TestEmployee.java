package com.Chapter8.com;

import java.util.Date;

public class TestEmployee {

	public static void main(String[] args) {
		// 测试员工、经理类
		Employee employee = new Employee();
		employee.setName("jason");
		employee.setSalary(5000);
		employee.setBirthday(new Date());
		System.out.println("员工姓名：" + employee.getName());
		System.out.println("员工工资：" + employee.getSalary());
		System.out.println("员工生日：" + employee.getBirthday());
		System.out.println(employee.getInfo());
		System.out.println("---------------------------------");
		Manager manager = new Manager();
		manager.setName("zhangyunhe");
		manager.setSalary(5000);
		manager.setBonus(1000);
		manager.setBirthday(new Date());
		System.out.println("员工姓名：" + manager.getName());
		System.out.println("员工工资：" + manager.getSalary());
		System.out.println("员工奖金：" + manager.getBonus());
		System.out.println("员工生日：" + manager.getBirthday());
		System.out.println(manager.getInfo());
	}

}
