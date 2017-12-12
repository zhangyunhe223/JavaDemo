package com.Chapter4.com;

import java.util.Scanner;

public class CheckLogin {

	public static void main(String[] args) {
		// 验证登录信息的合法性,通过if...else语句进行多条件判断
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的账户:");
		String account = scanner.nextLine();
		System.out.println("请输入您的密码:");
		String password = scanner.nextLine();
		
		if (!account.equals("zhangyunhe1@foxmail.com")) {
			System.err.println("账户不存在!");
		}else if (!password.equals("123456")) {
			System.err.println("登录密码错误!");
		}else {
			System.out.println("恭喜您,登录成功!");
		}
	}

}
