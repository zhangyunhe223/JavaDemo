package com.Chapter12.com;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;

public class FilesList extends JFrame implements FileFilter{
	/**
	 * 实现的是读取文件夹指定类型的文件并显示到表格控件中，显示指定类型的文件 
	 * 思路分析： 
	 * 1.因为是窗体应用，首先实现视图层
	 * 2.自定义扩展名过滤器
	 * 3.实现过滤器
	 * 4.显示文件夹中的文件
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel label;
	private JTextField extNameField;
	private JTable table;
	private File dir;

	/*
	 * 步骤一：
	 * 实现视图层
	 * 需要一个按钮控件JButton用来选择文件夹； 
	 * 需要一个标签控件JLabel用来显示选择的路径；
	 * 需要一个标签控件JLabel提示用户输入什么；
	 * 需要一个文本框控件JTextField供用户输入文件类型； 
	 * 需要一个表格控件JTable显示选中目录下指定类型的文件
	 */
	public FilesList() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 520, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("显示指定类型的文件");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 93, 54, 0 };
		gbl_panel.rowHeights = new int[] { 23, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton button = new JButton("选择文件夹");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 选择文件
				do_button_actionPerformed(e);
			}
		});

		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);

		label = new JLabel("文件夹路径：");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);

		JLabel label_1 = new JLabel("输入指定文件扩展名称：");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);

		extNameField = new JTextField();
		extNameField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				// 更新列表
				do_extNameField_caretUpdate(e);
			}
		});
		extNameField.setText(null);
		GridBagConstraints gbc_extNameField = new GridBagConstraints();
		gbc_extNameField.insets = new Insets(0, 0, 5, 0);
		gbc_extNameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_extNameField.gridx = 1;
		gbc_extNameField.gridy = 1;
		panel.add(extNameField, gbc_extNameField);
		extNameField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		// 自适应
		table.getAutoResizeMode(); // getAutoResizeMode(JTable.AUTO_RESIZE_OFF) 自定义JTable列的宽度
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "文件名称", "文件大小", "修改日期" }) {
			private static final long serialVersionUID = 5274214559103654856L;
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
/*		
 * 自定义JTable列的宽度
 * 		table.getColumnModel().getColumn(0).setPreferredWidth();
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(220);*/
		scrollPane.setViewportView(table);
	}

	/**
	 * 自定义扩展名过滤器
	 * @author
	 */
	public boolean accept(File pathname) {
		// 获取用户设置的指定扩展名
		String extName = extNameField.getText();
		if (extName == null || extName.isEmpty())
			return false;
		if (!extName.startsWith("."))// 判断扩展名前缀
			extName = "." + extName;// 完事扩展名前缀
		extName = extName.toLowerCase();
		// 判断扩展名与过滤文件名是否符合要求
		if (pathname.getName().toLowerCase().endsWith(extName))
			return true;
		return false;
	}
	
	/**
	 * 步骤二：
	 * 选择文件夹按钮的事件处理方法
	 * 实现过滤器
	 */
	protected void do_button_actionPerformed(ActionEvent e) {
		final String fileType = extNameField.getText();
		if (fileType.isEmpty()) {
			JOptionPane.showMessageDialog(this, "请输入文件类型！", "", JOptionPane.WARNING_MESSAGE);
			return;
		}
		JFileChooser chooser = new JFileChooser();// 创建文件选择器
		// 设置选择器的过滤器
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setMultiSelectionEnabled(false); // 禁止选择多个文件夹
		// 打开文件选择器
		int result = chooser.showOpenDialog(this);
		// 符合条件的文件
		if (result == JFileChooser.APPROVE_OPTION) {
			File[] listFiles = chooser.getSelectedFile().listFiles(new java.io.FileFilter() {

				@Override
				public boolean accept(File pathname) {
					if (pathname.getName().endsWith(fileType)) {
						return true;
					} else {
						return false;
					}
				}

			});
			DefaultTableModel model = (DefaultTableModel) table.getModel(); // 获得默认表格模型
			model.setRowCount(0); // 清空model
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 指定日期格式
			for (File file : listFiles) {
				String name = file.getName();
				long size = file.length();
				String modifyDate = dateFormat.format(new Date(file.lastModified()));
				model.addRow(new Object[] { name, size, modifyDate });
			}
			table.setModel(model);
		}
	}

	/*
	 * 步骤三：
	 * 更新列表
	 * 显示文件夹中的文件
	 */
	protected void do_extNameField_caretUpdate(CaretEvent e) {
		if (dir == null)
			return;
		// 获取符合条件的文件数组
		File[] files = dir.listFiles();
		// 获取表格的数据模型
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0); // 清空model
		for (File file : files) { // 遍历文件数组
			// 创建表格行数据
			Object[] row = { file.getName(), file.length(), new Date(file.lastModified()) };
			model.addRow(row); // 添加行数据到表格模型
		}
	}
}
