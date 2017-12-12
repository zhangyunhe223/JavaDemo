package com.Chapter9.com;

public class HomeWork01 {
	/*
	 * 通过成员内部类计算1-任意数的和的操作
	 *  在外部类中打印
	 */
	int i ;
	
	InnerClass class1 = new InnerClass();
	
	public InnerClass doit() {
		System.out.println("1-10的和：" + "\n" + i);
		return null;
	}

	public class InnerClass {
		// InnerClass内部类
		public InnerClass() {
			// 内部类成员方法
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
