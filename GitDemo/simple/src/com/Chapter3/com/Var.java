package com.Chapter3.com;

public class Var {
	
	static int times = 3;                                            // �������еĳ�Ա����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = 4;                                               // �ֲ�����
		System.out.println("times��ֵ=" + times);
		System.out.println("times��ֵ=" + Var.times);                 // �����̬����
	}

}
