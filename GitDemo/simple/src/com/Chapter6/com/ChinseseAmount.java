package com.Chapter6.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChinseseAmount {

	public static void main(String[] args) {
		// ʹ��������ʽƥ�人�֣�[\\u4e00-\\u9fa5]
		System.out.println("������һƪ���£�");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String regex = "[\\u4e00-\\u9fa5]";
		/*
		 * �ж���û������
		 * �����Žܵĸ衶���Ƕ�һ��������֪���ҵ��Σ���֪���ҵ�ʹ����֪�����ǵĸ��ܶ���ͬ��������ȷʵӦ������������ÿ���˶�һ��������һ�������룬һ���ķ��򣬿���ͬ���Ĺ�â��ͬ����Ҫ��ǿ��������Ҫ�¸��������������ҵ������Ϳ��԰ѶԷ���������
		 */
		if(string.getBytes().length == string.length()) {
			System.out.println("�޺��֣�");
		}else {
			int count = 0;
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(string);
			while(matcher.find()) {
				count++;
			}
			System.out.println("�ж��ٸ����֣�" + count);
		}
	}

}
