package com.Chapter10.com;

import java.awt.EventQueue;
import javax.swing.UIManager;

public class TestDictionaryDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					DictionaryDemo demo = new DictionaryDemo();
					demo.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
