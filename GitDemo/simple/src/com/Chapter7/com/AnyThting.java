package com.Chapter7.com;

public class AnyThting {
	
	public AnyThting() {
		// �����޲ι��췽��
		/*
		 * ������ʹ��this�����в������췽��
		 * ����֮�����в����Ĺ��췽���в���ʹ��this�����޲������췽��
		 * ����һ���ע�⣬���޲ι��췽���У�ֻ���Ե�һ��ʹ��this�ؼ��ֵ��ù��췽��
		 */
		this("this �����вι��췽��");
		System.out.println("�޲ι��췽��");
	}
	public AnyThting(String string) {
		// �����вι��췽��
		System.out.println("�вι��췽��");
	}

}
