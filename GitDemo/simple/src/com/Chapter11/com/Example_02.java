package com.Chapter11.com;

public class Example_02 {
	/**
	 * ʹ�ó��������±귶Χ��ֵ���������е�Ԫ��
	 */
	
	int[] number = {100, 80, 50, 70, 20, 60};
	
	
	public int getNumber(int index) {
		return number[index];
	}


	public void setNumber(int index,int value) {
		number[index] = value;
	}


	public static void main(String[] args) {
		// test
		Example_02 example_02 = new Example_02();
		int value01 = example_02.getNumber(0);
		System.out.println(value01);
		// ���������±귶Χ
		int value02 = example_02.getNumber(6);
		System.out.println(value02);
		int value03 = example_02.getNumber(5);
		System.out.println(value03);
	}
}
