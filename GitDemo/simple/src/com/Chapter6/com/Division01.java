package com.Chapter6.com;

public class Division01 {

	public static void main(String[] args) {
		// ����1 ����ָ���ķָ������ַ�������
		String string = new String("���Զ�����¥�����繳����į��ͩ��Ժ����������ϣ����ң���������һ����ζ����ͷ��");
		System.out.println("���к���ʾ��");
		String[] s1 = string.split("��|��");
		for(int i = 0;i < s1.length;i++) {
			System.out.println(s1[i]);
		}
	}

}
