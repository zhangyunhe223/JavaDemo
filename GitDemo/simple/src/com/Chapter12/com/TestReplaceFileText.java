package com.Chapter12.com;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class TestReplaceFileText {

	public static void main(String[] args) {
		// test ReplaceFileText
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ReplaceFileText fileText = new ReplaceFileText();
					fileText.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
