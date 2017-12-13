package com.Chapter11.com;

import java.io.FileReader;
import java.io.IOException;

public class Example_08 {
	/**
	 * 创建一个createFile()的方法
	 * 在创建一个test()调用createFile的方法
	 * @param args
	 */
	private FileReader fileReader;
	
	public void creatFile() throws Exception{
		fileReader = new FileReader(".src/com/Chapter11/com/Example_08.java");
		System.out.println("分配内存资源！");
	}
	public void test() {
		try {
			creatFile();
			System.out.println("调用creatFile()方法成功！");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("创建IO对象异常！");
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
					System.out.println("关闭IO流成功！");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("关闭IO流失败！");
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
