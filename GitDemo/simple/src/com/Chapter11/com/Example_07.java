package com.Chapter11.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example_07 {
	/**
	 * 使用catch...finally
	 * 
	 * @param args
	 */
	private FileReader fileReader;

	public void example() {
		// 通过成员方法实现
		try {
			try {
				fileReader = new FileReader(".src/com/Chapter11/com/Example_07.java");
				System.out.println("找到文件成功！创建IO对象成功！");
			} catch (FileNotFoundException e) {
				// 抛出IO流异常
				e.getMessage();
				System.out.println("找到文件失败！");
			}
		} finally {
			// 对程序进行异常处理和资源释放
			if (fileReader != null) {
				try {
					fileReader.close();
					System.out.println("关闭IO流成功！");
				} catch (IOException e) {
					// 抛出关闭IO流异常
					e.printStackTrace();
					System.out.println("关闭IO流异常！");
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
