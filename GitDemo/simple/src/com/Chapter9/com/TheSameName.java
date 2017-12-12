package com.Chapter9.com;

public class TheSameName {
	/*
	 * 使用this关键字获取内部类与外部类的引用
	 */
	private int x = 0;

	public class Inner {
		int x = 1;

		public void doit(int x) {
			x++;                    // 调用的TheSameName.Inner.doit(int)里面的形参x
			this.x++;               // 调用的TheSameName.Inner.x内部类的x
			TheSameName.this.x++;   // 调用的TheSameName.x外部类的x
		}
	}
}
