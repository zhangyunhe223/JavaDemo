package com.Chapter11.com;

public class ThrowsException {
	/**
	 * ����4��
	 * �������׳��쳣
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void throwsException() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Drive");
	}
	
	public static void main(String[] args) {
		// test
		try {
			throwsException();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
