package com.Chapter6.com;

public class SubO {

	public static void main(String[] args) {
		String string = "zhang";
		String string2 = "yunhe";
		StringBuffer stringBuffer = new StringBuffer(string);
		stringBuffer.insert(5, string2);
		System.out.println(stringBuffer);
		stringBuffer.delete(0, 2);
		System.out.println(stringBuffer);
		
		StringBuffer stringBuffer2 = new StringBuffer("helloword");
		String string3 = stringBuffer2.toString();
		System.out.println("toString:" + string3);
		System.out.println("stringBuffer2:" + string3);
	}

}
