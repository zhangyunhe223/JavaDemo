package com.Chapter4.com;

public class ErgodicArray {

	public static void main(String[] args) {

		/*
		 * ����������������whileѭ���������� 
		 * 1.����һ���������� 
		 * 2.����һ����������
		 */
		String aves[] = { "����", "ϲȵ", "�׸�", "èͷӥ", "���", "��СѼ", "������", "��ѻ" };
		int index = 0;
		
		{
			System.out.println("�Ҽҹ�԰���кܶ���,��Ҫ�У�");
			System.out.println("����������������whileѭ���������飺");
			while(index < aves.length) {
				// ��������ֵ
				System.out.println(aves[index++] + " ");
			}
			System.out.println("---------------------");
		}
		
		// ����foreachѭ���������� 
		{
			System.out.println("����foreachѭ���������� ��");
			for (String string : aves) {
				System.out.println(string + "\t");
			}
		}
	}

}
