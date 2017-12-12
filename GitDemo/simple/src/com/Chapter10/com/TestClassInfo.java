package com.Chapter10.com;

import javax.swing.JFrame;

public class TestClassInfo {

	public static void main(String[] args) {
		// 使用List集合在方法之间传递学生的信息
		ClassInfo classInfo = new ClassInfo();
		classInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		classInfo.setVisible(true);
	}

}
