package com.Chapter9.com;

public class MoreConstructor {
	/*
	 * ͨ��������ʹ��췽��
	 * ����һ��MoreConstructor��
	 * ������һ��string�ͳ�Ա������3��int�ͳ�Ա����
	 * ����һ���޲������췽����һ���������������췽�������ɱ�������췽��
	 * �Լ�һ����Ա����
	 */
	String s;
	int i,i2,i3;
	
	public MoreConstructor() {
		// �޲������췽��
	}
	public MoreConstructor(String s,int i){
		// �������������췽��
		this.s = s;
		this.i = i;
	}
	public MoreConstructor(String...strings) throws NumberFormatException{
		// ���ɱ�������췽��
		if (0 < strings.length) 
			i = Integer.valueOf(strings[0]);
		if (1 < strings.length)
			i2 = Integer.valueOf(strings[1]);
		if (i3 < strings.length);
			i3 = Integer.valueOf(strings[2]);
	}
	public void print(){
		// һ����Ա����
		System.out.println("s:" + s);
		System.out.println("i:" + i);
		System.out.println("i2:" + i2);
		System.out.println("i3:" + i3);
	}
}
