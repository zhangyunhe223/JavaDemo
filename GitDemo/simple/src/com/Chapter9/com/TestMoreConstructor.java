package com.Chapter9.com;

import java.lang.reflect.Constructor;

public class TestMoreConstructor {
	
	public static void main(String[] args) {
		/*
		 * 通过反射访问构造方法
		 * 1.实例化MoreConstructor对象
		 * 2.Object.getClass()是获取一个类型为Class的对象
		 * 3.获得所有的构造方法,按声明顺序返回
		 */
		MoreConstructor moreConstructor = new MoreConstructor();
		Class<?extends MoreConstructor> exampleC = moreConstructor.getClass();
		
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
		for(int i = 0;i < declaredConstructors.length;i++) {
			// 遍历构造方法
			Constructor<?> constructor = declaredConstructors[i];
			// isVarArgs()查看该构造方法是否允许带有可变数量的参数，如果允许则返回true，否则返回false
			System.out.println("------------------------");
			System.out.println("查看是否允许带有可变数量的参数："+constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为：");
			// getParameterTypes()按照声明顺序以Class数组的形式获得该构造方法的各个参数的类型
			Class[] parameterTypes = constructor.getParameterTypes();
			for(int j = 0;j < parameterTypes.length;j++) {
				System.out.println(" "+ parameterTypes[j]);
			}
			System.out.println("该构造方法可能抛出的异常类型为：");
			// getExceptionTypes()以Class数组的形式获得该构造方法可能抛出的异常类型
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(int j = 0;j < exceptionTypes.length;j++) {
				System.out.println(" "+ exceptionTypes[j]);
			}
			MoreConstructor constructor2 = null;
			while(constructor2 == null) {
				try { // 如果该成员变量的访问权为private，则抛出异常，既不允许访问
					if (i == 2) {
						// newInstance()通过该构造方法利用指定参数创建一个该类的对象，如果未设置参数
						// 则表示采取默认无参数构造方法。这里通过执行默认无参数的构造方法创建对象
						constructor2 = (MoreConstructor) constructor.newInstance();
					}else if (i == 1) {
						// 通过执行具有两个参数的构造方法创建对象
						constructor2 = (MoreConstructor) constructor.newInstance("7",5);
					}else {
						// 通过执行具有可变数量参数的构造方法创建对象
						Object[] parameters = new Object[]{ new String[] {"100","200","300"}};
						constructor2 = (MoreConstructor) constructor.newInstance(parameters);
					}
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("在创建对象时抛出异常，下面执行setAccessible()方法");
					constructor.setAccessible(true);//设置为允许访问
					e.printStackTrace();
				}
			}
			if (constructor2 != null) {
				constructor2.print();
			}
		}
		
	}

}
