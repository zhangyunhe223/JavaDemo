package com.Chapter4.com;

import java.util.Scanner;

public class CheckLogin {

	public static void main(String[] args) {
		// ��֤��¼��Ϣ�ĺϷ���,ͨ��if...else�����ж������ж�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������˻�:");
		String account = scanner.nextLine();
		System.out.println("��������������:");
		String password = scanner.nextLine();
		
		if (!account.equals("zhangyunhe1@foxmail.com")) {
			System.err.println("�˻�������!");
		}else if (!password.equals("123456")) {
			System.err.println("��¼�������!");
		}else {
			System.out.println("��ϲ��,��¼�ɹ�!");
		}
	}

}
