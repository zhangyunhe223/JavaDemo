package com.Chapter7.com;

public class Emperor {
	
	private static Emperor emperor = null; // ����һ��Emperor������
	
	private Emperor() {                    // �����췽��˽��
		
	}
	public static Emperor getInstance() {  // ʵ��������
		if (emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}
	public void getName() {                // ʹ����ͨ�������
		System.out.println("����Ψһ��");
	}
}
