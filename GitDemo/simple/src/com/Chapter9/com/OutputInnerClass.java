package com.Chapter9.com;

public class OutputInnerClass extends ClassA.ClassB{
	/*
	 * ����һ��OutputInnerClass�࣬�̳��ڲ���ClassB
	 */
	public OutputInnerClass(ClassA a) {
		// �������Ĺ��췽��
		a.super();
	}
}
// ����һ��ClassA���Լ��ڲ���ClassB
class ClassA{
	class ClassB{
	}
}
