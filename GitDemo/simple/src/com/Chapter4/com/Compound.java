package com.Chapter4.com;

public class Compound {

	public static void main(String[] args) {
		// ���������ж��帴�����飬���а�����һ��������
		{
			int y = 40;
			System.out.println("����Y��ֵ��" + y);
			int z = 245;
			boolean b;
			// ��һ��������
			{
				b = y > z;
				System.out.println("y > z����ô��" + b);
			}
		}
		String wString = "hello java";
		System.err.println("�����ַ�����ֵ��" + wString);
	}

}
