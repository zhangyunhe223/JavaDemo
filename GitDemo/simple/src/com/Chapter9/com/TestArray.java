package com.Chapter9.com;

public class TestArray {

	public static void main(String[] args) {
		// ��ʼ������
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1000 * Math.random();
		}
		System.out.println("����Դ��");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("���ֵ��" + MaxMin.Result.getResult(array).getMax());
		System.out.println("��Сֵ��" + MaxMin.Result.getResult(array).getMin());
	}
}
