package com.Chapter9.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringUtils {
	/*
	 * 利用反射重写tostring方法
	 * 在该类中，定义两个方法
	 * tostring方法
	 * main方法
	 * 
	 */
	@SuppressWarnings({ "rawtypes" })
	public String toString(Object object){
		Class clazz = object.getClass();
		StringBuilder sb = new StringBuilder();
		// 获得类所在的包
		Package packageName = clazz.getPackage();
		// 输出类所在的包
		System.out.println(sb.append("包名：" + packageName.getName() + "\t"));
		// 获得类的简单名称
		String className = clazz.getSimpleName();
		System.out.println(sb.append("类名：" + className + "\n"));
		
		sb.append("公共构造方法：\n");
		// 获得所有代表构造方法的constructor数组
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// 获得修饰符
			String modifier = Modifier.toString(constructor.getModifiers());
			if (modifier.equals("public")) {
				System.out.println(sb.append(constructor.toGenericString() + "\n"));
			}
		}
		
		sb.append("公共域：\n");
		// 获得所有代表所有域的Field数组
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			// 获得修饰符
			String modifier = Modifier.toString(field.getModifiers());
			if (modifier.equals("public")) {
				System.out.println(field.toGenericString() + "\n");
			}
		}
		
		sb.append("公共方法：\n");
		// 获得所有代表所有域的Field数组
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			// 获得修饰符
			String modifier = Modifier.toString(method.getModifiers());
			if (modifier.equals("public")) {
				System.out.println(method.toGenericString() + "\n");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		/*
		 * 测试
		 */
		System.out.println(new StringUtils().toString(new java.util.Date()));
	}

}
