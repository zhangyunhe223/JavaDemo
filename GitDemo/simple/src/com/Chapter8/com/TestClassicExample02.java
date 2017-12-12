package com.Chapter8.com;

import java.lang.reflect.Field;

public class TestClassicExample02 {

	public static void main(String[] args) {
		// ����ClassicExample02
		ClassicExample02 classicExample02 = new ClassicExample02();
		// ��ȡ����student�����class����
		Class<?> clazz = classicExample02.getClass();
		System.out.println("��ı�׼���ƣ�" + clazz.getCanonicalName());
		System.out.println("��ļ�д���ƣ�" + clazz.getSimpleName());
		try {
			Field id = clazz.getDeclaredField("id");
			System.out.println("����ǰ��id:" + classicExample02.getId());
			id.setAccessible(true);
			id.setInt(classicExample02, 10);
			System.out.println("���ú��id:" +classicExample02.getId() );
			
			Field name = clazz.getDeclaredField("name");
			System.out.println("����ǰ��name:" + classicExample02.getName());
			name.setAccessible(true);
			name.set(classicExample02, "���˺�");
			System.out.println("���ú��name:" + classicExample02.getName());
			
			Field male = clazz.getDeclaredField("male");
			System.out.println("����ǰ��male:" + classicExample02.isMale());
			male.setAccessible(true);
			male.setBoolean(classicExample02, true);
			System.out.println("���ú��male:" + classicExample02.isMale());
			
			Field account = clazz.getDeclaredField("account");
			System.out.println("����ǰ��account:" + classicExample02.getAccount());
			account.setAccessible(true);
			account.setDouble(classicExample02, 123.35);
			System.out.println("���ú��account:" + classicExample02.getAccount());
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
