package com.Chapter9.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMoreMethod {

	public static void main(String[] args) {
		/*
		 * ������ʳ�Ա����
		 */
		MoreMethod example = new MoreMethod();
		Class<? extends MoreMethod> exampleC = example.getClass();

		Method[] method = exampleC.getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			Method method2 = method[i];
			System.out.println("����Ϊ��" + method2.getName());

			System.out.println("�Ƿ�������пɱ������Ĳ�����" + method2.isVarArgs());
			System.out.println("��ڲ�����������Ϊ��");
			// ��ȡ���еĲ�������
			Class[] parameterTypes = method2.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			System.out.println("��ȡ����ֵ���ͣ�" + method2.getReturnType());

			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
			// getExceptionTypes()��Class�������ʽ��øù��췽�������׳����쳣����
			Class[] exceptionTypes = method2.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}

			boolean isTurn = true;
			while (isTurn) {
				try {
					isTurn = false;
					if (i == 0)
						method2.invoke(example);
					else if (i == 1) {
						System.out.println("����ֵ��" + method2.invoke(example, 1));
					} else if (i == 2) {
						System.out.println("����ֵ��" + method2.invoke(example, "1", 1));
					} else {
						// ͨ��ִ�о��пɱ����������Ĺ��췽����������
						Object[] parameters = new Object[] { new String[] { "100", "200", "300" } };
						System.out.println("����ֵ��" + method2.invoke(example, parameters));
					}
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("������������������������������������������������������������������������������������������������������������������������");
		}
	}

}
