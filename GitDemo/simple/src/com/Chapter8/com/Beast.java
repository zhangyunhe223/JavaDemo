package com.Chapter8.com;

public class Beast {
	/*
	 * ����һ������BeastҰ����
	 * ���Ҷ���һ����Ա����skin
	 * ����һ��Ĭ�ϵĹ��췽�����������Ĺ��췽���Լ���Ա����
	 */
	String skin;
	
	public Beast() {
		// Ĭ�ϵĹ��췽��
	}
	public Beast(String strSkin) {
		// �������Ĺ��췽��
		skin = strSkin;
	}
	public void move() {
		System.out.println("�ܣ�");
	}
}
