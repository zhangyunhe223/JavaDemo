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
	 * ���ȶ���һ���ⲿ�࣬���ⲿ������ӳ�ʱ�����ʾ��־������Ա������ͨ�����캯������ȡ������������
	 * �ڴ��ⲿ���ж���һ��������Ϊ���ӵ�����������
	 * �ڸ÷����ж���һ���ֲ��ڲ�����ʵ��ActionListener�ӿڣ���дactionPerformed����������
	 * ʹ��SimpleDateFormat���Date()������ȡϵͳ�ĵ�ǰʱ�䲢������ж���ʾ��־����Ϊtrue��ʹ��Toolkit.getDefaultToolkit().beep();
	 * �ظ�֮ǰ���������������һ���µ�Timer()�������ظ������
	 * ���������д�������ʵ������ʹ��JOptionPane���showMessageDialog()����������ʾ�������û�ѡ���Ƿ��˳���
	 */
	private int delay;// delay ����
	private boolean flag;// flag ���
	
	public AlarmClock(int delay,boolean flag) {
		this.delay = delay;
		this.flag = flag;
	}
	public void start(){
		// �����ڲ���ʵ�ֶ��������ӿ�
		class Printer implements ActionListener {

			// ��дactionPerformed()����
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss",Locale.US);
				GregorianCalendar ca = new GregorianCalendar();
				int day = ca.get(GregorianCalendar.AM_PM);
				if (day == 0) {
					System.out.println("��ǰʱ�䣺" + dateFormat.format(date) + " am");
				}else {
					System.out.println("��ǰʱ�䣺" + dateFormat.format(date) + " pm");
				}
				if (flag) {
					Toolkit.getDefaultToolkit().beep();;
				}
			}
			
		}
		new Timer(delay,new Printer()).start();
	}
}
