package com.Chapter11.com;

import java.io.FileInputStream;

public class CloseIo {
	/**
	 * try...catch...finally
	 * 创建IO流，分配内存资源 在finally中，进行关闭IO流，并释放
	 * @param args
	 */
	private FileInputStream inputStream;
	
	public void readInfo() {
		try {
			// 创建FileInputStream 对象
			inputStream = new FileInputStream(".src/com/Chapter11/com/CloseIo.java");
			System.out.println("创建IO流，分配内存资源！");
		} catch (Exception io) {
			// 输出栈踪迹
			io.printStackTrace();
			System.out.println("创建IO流时发生的异常！");
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
					System.out.println("关闭IO流，释放内存资源！");
				} catch (Exception ioe) {
					// 输出栈踪迹
					ioe.printStackTrace();
					System.out.println("关闭IO流时，发生异常！");
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
