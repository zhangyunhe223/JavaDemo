package com.Chapter9.com;

public class SelloutClass {
	/*
	 * 定义一个私有成员变量、和构造方法
	 * 在外部类的sell()成员方法中创建Apple局部内部类
	 */
	private String name;
	
	public SelloutClass() {
		this.name = "Apple";
	}
	private void sell(int  price) {
		// 创建Apple局部内部类
		class Apple {
			int innerPrice = 1;

			public Apple(int price) {
				// 局部内部类构造方法
				innerPrice = price;
			}

			public void price() {
				System.out.println("现在开始销售：" + name);
				System.out.println("单价为：" + innerPrice + "元");
			}
		}
		// 实例化apple类的对象，并调用局部内部类的方法
		Apple apple = new Apple(price);
		apple.price();
	}

	public static void main(String[] args) {
		/*
		 * 创建内部类的实例，并调用其定义的price()方法 
		 * 输出单价信息
		 */
		SelloutClass class1 = new SelloutClass();
		class1.sell(100);
	}

}
