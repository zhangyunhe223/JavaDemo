package com.Chapter11.com;

public class Example_03 {
	/**
	 * 使用try...catch
	 * 演示打印输出除数为0时的异常信息
	 * @param args
	 */

	public void printBugInfo() {
		try {
			int i = 100;
			int j = 0;
			int divisor = i / j;
			System.out.println("i / j =" + divisor);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("---------");
			System.out.println("getMessage():" + e.getMessage());
			System.out.println("---------");
			System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
			System.out.println("---------");
			System.out.println("toString():" + e.toString());
		}

	}

	public static void main(String[] args) {
		// ceshi
		Example_03 example_03 = new Example_03();
		example_03.printBugInfo();
	}

}
