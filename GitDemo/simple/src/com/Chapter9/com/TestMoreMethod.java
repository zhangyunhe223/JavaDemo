package com.Chapter9.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMoreMethod {

	public static void main(String[] args) {
		/*
		 * 反射访问成员方法
		 */
		MoreMethod example = new MoreMethod();
		Class<? extends MoreMethod> exampleC = example.getClass();

		Method[] method = exampleC.getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			Method method2 = method[i];
			System.out.println("名称为：" + method2.getName());

			System.out.println("是否允许带有可变数量的参数：" + method2.isVarArgs());
			System.out.println("入口参数类型依次为：");
			// 获取所有的参数类型
			Class[] parameterTypes = method2.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			System.out.println("获取返回值类型：" + method2.getReturnType());

			System.out.println("该构造方法可能抛出的异常类型为：");
			// getExceptionTypes()以Class数组的形式获得该构造方法可能抛出的异常类型
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
						System.out.println("返回值：" + method2.invoke(example, 1));
					} else if (i == 2) {
						System.out.println("返回值：" + method2.invoke(example, "1", 1));
					} else {
						// 通过执行具有可变数量参数的构造方法创建对象
						Object[] parameters = new Object[] { new String[] { "100", "200", "300" } };
						System.out.println("返回值：" + method2.invoke(example, parameters));
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
			System.out.println("————————————————————————————————————————————————————————————");
		}
	}

}
