package com.Chapter11.com;

import java.io.FileInputStream;

public class CloseIo {
	/**
	 * try...catch...finally
	 * ����IO���������ڴ���Դ ��finally�У����йر�IO�������ͷ�
	 * @param args
	 */
	private FileInputStream inputStream;
	
	public void readInfo() {
		try {
			// ����FileInputStream ����
			inputStream = new FileInputStream(".src/com/Chapter11/com/CloseIo.java");
			System.out.println("����IO���������ڴ���Դ��");
		} catch (Exception io) {
			// ���ջ�ټ�
			io.printStackTrace();
			System.out.println("����IO��ʱ�������쳣��");
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
					System.out.println("�ر�IO�����ͷ��ڴ���Դ��");
				} catch (Exception ioe) {
					// ���ջ�ټ�
					ioe.printStackTrace();
					System.out.println("�ر�IO��ʱ�������쳣��");
				}
			}
		}
	}

	public static void main(String[] args) {
		// test
		CloseIo closeIo = new CloseIo();
		closeIo.readInfo();
	}

}
