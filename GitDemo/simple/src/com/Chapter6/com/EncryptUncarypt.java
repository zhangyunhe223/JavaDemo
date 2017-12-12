package com.Chapter6.com;

public class EncryptUncarypt {
	
	public static String EAndU(String value, char seret) {
		byte[] bt = value.getBytes();
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (bt[i] ^ (int) seret);
		}
		return new String(bt, 0, bt.length);
	}

	public static void main(String[] args) {
		// ���ַ������м���
		String value = "123456";
		char secret = '��';
		System.out.println("����ǰ�ַ���" + value);
		String encrypt = EncryptUncarypt.EAndU(value, secret);
		System.out.println("���ܺ��ַ���" + encrypt);
		String uncrypt = EncryptUncarypt.EAndU(encrypt, secret);
		System.out.println("���ܺ��ַ���" + uncrypt);
	}

}
