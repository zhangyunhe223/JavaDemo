package com.Chapter9.com;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class ClassDeclarationViewer {
	/*
	 * 1
	 * 2
	 * 3
	 */

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * ͨ������鿴��ĳ�Ա
		 */
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("��ı�׼���ƣ�" + clazz.getCanonicalName());
		System.out.println("������η���" + Modifier.toString(clazz.getModifiers()));
		// �����ķ��Ͳ���
		TypeVariable<?>[] typeVariable = clazz.getTypeParameters();
		System.out.println("��ķ��Ͳ�����");
		if (typeVariable.length != 0) {
			for (TypeVariable<?> typeVariable2 : typeVariable) {
				System.out.println(typeVariable2 + "\t");
			}
		} else {
			System.out.println("\t" + "��");
		}
		// �����ֱ�Ӽ̳��࣬����Ǽ���Object�򷵻�Ϊ��
		Type superClass = clazz.getGenericSuperclass();
		System.out.println("���ֱ����:");
		if (superClass != null) {
			System.out.println(superClass);
		} else {
			System.out.println("��");
		}
		// ����������ע����Ϣ����Щע����Ϣ�ǲ���ͨ������õ���
		Annotation[] annotation = clazz.getAnnotations();
		System.out.println("���ע�⣺");
		if (annotation.length != 0) {
			for (Annotation annotation2 : annotation) {
				System.out.println(annotation2);
			}
		} else {
			System.out.println("��");
		}
	}

}
