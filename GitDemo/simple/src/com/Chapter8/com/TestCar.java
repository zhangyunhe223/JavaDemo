package com.Chapter8.com;

public class TestCar {

	public static void main(String[] args) {
		 System.out.println("************创建普通汽车类**********");
		 Car car01 = new Car();
		 car01.setName("Adui");
		 car01.setSpeed(60);
		 System.out.println(car01);
		 System.out.println("************创建GPS汽车类**********");
		 GPSCar car02 = new GPSCar();
		 car02.setName("Adul");
		 car02.setSpeed(60);
		 System.out.println(car02);
	}

}
