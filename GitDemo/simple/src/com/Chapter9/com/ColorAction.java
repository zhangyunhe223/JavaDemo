package com.Chapter9.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorAction implements ActionListener {
	/*
	 * 
	 */
	Color c;
	ButtonPanel panel;

	public ColorAction(Color c, ButtonPanel panel) {
		this.c = c;
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.setBackground(c);
	}
}
