package com.Chapter9.com;

import javax.swing.JFrame;

public class ButtonFrame extends JFrame {
	/*
	 * 
	 */
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	public ButtonFrame() {
		setTitle("01");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		ButtonPanel panel = new ButtonPanel();
		add(panel);
	}

}
