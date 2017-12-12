package com.Chapter10.com;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class TestDynamicArray {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					DynamicArray dynamicArray = new DynamicArray();// ����һ������
					dynamicArray.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
