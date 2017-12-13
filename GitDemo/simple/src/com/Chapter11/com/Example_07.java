package com.Chapter11.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example_07 {
	/**
	 * ʹ��catch...finally
	 * 
	 * @param args
	 */
	private FileReader fileReader;

	public void example() {
		// ͨ����Ա����ʵ��
		try {
			try {
				fileReader = new FileReader(".src/com/Chapter11/com/Example_07.java");
				System.out.println("�ҵ��ļ��ɹ�������IO����ɹ���");
			} catch (FileNotFoundException e) {
				// �׳�IO���쳣
				e.getMessage();
				System.out.println("�ҵ��ļ�ʧ�ܣ�");
			}
		} finally {
			// �Գ�������쳣�������Դ�ͷ�
			if (fileReader != null) {
				try {
					fileReader.close();
					System.out.println("�ر�IO���ɹ���");
				} catch (IOException e) {
					// �׳��ر�IO���쳣
					e.printStackTrace();
					System.out.println("�ر�IO���쳣��");
				}
			}
		}
	}

	public static void main(String[] args) {
		// test
		Example_07 example_07 = new Example_07();
		example_07.example();
	}

}
