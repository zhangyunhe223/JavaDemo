package com.Chapter10.com;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class TestPhoneBook {

	public static void main(String[] args) {
		// 测试手机电话本
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					PhoneBook phoneBook = new PhoneBook();
					phoneBook.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
