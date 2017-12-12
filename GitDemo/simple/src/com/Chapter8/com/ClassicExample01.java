package com.Chapter8.com;

public class ClassicExample01 implements Comparable<ClassicExample01>{
	/*
	 * Ĭ������£�������List�����е������ǲ����������
	 * ��������ͨ��ʹ��Comparable�ӿ��Զ�����������Զ�����
	 * �½�һ��Java�࣬����ΪEmployee
	 * �ڸ��������ȶ���3�����ԣ��ֱ���id����ʾԱ���ı�ţ���name����ʾԱ������������age����ʾԱ�������䣩
	 * Ȼ���ڹ��췽���г�ʼ����3�����ԣ������ʵ�ֽӿ��ж����compareTo()�����������󰴱����������
	 */
	private int  id;
	private String name;
	private int age;
	
	public ClassicExample01(int id,String name,int age) {
		// ���ù��췽����ʼ��������
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(ClassicExample01 o) {
		// ��дComparable�ӿ������compareTo()����
		// ���ñ��ʵ�ֶ����ıȽ�
		if (id > o.id) {
			return 1;
		}else if(id < o.id) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		// ��дtoString()����  
		StringBuffer sb = new StringBuffer();
		sb.append("Ա����ţ�" + id + ",");
		sb.append("Ա��������" + name + ",");
		sb.append("Ա�����䣺" + age);
		return sb.toString();
	}
/*	@Override
	public String toString() {
		return "ClassicExample01 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}*/
}
