package com.Chapter11.com;

import java.io.FileInputStream;

public class Test {
	/**
	 * 
	 * @param args
	 */
	public void showInfo() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("");
	}
	public static void main(String[] args) {
		// test
		Test test = new Test();
		try {
			test.showInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
