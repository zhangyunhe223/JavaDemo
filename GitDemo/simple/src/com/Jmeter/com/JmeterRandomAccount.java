package com.Jmeter.com;

import java.io.FileWriter;
import java.text.SimpleDateFormat;

public class JmeterRandomAccount {
	
	public static void writeTestByLine() {
		/*
		 * ����д�ı����ļ���
		 */
		// ��Ҳ�ǻ��з�,���ܺ�"\n"��һ�µ�
		String str = System.getProperty("line.separator");
			try {
				FileWriter fw = new FileWriter("D:\\scriptTest\\register.txt");
				for(int i = 1;i <= 10;i++) {
					String str2 = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
					fw.write(str2 + "_" + i + "@gmail.com,123456");
					System.out.println(str2 + "_" + i  + "@gmail.com,123456");
					// ����
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
