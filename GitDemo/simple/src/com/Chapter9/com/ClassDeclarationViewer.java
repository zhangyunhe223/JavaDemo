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
		 * 通过反射查看类的成员
		 */
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("类的标准名称：" + clazz.getCanonicalName());
		System.out.println("类的修饰符：" + Modifier.toString(clazz.getModifiers()));
		// 输出类的泛型参数
		TypeVariable<?>[] typeVariable = clazz.getTypeParameters();
		System.out.println("类的泛型参数：");
		if (typeVariable.length != 0) {
			for (TypeVariable<?> typeVariable2 : typeVariable) {
				System.out.println(typeVariable2 + "\t");
			}
		} else {
			System.out.println("\t" + "空");
		}
		// 输出类直接继承类，如果是集成Object则返回为空
		Type superClass = clazz.getGenericSuperclass();
		System.out.println("类的直接类:");
		if (superClass != null) {
			System.out.println(superClass);
		} else {
			System.out.println("空");
		}
		// 输出类的所有注释信息，有些注释信息是不能通过反射得到的
		Annotation[] annotation = clazz.getAnnotations();
		System.out.println("类的注解：");
		if (annotation.length != 0) {
			for (Annotation annotation2 : annotation) {
				System.out.println(annotation2);
			}
		} else {
			System.out.println("空");
		}
	}

}
