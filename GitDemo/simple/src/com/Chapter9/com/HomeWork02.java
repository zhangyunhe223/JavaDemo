package com.Chapter9.com;

public class HomeWork02 {
	/*
	 * ��дһ����Ա����testOut
	 */
	int sum;
	
	private void testOut() {
		// �ڳ�Ա�����У������ֲ��ڲ���
		class Inner{
			// �ڲ����д�������
			public void testInner() {
				sum = 4 * 5;
			}
		}
		// ʵ����apple��Ķ��󣬲����þֲ��ڲ���ķ���
		Inner inner = new Inner();
		inner.testInner();
		System.out.println("����������4 * 5�Ļ���" + "\n" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork02 homeWork02 = new HomeWork02();
		homeWork02.testOut();
	}

}
