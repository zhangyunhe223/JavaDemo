package com.Chapter9.com;

public class SelloutClass {
	/*
	 * ����һ��˽�г�Ա�������͹��췽��
	 * ���ⲿ���sell()��Ա�����д���Apple�ֲ��ڲ���
	 */
	private String name;
	
	public SelloutClass() {
		this.name = "Apple";
	}
	private void sell(int  price) {
		// ����Apple�ֲ��ڲ���
		class Apple {
			int innerPrice = 1;

			public Apple(int price) {
				// �ֲ��ڲ��๹�췽��
				innerPrice = price;
			}

			public void price() {
				System.out.println("���ڿ�ʼ���ۣ�" + name);
				System.out.println("����Ϊ��" + innerPrice + "Ԫ");
			}
		}
		// ʵ����apple��Ķ��󣬲����þֲ��ڲ���ķ���
		Apple apple = new Apple(price);
		apple.price();
	}

	public static void main(String[] args) {
		/*
		 * �����ڲ����ʵ�����������䶨���price()���� 
		 * ���������Ϣ
		 */
		SelloutClass class1 = new SelloutClass();
		class1.sell(100);
	}

}
