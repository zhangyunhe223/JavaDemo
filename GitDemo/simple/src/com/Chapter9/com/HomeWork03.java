package com.Chapter9.com;

public abstract class HomeWork03 implements HomeWork {
	/*
	 * 
	 */
	public void eat(int i) {
		System.out.println(i);
	}


	public static void main(String[] args) {
		HomeWork homeWork = new HomeWork() {
			
			@Override
			public int testHome(int i) {
				// TODO Auto-generated method stub
				System.out.println("-------");
				return 0;
			}
		};
		homeWork.testHome(5);
	}
}
