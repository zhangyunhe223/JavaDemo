package com.Chapter6.com;

import java.util.StringTokenizer;

public class Blak {

	public static void main(String[] args) {
		// ����string���󣬽��ַ�����ԭ���ĳ��Ⱥ�ȥ����ǰ����β���ո��ĳ������
		String string1 = new String("          java class");
		String string2 = string1.trim();
		
		StringTokenizer string3 = new StringTokenizer(string1," ");
		StringBuffer buffer = new StringBuffer();
/*		int i = 1;
		while(string3.hasMoreTokens()) {
			i++;
			buffer.append(string3.nextToken());
		}*/
		for(int i = 1;i <= string1.length();i++) {
			if(string3.hasMoreTokens()) {
				buffer.append(string3.nextToken());
			}
		}
		
		String str = new String("j a v a ���");
		System.out.println("ԭ���ĳ��ȣ�" + string1.length());
		System.out.println("ȥ��ǰ��ո�ĳ��ȣ�" + string2.length());
		System.out.println("ȥ��ǰ��ո����ַ���" + string2);
		System.out.println("ȥ�����пո����ַ���" + buffer.toString());
		
		System.out.println("ȥ�����пո����ַ���" + str.replaceAll(" ", ""));
		System.out.println("ȥ�����пո����ַ���" + string1.replace(" ", "-"));
		System.out.println("ȥ�����пո����ַ���" + string1.replaceFirst(" ", "Z"));
	}

}
