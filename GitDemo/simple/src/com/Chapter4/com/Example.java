package com.Chapter4.com;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// ͨ��switch���֧��䣬Ϊ��Ա�����䲿��
		
		/*
		 * 1.�Ȼ�ȡһ���з����ŵĹ�ϣ���룺java��php��c#��c��
		 * 2.��ͨ��switch���֧���ʵ��
		 */
		
/*		System.out.println("java".hashCode());
		System.out.println("php".hashCode());
		System.out.println("c#".hashCode());
		System.out.println("c".hashCode());*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ա������:");
		String name = scanner.nextLine();
		System.out.println("������������:");
		String language = scanner.nextLine();
		
		switch (language.hashCode()) {
		case 3254818:
			System.out.println("Ա��_" + name + ":�����䵽��java���򿪷�����");
			break;
		case 110968:
			System.out.println("Ա��_" + name + ":�����䵽��php���򿪷�����");
			break;
		case 3104:
			System.out.println("Ա��_" + name + ":�����䵽��c#���򿪷�����");
			break;
		case 99:
			System.out.println("Ա��_" + name + ":�����䵽��c���򿪷�����");
			break;
		default:
			System.out.println("����˾����Ҫ" + language + "���Եĳ��򿪷���Ա");
			break;
		}
	}

}
