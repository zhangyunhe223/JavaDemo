package com.Chapter9.com;

import javax.swing.JOptionPane;

public class TestClock {
	public static void main(String[] args) {
		AlarmClock clock = new AlarmClock(1000,false);
		clock.start();
		JOptionPane.showMessageDialog(null, "�Ƿ��˳���");
		System.exit(0);
	}
}
