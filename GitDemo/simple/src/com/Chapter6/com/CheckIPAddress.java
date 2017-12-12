package com.Chapter6.com;

import java.util.Scanner;

public class CheckIPAddress {
	
	static String regex = "^(?:(?:2[0-4][0-9]\\.)|(?:25[0-5]\\.)|(?:1[0-9][0-9]\\.)|(?:[1-9][0-9]\\.)|(?:[0-9]\\.)){3}(?:(?:2[0-5][0-5])|(?:25[0-5])|(?:1[0-9][0-9])|(?:[1-9][0-9])|(?:[0-9]))$";

	/**
	 * ● IP地址：0~255.0~255.0~255.0~255
	 * ^(?:(?:2[0-4][0-9]\.)|(?:25[0-5]\.)|(?:1[0-9][0-9]\.)|(?:[1-9][0-9]\.)|(?:[0-9]\.)){3}
	 * (?:(?:2[0-5][0-5])|(?:25[0-5])|(?:1[0-9][0-9])|(?:[1-9][0-9])|(?:[0-9]))$
	 * 
	 * @param args
	 */
	private static void getIp(String ip) {
		// 验证IP的合法性
		if (ip != null && !ip.isEmpty()) {
			if(ip.matches(regex)) {
				System.out.println("合法的IP地址：" + ip);
			}else {
				System.out.println("不合法的IP地址：" + ip);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("输入一个合法的IP地址：");
		Scanner scanner = new Scanner(System.in);
		String ip = scanner.next();
		getIp(ip);
	}

}
