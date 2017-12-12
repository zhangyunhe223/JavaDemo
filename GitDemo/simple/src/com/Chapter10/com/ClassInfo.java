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
	 *  设计过程
		1）在项目中新建窗体类ClassInfo。 在窗体中添加JScrollPane,再在JScrollPane中放置表格控件JTable。
		2）编写getTable()方法。在该方法中创建表格对象并设置表格的数据模型，然后调用getStudents()方法获取学生信息的集合对象，
		在遍历该集合对象的同时，把每个元素添加到表格模型的行，并显示到表格控件中。
		3）编写getStudents()方法，该方法将向调用者传递List集合对象，并为集合对象添加多个元素，每个元素值都是一个学生信息，其中包括姓名、性别、出生日期
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
	 * 编写getTable()方法
	 */
	private JTable getTable() {
		if (table == null) {
			table = new JTable(); // 创建表格控件 
			table.setRowHeight(23); // 设置行高度  
			String[] colums = {"姓名","性别","出生日期"}; // 创建列名数组 
			// 创建表格模型 
			DefaultTableModel defaultTableModel = new DefaultTableModel(colums,0);
			// 设置表格模型
			table.setModel(defaultTableModel);
			// 调用方法传递list集合对象 
			List<String> students = getStudents();
			// 把学生信息遍历
			for (String string : students) {
				// 把学生信息拆分为数组 
				String[] args = string.split(",");
				// 把学生信息添加到表格的行 
				defaultTableModel.addRow(args);
			}
		}
		return table;
	}
	/*
	 * 编写getStudents()方法
	 */
	private List<String> getStudents(){
		//创建List集合对象  
		List<String> list = new ArrayList<String>();
		list.add("李哥,男,1985-1-2");
		list.add("张三,女,1999-5-6");
		list.add("李四,男,1959-5-25");
		list.add("晓东,女,1999-5-6");
		list.add("晚晴,女,1999-5-6");
		list.add("李婉玉,男,1999-5-6");
		return list;
	}
}
