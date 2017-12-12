package com.Chapter8.com;

public class ClassicExample01 implements Comparable<ClassicExample01>{
	/*
	 * 默认情况下，保存在List集合中的数组是不进行排序的
	 * 不过可以通过使用Comparable接口自定义排序规则并自动排序
	 * 新建一个Java类，名称为Employee
	 * 在该类中首先定义3个属性，分别是id（表示员工的编号）、name（表示员工的姓名）和age（表示员工的年龄）
	 * 然后在构造方法中初始化这3个属性，最后再实现接口中定义的compareTo()方法，将对象按编号升序排列
	 */
	private int  id;
	private String name;
	private int age;
	
	public ClassicExample01(int id,String name,int age) {
		// 利用构造方法初始化各个域
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(ClassicExample01 o) {
		// 重写Comparable接口里面的compareTo()方法
		// 利用编号实现对象间的比较
		if (id > o.id) {
			return 1;
		}else if(id < o.id) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		// 重写toString()方法  
		StringBuffer sb = new StringBuffer();
		sb.append("员工编号：" + id + ",");
		sb.append("员工姓名：" + name + ",");
		sb.append("员工年龄：" + age);
		return sb.toString();
	}
/*	@Override
	public String toString() {
		return "ClassicExample01 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}*/
}
