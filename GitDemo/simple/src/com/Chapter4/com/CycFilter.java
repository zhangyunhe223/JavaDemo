package com.Chapter4.com;

public class CycFilter {

	public static void main(String[] args) {
		/*
		 * 1.�����������Ƶ��ַ������飬���а�������ӥ���ַ��� 
		 * 2.Ȼ��ͨ��foreachѭ������������ 
		 * 3.�ѡ���ӥ������Ϣ���˵�
		 */
		String aves[] = { "����", "��ӥ", "ϲȵ", "�׸�", "��ӥ", "èͷӥ", "���", "��СѼ", "������", "��ӥ", "��ѻ" };
		System.out.println("���Ժ��������ӥ���������ץ��...");

		// ����ѭ������
		int birdCount = 0;
		for (String string : aves) {
			System.out.println("Ѱ����...");
			if (string.equals("��ӥ")) {
				System.out.println("����һֻ��ӥ���Ѿ�ץ����...");
				birdCount++;
				continue;
			}
			System.out.println("Ѱ�����࣬������" + string);
		}
		System.out.println("һ��ץ��" + birdCount + "��ӥ��");
	}

}
