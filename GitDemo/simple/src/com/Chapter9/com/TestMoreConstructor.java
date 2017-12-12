package com.Chapter9.com;

import java.lang.reflect.Constructor;

public class TestMoreConstructor {
	
	public static void main(String[] args) {
		/*
		 * ͨ��������ʹ��췽��
		 * 1.ʵ����MoreConstructor����
		 * 2.Object.getClass()�ǻ�ȡһ������ΪClass�Ķ���
		 * 3.������еĹ��췽��,������˳�򷵻�
		 */
		MoreConstructor moreConstructor = new MoreConstructor();
		Class<?extends MoreConstructor> exampleC = moreConstructor.getClass();
		
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
		for(int i = 0;i < declaredConstructors.length;i++) {
			// �������췽��
			Constructor<?> constructor = declaredConstructors[i];
			// isVarArgs()�鿴�ù��췽���Ƿ�������пɱ������Ĳ�������������򷵻�true�����򷵻�false
			System.out.println("------------------------");
			System.out.println("�鿴�Ƿ�������пɱ������Ĳ�����"+constructor.isVarArgs());
			System.out.println("�ù��췽������ڲ�����������Ϊ��");
			// getParameterTypes()��������˳����Class�������ʽ��øù��췽���ĸ�������������
			Class[] parameterTypes = constructor.getParameterTypes();
			for(int j = 0;j < parameterTypes.length;j++) {
				System.out.println(" "+ parameterTypes[j]);
			}
			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
			// getExceptionTypes()��Class�������ʽ��øù��췽�������׳����쳣����
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(int j = 0;j < exceptionTypes.length;j++) {
				System.out.println(" "+ exceptionTypes[j]);
			}
			MoreConstructor constructor2 = null;
			while(constructor2 == null) {
				try { // ����ó�Ա�����ķ���ȨΪprivate�����׳��쳣���Ȳ��������
					if (i == 2) {
						// newInstance()ͨ���ù��췽������ָ����������һ������Ķ������δ���ò���
						// ���ʾ��ȡĬ���޲������췽��������ͨ��ִ��Ĭ���޲����Ĺ��췽����������
						constructor2 = (MoreConstructor) constructor.newInstance();
					}else if (i == 1) {
						// ͨ��ִ�о������������Ĺ��췽����������
						constructor2 = (MoreConstructor) constructor.newInstance("7",5);
					}else {
						// ͨ��ִ�о��пɱ����������Ĺ��췽����������
						Object[] parameters = new Object[]{ new String[] {"100","200","300"}};
						constructor2 = (MoreConstructor) constructor.newInstance(parameters);
					}
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("�ڴ�������ʱ�׳��쳣������ִ��setAccessible()����");
					constructor.setAccessible(true);//����Ϊ�������
					e.printStackTrace();
				}
			}
			if (constructor2 != null) {
				constructor2.print();
			}
		}
		
	}

}
