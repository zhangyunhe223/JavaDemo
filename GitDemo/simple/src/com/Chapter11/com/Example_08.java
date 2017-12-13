package com.Chapter11.com;

import java.io.FileReader;
import java.io.IOException;

public class Example_08 {
	/**
	 * ����һ��createFile()�ķ���
	 * �ڴ���һ��test()����createFile�ķ���
	 * @param args
	 */
	private FileReader fileReader;
	
	public void creatFile() throws Exception{
		fileReader = new FileReader(".src/com/Chapter11/com/Example_08.java");
		System.out.println("�����ڴ���Դ��");
	}
	public void test() {
		try {
			creatFile();
			System.out.println("����creatFile()�����ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����IO�����쳣��");
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
					System.out.println("�ر�IO���ɹ���");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�ر�IO��ʧ�ܣ�");
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// test
		Example_08 example_08 = new Example_08();
		example_08.test();
	}

}
