package com.Chapter9.com;

public class HomeWork01 {
	/*
	 * ͨ����Ա�ڲ������1-�������ĺ͵Ĳ���
	 *  ���ⲿ���д�ӡ
	 */
	int i ;
	
	InnerClass class1 = new InnerClass();
	
	public InnerClass doit() {
		System.out.println("1-10�ĺͣ�" + "\n" + i);
		return null;
	}

	public class InnerClass {
		// InnerClass�ڲ���
		public InnerClass() {
			// �ڲ����Ա����
			for (int j = 1; j <= 10; j++) {
				i = i + j;
			}
		}
	}

	public static void main(String[] args) {
		HomeWork01 out = new HomeWork01();
		HomeWork01.InnerClass in1 = out.doit();
	}
}
