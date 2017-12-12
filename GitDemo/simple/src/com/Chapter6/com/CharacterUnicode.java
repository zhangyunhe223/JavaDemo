package com.Chapter6.com;

public class CharacterUnicode {

	public static void main(String[] args) {
		// 将汉字和字母转换为Unicode码
		String string = "zhang张运何123";
		char[] charA = string.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char c : charA) {
			builder.append((int)c+ " ");
		}
		System.out.println("zhang张运何123的Unicode编码：");
		System.out.println(builder.toString());
	}

}
