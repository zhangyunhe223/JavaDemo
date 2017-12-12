package com.Chapter10.com;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClassInfo extends JFrame {
	/*
	 *  ��ƹ���
		1������Ŀ���½�������ClassInfo�� �ڴ��������JScrollPane,����JScrollPane�з��ñ��ؼ�JTable��
		2����дgetTable()�������ڸ÷����д������������ñ�������ģ�ͣ�Ȼ�����getStudents()������ȡѧ����Ϣ�ļ��϶���
		�ڱ����ü��϶����ͬʱ����ÿ��Ԫ����ӵ����ģ�͵��У�����ʾ�����ؼ��С�
		3����дgetStudents()�������÷�����������ߴ���List���϶��󣬲�Ϊ���϶�����Ӷ��Ԫ�أ�ÿ��Ԫ��ֵ����һ��ѧ����Ϣ�����а����������Ա𡢳�������
	 */
	
	JPanel contentPane;
	JTable table;
	
	public ClassInfo() {
		setTitle("02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250,300,400,300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		JScrollPane jScrollPane = new JScrollPane();
		contentPane.add(jScrollPane,BorderLayout.CENTER);
		jScrollPane.setViewportView(getTable());
	}
	/*
	 * ��дgetTable()����
	 */
	private JTable getTable() {
		if (table == null) {
			table = new JTable(); // �������ؼ� 
			table.setRowHeight(23); // �����и߶�  
			String[] colums = {"����","�Ա�","��������"}; // ������������ 
			// �������ģ�� 
			DefaultTableModel defaultTableModel = new DefaultTableModel(colums,0);
			// ���ñ��ģ��
			table.setModel(defaultTableModel);
			// ���÷�������list���϶��� 
			List<String> students = getStudents();
			// ��ѧ����Ϣ����
			for (String string : students) {
				// ��ѧ����Ϣ���Ϊ���� 
				String[] args = string.split(",");
				// ��ѧ����Ϣ��ӵ������� 
				defaultTableModel.addRow(args);
			}
		}
		return table;
	}
	/*
	 * ��дgetStudents()����
	 */
	private List<String> getStudents(){
		//����List���϶���  
		List<String> list = new ArrayList<String>();
		list.add("���,��,1985-1-2");
		list.add("����,Ů,1999-5-6");
		list.add("����,��,1959-5-25");
		list.add("����,Ů,1999-5-6");
		list.add("����,Ů,1999-5-6");
		list.add("������,��,1999-5-6");
		return list;
	}
}
