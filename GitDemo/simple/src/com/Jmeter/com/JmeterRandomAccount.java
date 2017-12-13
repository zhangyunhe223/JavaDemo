package com.Jmeter.com;

import java.io.FileWriter;
import java.text.SimpleDateFormat;

public class JmeterRandomAccount {
	
	public static void writeTestByLine() {
		/*
		 * 逐行写文本到文件中
		 */
		// 这也是换行符,功能和"\n"是一致的
		String str = System.getProperty("line.separator");
			try {
				FileWriter fw = new FileWriter("D:\\scriptTest\\register.txt");
				for(int i = 1;i <= 10;i++) {
					String str2 = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
					fw.write(str2 + "_" + i + "@gmail.com,123456");
					System.out.println(str2 + "_" + i  + "@gmail.com,123456");
					// 换行
					fw.write(str);
				}
				fw.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		writeTestByLine();
	}
}
