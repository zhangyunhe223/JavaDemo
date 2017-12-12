package com.Chapter9.com;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.Timer;

public class AlarmClock {
	/*
	 * 首先定义一个外部类，此外部类包括延迟时间和提示标志两个成员变量，通过构造函数来获取这两个参数；
	 * 在此外部类中定义一个方法作为闹钟的启动函数；
	 * 在该方法中定义一个局部内部类来实现ActionListener接口，重写actionPerformed（）方法，
	 * 使用SimpleDateFormat类和Date()方法获取系统的当前时间并输出，判断提示标志，若为true则使用Toolkit.getDefaultToolkit().beep();
	 * 重复之前的输出方法；创建一个新的Timer()对象来重复输出；
	 * 在主方法中创建对象并实例化后，使用JOptionPane类的showMessageDialog()方法弹出提示框来让用户选择是否退出。
	 */
	private int delay;// delay 延期
	private boolean flag;// flag 标记
	
	public AlarmClock(int delay,boolean flag) {
		this.delay = delay;
		this.flag = flag;
	}
	public void start(){
		// 定义内部类实现动作监听接口
		class Printer implements ActionListener {

			// 重写actionPerformed()方法
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss",Locale.US);
				GregorianCalendar ca = new GregorianCalendar();
				int day = ca.get(GregorianCalendar.AM_PM);
				if (day == 0) {
					System.out.println("当前时间：" + dateFormat.format(date) + " am");
				}else {
					System.out.println("当前时间：" + dateFormat.format(date) + " pm");
				}
				if (flag) {
					Toolkit.getDefaultToolkit().beep();;
				}
			}
			
		}
		new Timer(delay,new Printer()).start();
	}
}
