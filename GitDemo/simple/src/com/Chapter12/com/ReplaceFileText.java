package com.Chapter12.com;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ReplaceFileText extends JFrame {
	/**
	 * 查找替换文本文件内容 
	 * 思路分析：
	 * 1.首先实现视图层 
	 * 2.选择文件按钮事件处理方法
	 * 3.替换按钮的事件处理方法
	 * 4.打开文件按钮的事件处理方法
	 */
	private JPanel contentPane;
	private JLabel label_1,label_2;
	private JButton button1, button2;
	private JTextField fileField;
	private JTextField searchTextField, replaceTextField;
	private File file;

	/*
	 * 步骤一： 
	 * 实现视图层 
	 * 需要一个按钮控件JButton用来选择文件； 
	 * 需要一个标签控件JLable用来显示选择的路径；
	 * 需要一个标签控件JLable提示用户搜索文本； 
	 * 需要一个标签控件JLable提示用户替换什么；
	 * 需要一个文本框控件JTextField供用户输入搜索文本内容； 
	 * 需要一个文本框控件JTextField供用户输入替换文本内容；
	 * 需要一个按钮控件JButton用来替换
	 */
	public ReplaceFileText() {
		getContentPane().setLayout(null);
		setTitle("查找替换文本文件内容");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 91));
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 81, 0, 0, 66, 0 };
		gbl_panel.rowHeights = new int[] { 23, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton button = new JButton("选择文件");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 do_button_actionPerformed(e);
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTHWEST;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);

		fileField = new JTextField();
		fileField.setEditable(false);
		GridBagConstraints gbc_fileField = new GridBagConstraints();
		gbc_fileField.gridwidth = 3;
		gbc_fileField.insets = new Insets(0, 0, 5, 0);
		gbc_fileField.fill = GridBagConstraints.HORIZONTAL;
		gbc_fileField.gridx = 1;
		gbc_fileField.gridy = 0;
		panel.add(fileField, gbc_fileField);
		fileField.setColumns(10);

		label_1 = new JLabel("要替换的内容：");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel.add(label_1, gbc_label);

		searchTextField = new JTextField();
		GridBagConstraints gbc_searchTextField = new GridBagConstraints();
		gbc_searchTextField.gridwidth = 3;
		gbc_searchTextField.insets = new Insets(0, 0, 5, 0);
		gbc_searchTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchTextField.gridx = 1;
		gbc_searchTextField.gridy = 1;
		panel.add(searchTextField, gbc_searchTextField);
		searchTextField.setColumns(10);

		label_2 = new JLabel("替换的内容：");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		panel.add(label_2, gbc_label_1);

		replaceTextField = new JTextField();
		GridBagConstraints gbc_replaceTextField = new GridBagConstraints();
		gbc_replaceTextField.gridwidth = 3;
		gbc_replaceTextField.insets = new Insets(0, 0, 5, 0);
		gbc_replaceTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_replaceTextField.gridx = 1;
		gbc_replaceTextField.gridy = 2;
		panel.add(replaceTextField, gbc_replaceTextField);
		replaceTextField.setColumns(10);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);

		button1 = new JButton("替换");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 do_replaceButton_actionPerformed(e);
			}
		});
		panel_1.add(button1);

		button2 = new JButton("打开文件");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 do_button_2_actionPerformed(e);
			}
		});
		panel_1.add(button2);
	}

	/**
	 * 选择文件按钮事件处理方法
	 * @param e
	 */
	protected void do_button_actionPerformed(ActionEvent e) {  
        JFileChooser chooser = new JFileChooser("./");// 创建文件选择器  
        // 设置文件扩展名过滤器  
        chooser.setFileFilter(new FileNameExtensionFilter("文本文件", "txt",  
                "java", "php", "html", "htm"));  
        // 设置文件选择模式  
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  
        // 显示文件打开对话框  
        int option = chooser.showOpenDialog(this);  
        // 确定用户按下打开按钮，而非取消按钮  
        if (option != JFileChooser.APPROVE_OPTION)  
            return;  
        // 获取用户选择的文件对象  
        file = chooser.getSelectedFile();  
        // 显示文件信息到文本框  
        fileField.setText(file.toString());  
    }
	
	/**
	 * 替换按钮的事件处理方法
	 * @param event
	 */
	protected void do_replaceButton_actionPerformed(ActionEvent event) {  
        String searchText = searchTextField.getText();// 获取搜索文本  
        String replaceText = replaceTextField.getText();// 获取替换文本  
        if (file == null) { 
        	JOptionPane.showMessageDialog(null, "请选择文件!");  
        } else if (searchText.isEmpty()){
        	JOptionPane.showMessageDialog(null, "未输入搜索内容!");
		} else if (replaceText.isEmpty()) {
			JOptionPane.showMessageDialog(null, "未输入替换内容！"); 
		} else if(file.exists() && file.length() == 0){
			JOptionPane.showMessageDialog(null, "文件内容为空！");
		} else {
			try {
				FileReader fis = new FileReader(file);// 创建文件输入流  
				char[] data = new char[1024];// 创建缓冲字符数组  
				int rn = 0;  
				StringBuilder sb = new StringBuilder();// 创建字符串构建器  
				while ((rn = fis.read(data)) > 0) {// 读取文件内容到字符串构建器  
					String str = String.valueOf(data, 0, rn);  
					sb.append(str);  
				}  
				fis.close();// 关闭输入流  
				// 从构建器中生成字符串，并替换搜索文本  
				String str = sb.toString().replace(searchText, replaceText);  
				FileWriter fout = new FileWriter(file);// 创建文件输出流  
				fout.write(str.toCharArray());// 把替换完成的字符串写入文件内  
				fout.close();// 关闭输出流  
			} catch (FileNotFoundException e) {  
				e.printStackTrace();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}
			JOptionPane.showMessageDialog(null, "替换成功！"); 
			
		}
    }
	
	/**
	 * 打开文件按钮的事件处理方法
	 * @param e
	 */
	protected void do_button_2_actionPerformed(ActionEvent e) {  
        try {  
            if (file == null) {
            	JOptionPane.showMessageDialog(null, "请选择文件！"); 
            } else {            	
            	Desktop.getDesktop().edit(file);  
            }
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
    }
}
