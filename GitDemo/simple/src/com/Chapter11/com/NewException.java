package com.Chapter11.com;

public class NewException extends Exception{
	/**
	 * �Զ���NewException��
	 * ���༯��Exception��
	 */
	public NewException(double r) {
		// �ڹ��췽����
		/*super(s);*/
		/*
		 * 1.ͨ����Բ������׳��Զ����쳣
		 */
		System.out.println("�����쳣��" + "\n" + "Բ�İ뾶Ϊ��" + r + "\n" + "Բ�İ뾶����С��20!");
	}
}
