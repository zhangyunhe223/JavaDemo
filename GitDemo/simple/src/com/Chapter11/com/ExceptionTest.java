package com.Chapter11.com;

public class ExceptionTest {
	/**
	 * ����һ�� �����쳣
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ʾ����������0
		System.out.println("-1.0/0:" + "\n" + (-1.0 / 0));
		// ��ʾ����������0
		System.out.println("+1.0/0:" + "\n" + (+1.0 / 0));
		// ��ʾ��������0
		try {
			System.out.println("-1/0:" + "\n" + (-1 / 0));			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�׳��쳣:" + e.getMessage());
		}
		// ��ʾ��������0
		try {			
			System.out.println("+1/0:" + "\n" + (+1 / 0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�׳��쳣:" + e.getMessage());
		}
	}

}
