package com.Chapter9.com;

public class OuterClass {
	// �ⲿ�෽��doit()������ֵΪ����ʹ��,���ⲿ�಻����ֱ�ӷ����ڲ����Ա�����ͷ���
	InnerClass inner = new InnerClass();
	/*
	 * ��OuterClass���ж���һ���ڲ���InnerClass
	 */
	
	// ����һ���ⲿ���Ա����
	static int i = 0;
	
	public void outer() {
	// ����һ���ⲿ���Ա����
	}
	public OuterClass() {
	// �ⲿ�๹�췽��
	}
	// ��̬�ڲ���
	static class Inner{
		static String string;		
	}
	public class InnerClass{
		/*
		 * InnerClassΪ�ڲ���
		 */
		// �ڲ����Ա����
		int i = 0;
		public void inner() {
			// �ڲ����Ա����,���ڲ����п���ֱ�Ӵ�ȡ�ⲿ��ĳ�Ա�����ͳ�Ա����
			System.out.println("�����ڲ����еĳ�Ա����");
			this.i++;
			OuterClass.this.i++;
			OuterClass.this.outer();
		}
		public InnerClass() {
			// �ڲ��๹�췽��
			System.out.println("�����ڲ����еĹ��췽��");
		}
	}
	private InnerClass doit() {
		/*
		 * �ⲿ�෽��������ֵΪ����ʹ��,���ⲿ�಻����ֱ�ӷ����ڲ����Ա�����ͷ���
		 * ���ԣ�����ͨ�����������������ⲿ��ĳ�Ա�����ͳ�Ա����
		 */
		inner.i = 2;
		inner.inner();
		return new InnerClass();
	}
	
	public static void main(String[] args) {
		/*
		 * 1.������ⲿ��ͷǾ�̬����֮��ʵ����������Ҫʹ���ⲿ��.�ڲ������ʽ
		 * 2.�����ʹ��doit()���������ڲ���������ã�����ֱ��ʹ���ڲ���ʵ�����ڲ������
		 * ��������������������ʵ�����ڲ�����󣬱�����new������֮ǰ�ṩһ���ⲿ�������
		 */
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in1 = out.doit();
		OuterClass.InnerClass in2 = out.new InnerClass();
	}
}
