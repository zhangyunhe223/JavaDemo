package com.Chapter11.com;

public class CatchException {
	/**
	 * ���䷶��һ��
	 * ���񵥸��쳣
	 * @param args
	 */
	public static void main(String[] args) {
		// test
		try {
			System.out.println("����try���...");
			@SuppressWarnings("unused")
			Class<?> clazz = Class.forName("com.mingrikeji");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����catch���...");
			e.printStackTrace();
			System.out.println("�뿪catch���...");
		} finally {
			System.out.println("����finally���...");
		}
	}

}
