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
		// 对字符串进行加密
		String value = "123456";
		char secret = '祈';
		System.out.println("加密前字符：" + value);
		String encrypt = EncryptUncarypt.EAndU(value, secret);
		System.out.println("加密后字符：" + encrypt);
		String uncrypt = EncryptUncarypt.EAndU(encrypt, secret);
		System.out.println("解密后字符：" + uncrypt);
	}

}
