package com.Chapter6.com;

import java.util.Scanner;

public class CheckIPAddress {
	
	static String regex = "^(?:(?:2[0-4][0-9]\\.)|(?:25[0-5]\\.)|(?:1[0-9][0-9]\\.)|(?:[1-9][0-9]\\.)|(?:[0-9]\\.)){3}(?:(?:2[0-5][0-5])|(?:25[0-5])|(?:1[0-9][0-9])|(?:[1-9][0-9])|(?:[0-9]))$";

	/**
	 * �� IP��ַ��0~255.0~255.0~255.0~255
	 * ^(?:(?:2[0-4][0-9]\.)|(?:25[0-5]\.)|(?:1[0-9][0-9]\.)|(?:[1-9][0-9]\.)|(?:[0-9]\.)){3}
	 * (?:(?:2[0-5][0-5])|(?:25[0-5])|(?:1[0-9][0-9])|(?:[1-9][0-9])|(?:[0-9]))$
	 * 
	 * @param args
	 */
	private static void getIp(String ip) {
		// ��֤IP�ĺϷ���
		if (ip != null && !ip.isEmpty()) {
			if(ip.matches(regex)) {
				System.out.println("�Ϸ���IP��ַ��" + ip);
			}else {
				System.out.println("���Ϸ���IP��ַ��" + ip);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("����һ���Ϸ���IP��ַ��");
		Scanner scanner = new Scanner(System.in);
		String ip = scanner.next();
		getIp(ip);
	}

}
