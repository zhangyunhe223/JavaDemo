package com.Chapter3.com;

public class TypeConvertion01 {

	public static void main(String[] args) {
		// 
		
		int intNumber = 4;
		float floatNumer = 9.5F;
		
		floatNumer /= intNumber;
		System.out.println("9.5F/4���̣�" + floatNumer);
		
		double numX = 4.88;
		double numY = 78.83;
		int numZ = (int) (numX + numY);
		System.out.println("numX + numY =" + numZ);
		
		char charVar = 'z';
		int intVar = (int) charVar;
		System.out.println("���ַ�Tת��Ϊint�ͱ�����" + intVar);
		
		int num1 = 34;
		double num2 = (double) num1 / 3;
		System.out.println("num1 / 3 = " + num2);
	}

}
