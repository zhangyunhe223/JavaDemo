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
	 * �����滻�ı��ļ����� 
	 * ˼·������
	 * 1.����ʵ����ͼ�� 
	 * 2.ѡ���ļ���ť�¼�������
	 * 3.�滻��ť���¼�������
	 * 4.���ļ���ť���¼�������
	 */
	private JPanel contentPane;
	private JLabel label_1,label_2;
	private JButton button1, button2;
	private JTextField fileField;
	private JTextField searchTextField, replaceTextField;
	private File file;

	/*
	 * ����һ�� 
	 * ʵ����ͼ�� 
	 * ��Ҫһ����ť�ؼ�JButton����ѡ���ļ��� 
	 * ��Ҫһ����ǩ�ؼ�JLable������ʾѡ���·����
	 * ��Ҫһ����ǩ�ؼ�JLable��ʾ�û������ı��� 
	 * ��Ҫһ����ǩ�ؼ�JLable��ʾ�û��滻ʲô��
	 * ��Ҫһ���ı���ؼ�JTextField���û����������ı����ݣ� 
	 * ��Ҫһ���ı���ؼ�JTextField���û������滻�ı����ݣ�
	 * ��Ҫһ����ť�ؼ�JButton�����滻
	 */
	public ReplaceFileText() {
		getContentPane().setLayout(null);
		setTitle("�����滻�ı��ļ�����");
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

		JButton button = new JButton("ѡ���ļ�");
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

		label_1 = new JLabel("Ҫ�滻�����ݣ�");
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

		label_2 = new JLabel("�滻�����ݣ�");
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

		button1 = new JButton("�滻");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 do_replaceButton_actionPerformed(e);
			}
		});
		panel_1.add(button1);

		button2 = new JButton("���ļ�");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 do_button_2_actionPerformed(e);
			}
		});
		panel_1.add(button2);
	}

	/**
	 * ѡ���ļ���ť�¼�������
	 * @param e
	 */
	protected void do_button_actionPerformed(ActionEvent e) {  
        JFileChooser chooser = new JFileChooser("./");// �����ļ�ѡ����  
        // �����ļ���չ��������  
        chooser.setFileFilter(new FileNameExtensionFilter("�ı��ļ�", "txt",  
                "java", "php", "html", "htm"));  
        // �����ļ�ѡ��ģʽ  
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  
        // ��ʾ�ļ��򿪶Ի���  
        int option = chooser.showOpenDialog(this);  
        // ȷ���û����´򿪰�ť������ȡ����ť  
        if (option != JFileChooser.APPROVE_OPTION)  
            return;  
        // ��ȡ�û�ѡ����ļ�����  
        file = chooser.getSelectedFile();  
        // ��ʾ�ļ���Ϣ���ı���  
        fileField.setText(file.toString());  
    }
	
	/**
	 * �滻��ť���¼�������
	 * @param event
	 */
	protected void do_replaceButton_actionPerformed(ActionEvent event) {  
        String searchText = searchTextField.getText();// ��ȡ�����ı�  
        String replaceText = replaceTextField.getText();// ��ȡ�滻�ı�  
        if (file == null) { 
        	JOptionPane.showMessageDialog(null, "��ѡ���ļ�!");  
        } else if (searchText.isEmpty()){
        	JOptionPane.showMessageDialog(null, "δ������������!");
		} else if (replaceText.isEmpty()) {
			JOptionPane.showMessageDialog(null, "δ�����滻���ݣ�"); 
		} else if(file.exists() && file.length() == 0){
			JOptionPane.showMessageDialog(null, "�ļ�����Ϊ�գ�");
		} else {
			try {
				FileReader fis = new FileReader(file);// �����ļ�������  
				char[] data = new char[1024];// ���������ַ�����  
				int rn = 0;  
				StringBuilder sb = new StringBuilder();// �����ַ���������  
				while ((rn = fis.read(data)) > 0) {// ��ȡ�ļ����ݵ��ַ���������  
					String str = String.valueOf(data, 0, rn);  
					sb.append(str);  
				}  
				fis.close();// �ر�������  
				// �ӹ������������ַ��������滻�����ı�  
				String str = sb.toString().replace(searchText, replaceText);  
				FileWriter fout = new FileWriter(file);// �����ļ������  
				fout.write(str.toCharArray());// ���滻��ɵ��ַ���д���ļ���  
				fout.close();// �ر������  
			} catch (FileNotFoundException e) {  
				e.printStackTrace();  
			} catch (IOException e) {  
				e.printStackTrace();  
			}
			JOptionPane.showMessageDialog(null, "�滻�ɹ���"); 
			
		}
    }
	
	/**
	 * ���ļ���ť���¼�������
	 * @param e
	 */
	protected void do_button_2_actionPerformed(ActionEvent e) {  
        try {  
            if (file == null) {
            	JOptionPane.showMessageDialog(null, "��ѡ���ļ���"); 
            } else {            	
            	Desktop.getDesktop().edit(file);  
            }
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
    }
}
