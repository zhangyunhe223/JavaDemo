package com.Chapter9.com;

public class OutString {

	public static void main(String[] args) {
		
		final String sourceStr = " zhang yunhe student apple  0123";
		// ��д�����ڲ���
		IStringDeal s = new IStringDeal() {
			
			@Override
			public String filterBankChar() {
				// �����ַ����пո�ķ���
				String convertStr = sourceStr;
				// �滻ȫ���ո�
				convertStr = convertStr.replace(" ", "");
				// ����ת������ַ���
				return convertStr;
			}
		};
		System.out.println("ԭ�����ַ���" + sourceStr);
		System.out.println("�滻֮����ַ�����" + s.filterBankChar());
	}

}
