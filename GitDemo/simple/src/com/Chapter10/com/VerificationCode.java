package com.Chapter10.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VerificationCode {

	public static void main(String[] args) {
		/**
		 * ���������λ��֤��
		 * 0-9,a-z,A-Z
		 */
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i = 65; i <= 90; i++) {
			list.add((char)i);
		}
		for (int i = 97; i <= 122; i++) {
			list.add((char)i);
		}
		for (Object object : list) {
			System.out.print(object);
		}
		System.out.println();
		//������λ������֤��
		System.out.print("��λ����֤�룺");
		Random random = new Random();
		for(int i = 1;i <= 4;i++) {
			System.out.print(list.get(random.nextInt(list.size())));
		}
	}

}
