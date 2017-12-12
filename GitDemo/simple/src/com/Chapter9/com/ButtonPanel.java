package com.Chapter9.com;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	/*
	 * 普通内部类的简单应用
	 */
	public ButtonPanel() {
		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");
		add(yellowButton);
		add(blueButton);
		add(redButton);
		ColorAction yellowAction = new ColorAction(Color.YELLOW, this);
		ColorAction blueAction = new ColorAction(Color.BLUE, this);
		ColorAction redAction = new ColorAction(Color.RED, this);
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}
}
