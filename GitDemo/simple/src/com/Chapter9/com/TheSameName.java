package com.Chapter9.com;

public class TheSameName {
	/*
	 * ʹ��this�ؼ��ֻ�ȡ�ڲ������ⲿ�������
	 */
	private int x = 0;

	public class Inner {
		int x = 1;

		public void doit(int x) {
			x++;                    // ���õ�TheSameName.Inner.doit(int)������β�x
			this.x++;               // ���õ�TheSameName.Inner.x�ڲ����x
			TheSameName.this.x++;   // ���õ�TheSameName.x�ⲿ���x
		}
	}
}
