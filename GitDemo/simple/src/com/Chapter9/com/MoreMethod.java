package com.Chapter9.com;

public class MoreMethod {
	/*
	 * ��д4�����͵ķ���
	 * ��̬�ĳ�Ա������������ֵ
	 * �����Ĵ������ĳ�Ա����
	 * �ܱ����ķ���
	 * ˽�з���
	 */
	static void staticMethod() {
		System.out.println("ִ��staticMethod()����");
	}
	public int publicMethod(int i) {
		System.out.println("ִ��publicMethod()����");
		return i * 100;
	}
	protected int protectedMethod(String s,int i) throws NumberFormatException{
		System.out.println("ִ��protectedMethod()����");
		return Integer.valueOf(s) + i;
	}
	private String privateMethod(String...strings) {
		System.out.println("ִ��privateMethod()����");
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0;i < strings.length;i++) {
			stringBuffer.append(strings[i]);
		}
		return stringBuffer.toString();
	}
}
