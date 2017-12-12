package com.Chapter9.com;

public class MoreConstructor {
	/*
	 * 通过反射访问构造方法
	 * 创建一个MoreConstructor类
	 * 并声明一个string型成员变量和3个int型成员变量
	 * 创建一个无参数构造方法和一个带两个参数构造方法、带可变参数构造方法
	 * 以及一个成员方法
	 */
	String s;
	int i,i2,i3;
	
	public MoreConstructor() {
		// 无参数构造方法
	}
	public MoreConstructor(String s,int i){
		// 两个带参数构造方法
		this.s = s;
		this.i = i;
	}
	public MoreConstructor(String...strings) throws NumberFormatException{
		// 带可变参数构造方法
		if (0 < strings.length) 
			i = Integer.valueOf(strings[0]);
		if (1 < strings.length)
			i2 = Integer.valueOf(strings[1]);
		if (i3 < strings.length);
			i3 = Integer.valueOf(strings[2]);
	}
	public void print(){
		// 一个成员方法
		System.out.println("s:" + s);
		System.out.println("i:" + i);
		System.out.println("i2:" + i2);
		System.out.println("i3:" + i3);
	}
}
