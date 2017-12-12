package com.Chapter9.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringUtils {
	/*
	 * ���÷�����дtostring����
	 * �ڸ����У�������������
	 * tostring����
	 * main����
	 * 
	 */
	@SuppressWarnings({ "rawtypes" })
	public String toString(Object object){
		Class clazz = object.getClass();
		StringBuilder sb = new StringBuilder();
		// ��������ڵİ�
		Package packageName = clazz.getPackage();
		// ��������ڵİ�
		System.out.println(sb.append("������" + packageName.getName() + "\t"));
		// �����ļ�����
		String className = clazz.getSimpleName();
		System.out.println(sb.append("������" + className + "\n"));
		
		sb.append("�������췽����\n");
		// ������д����췽����constructor����
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// ������η�
			String modifier = Modifier.toString(constructor.getModifiers());
			if (modifier.equals("public")) {
				System.out.println(sb.append(constructor.toGenericString() + "\n"));
			}
		}
		
		sb.append("������\n");
		// ������д����������Field����
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			// ������η�
			String modifier = Modifier.toString(field.getModifiers());
			if (modifier.equals("public")) {
				System.out.println(field.toGenericString() + "\n");
			}
		}
		
		sb.append("����������\n");
		// ������д����������Field����
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			// ������η�
			String modifier = Modifier.toString(method.getModifiers());
			if (modifier.equals("public")) {
				System.out.println(method.toGenericString() + "\n");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		/*
		 * ����
		 */
		System.out.println(new StringUtils().toString(new java.util.Date()));
	}

}
