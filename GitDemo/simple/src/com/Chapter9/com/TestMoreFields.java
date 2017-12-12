package com.Chapter9.com;

import java.lang.reflect.Field;

public class TestMoreFields {

	public static void main(String[] args) {
		/*
		 * 反射访问成员变量
		 */
		MoreFields moreFields = new MoreFields();
		Class<? extends MoreFields> exampleC = moreFields.getClass();
		
		Field[] fields2 = exampleC.getDeclaredFields();
		for(int i = 0;i < fields2.length;i++) {
			// 遍历成员变量
			Field field = fields2[i];
			System.out.println("成员名称：" + field.getName());
			Class fieldType = field.getType();
			System.out.println("类型为：" + fieldType);
			
			boolean isTurn = true;
			while(isTurn) {
				try { // 如果该成员变量的访问权为private，则抛出异常，既不允许访问
					isTurn = false;
					System.out.println("修改前的值：" + field.get(moreFields));
					// 判断成员变量的类型是否为int
					if (fieldType.equals(int.class)) {
						System.out.println("利用方法setInt修改成员变量的值：");
						field.setInt(moreFields, 5);
					// 判断成员变量的类型是否为float
					}else if (fieldType.equals(float.class)) {
						System.out.println("利用方法setFloat修改成员变量的值：");
						field.setFloat(moreFields, 100.63f);
					// 判断成员变量的类型是否为boolean
					}else if (fieldType.equals(boolean.class)) {
						System.out.println("利用方法setBoolean修改成员变量的值：");
						field.setBoolean(moreFields, true);
					}else {
						System.out.println("利用方法修改成员变量的值：");
						field.set(moreFields, "zhangyunhe");
					}
					System.out.println("修改后的值为:" + field.get(moreFields));
					System.out.println("------------------");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("在设置前抛出异常！");
					field.setAccessible(true);
					isTurn = true;
				}
			}
			System.out.println();
		}
	}

}
