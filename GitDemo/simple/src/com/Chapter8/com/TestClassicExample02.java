package com.Chapter8.com;

import java.lang.reflect.Field;

public class TestClassicExample02 {

	public static void main(String[] args) {
		// 测试ClassicExample02
		ClassicExample02 classicExample02 = new ClassicExample02();
		// 获取代表student对象的class对象
		Class<?> clazz = classicExample02.getClass();
		System.out.println("类的标准名称：" + clazz.getCanonicalName());
		System.out.println("类的简写名称：" + clazz.getSimpleName());
		try {
			Field id = clazz.getDeclaredField("id");
			System.out.println("设置前的id:" + classicExample02.getId());
			id.setAccessible(true);
			id.setInt(classicExample02, 10);
			System.out.println("设置后的id:" +classicExample02.getId() );
			
			Field name = clazz.getDeclaredField("name");
			System.out.println("设置前的name:" + classicExample02.getName());
			name.setAccessible(true);
			name.set(classicExample02, "张运何");
			System.out.println("设置后的name:" + classicExample02.getName());
			
			Field male = clazz.getDeclaredField("male");
			System.out.println("设置前的male:" + classicExample02.isMale());
			male.setAccessible(true);
			male.setBoolean(classicExample02, true);
			System.out.println("设置后的male:" + classicExample02.isMale());
			
			Field account = clazz.getDeclaredField("account");
			System.out.println("设置前的account:" + classicExample02.getAccount());
			account.setAccessible(true);
			account.setDouble(classicExample02, 123.35);
			System.out.println("设置后的account:" + classicExample02.getAccount());
		}catch (SecurityException e) {
			e.printStackTrace();
		}catch (NoSuchFieldException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
