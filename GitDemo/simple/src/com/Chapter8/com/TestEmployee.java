package com.Chapter8.com;

import java.util.Date;

public class TestEmployee {

	public static void main(String[] args) {
		// ����Ա����������
		Employee employee = new Employee();
		employee.setName("jason");
		employee.setSalary(5000);
		employee.setBirthday(new Date());
		System.out.println("Ա��������" + employee.getName());
		System.out.println("Ա�����ʣ�" + employee.getSalary());
		System.out.println("Ա�����գ�" + employee.getBirthday());
		System.out.println(employee.getInfo());
		System.out.println("---------------------------------");
		Manager manager = new Manager();
		manager.setName("zhangyunhe");
		manager.setSalary(5000);
		manager.setBonus(1000);
		manager.setBirthday(new Date());
		System.out.println("Ա��������" + manager.getName());
		System.out.println("Ա�����ʣ�" + manager.getSalary());
		System.out.println("Ա������" + manager.getBonus());
		System.out.println("Ա�����գ�" + manager.getBirthday());
		System.out.println(manager.getInfo());
	}

}
