package com.Chapter9.com;

public class HomeWork02 {
	/*
	 * 编写一个成员方法testOut
	 */
	int sum;
	
	private void testOut() {
		// 在成员方法中，创建局部内部类
		class Inner{
			// 内部类中创建方法
			public void testInner() {
				sum = 4 * 5;
			}
		}
		// 实例化apple类的对象，并调用局部内部类的方法
		Inner inner = new Inner();
		inner.testInner();
		System.out.println("任意两个数4 * 5的积：" + "\n" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork02 homeWork02 = new HomeWork02();
		homeWork02.testOut();
	}

}
