package com.Chapter12.com;

import java.awt.EventQueue;
import javax.swing.UIManager;

public class TestFilesList {

	public static void main(String[] args) {
		// ”√”⁄≤‚ ‘FilesList
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					FilesList filesList = new FilesList();
					filesList.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}

}
