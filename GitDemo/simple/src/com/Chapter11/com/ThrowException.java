package com.Chapter11.com;

public class ThrowException {
	/**
	 * ����3��
	 * �������׳��쳣
	 * ʵ��һ����ʹ���������໹δ���ʵ�ֵķ���
	 * �������ʵ�������෽��ʱ�����׳�
	 * @param args
	 */
	public static void throwException() {
		throw new UnsupportedOperationException("�÷���δʵ�֣�");
	}

	public static void main(String[] args) {
		// test
		ThrowException.throwException();
	}

}
