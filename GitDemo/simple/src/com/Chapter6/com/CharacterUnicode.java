package com.Chapter6.com;

public class CharacterUnicode {

	public static void main(String[] args) {
		// �����ֺ���ĸת��ΪUnicode��
		String string = "zhang���˺�123";
		char[] charA = string.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char c : charA) {
			builder.append((int)c+ " ");
		}
		System.out.println("zhang���˺�123��Unicode���룺");
		System.out.println(builder.toString());
	}

}
