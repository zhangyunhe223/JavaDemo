package com.Chapter4.com;

public class BreakCycle {

	public static void main(String[] args) {
		// ��ֹѭ����

		System.out.println("-------��ֹ����ѭ��--------");
		/*
		 * 1.����һ���ַ�������aves[]
		 * 2.��ʹ��foreach������
		 * 3.�����������а���"èͷӥ"ʱ��������ֹѭ��
		 */
		String aves[] = { "����", "ϲȵ", "�׸�", "èͷӥ", "���", "��СѼ", "������", "��ѻ" };
		System.out.println("���㿴��èͷӥʱ,��������������Щ��:");

		// ����foreachѭ����������
		for (String string : aves) {
			if (string.equals("èͷӥ")) {
				break;
			}
			System.out.println("�У�" + string + "\t");
		}
		
		/*
		 * 1.����һ���������Ͷ�ά����
		 * 2.��ʹ��˫��foreach���ѭ������
		 * 3.������һ��С��60������Ԫ��ʱ��������ֹ����˫��ѭ��
		 */
		System.out.println("-------��ֹ˫��ѭ��--------");
		int[][] arry = new int[][]{{67,87,95,14,},{60,41,50},{70,50,60},{10,20,30}};
		System.out.println("������γɼ�Ϊ��\n ��ѧ\t ����\t Ӣ��\t ����\t ��ʷ\t");
		
		No1 : for (int[] is : arry) {
			for (int i : is) {
				System.out.print(i + "\t");
				if(i < 60) {
					System.out.print("\n�ȵ�..." + "��"+ i + "��" + "����ʲô�����Ϊʲô������");
					break No1;
				}
			}
		}
	}

}
