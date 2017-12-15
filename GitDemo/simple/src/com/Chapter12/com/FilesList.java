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
	 * ʵ�ֵ��Ƕ�ȡ�ļ���ָ�����͵��ļ�����ʾ�����ؼ��У���ʾָ�����͵��ļ� 
	 * ˼·������ 
	 * 1.��Ϊ�Ǵ���Ӧ�ã�����ʵ����ͼ��
	 * 2.�Զ�����չ��������
	 * 3.ʵ�ֹ�����
	 * 4.��ʾ�ļ����е��ļ�
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel label;
	private JTextField extNameField;
	private JTable table;
	private File dir;

	/*
	 * ����һ��
	 * ʵ����ͼ��
	 * ��Ҫһ����ť�ؼ�JButton����ѡ���ļ��У� 
	 * ��Ҫһ����ǩ�ؼ�JLabel������ʾѡ���·����
	 * ��Ҫһ����ǩ�ؼ�JLabel��ʾ�û�����ʲô��
	 * ��Ҫһ���ı���ؼ�JTextField���û������ļ����ͣ� 
	 * ��Ҫһ�����ؼ�JTable��ʾѡ��Ŀ¼��ָ�����͵��ļ�
	 */
	public FilesList() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 520, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("��ʾָ�����͵��ļ�");
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

		JButton button = new JButton("ѡ���ļ���");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ѡ���ļ�
				do_button_actionPerformed(e);
			}
		});

		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);

		label = new JLabel("�ļ���·����");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);

		JLabel label_1 = new JLabel("����ָ���ļ���չ���ƣ�");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);

		extNameField = new JTextField();
		extNameField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				// �����б�
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
		// ����Ӧ
		table.getAutoResizeMode(); // getAutoResizeMode(JTable.AUTO_RESIZE_OFF) �Զ���JTable�еĿ��
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "�ļ�����", "�ļ���С", "�޸�����" }) {
			private static final long serialVersionUID = 5274214559103654856L;
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
/*		
 * �Զ���JTable�еĿ��
 * 		table.getColumnModel().getColumn(0).setPreferredWidth();
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(220);*/
		scrollPane.setViewportView(table);
	}

	/**
	 * �Զ�����չ��������
	 * @author
	 */
	public boolean accept(File pathname) {
		// ��ȡ�û����õ�ָ����չ��
		String extName = extNameField.getText();
		if (extName == null || extName.isEmpty())
			return false;
		if (!extName.startsWith("."))// �ж���չ��ǰ׺
			extName = "." + extName;// ������չ��ǰ׺
		extName = extName.toLowerCase();
		// �ж���չ��������ļ����Ƿ����Ҫ��
		if (pathname.getName().toLowerCase().endsWith(extName))
			return true;
		return false;
	}
	
	/**
	 * �������
	 * ѡ���ļ��а�ť���¼�������
	 * ʵ�ֹ�����
	 */
	protected void do_button_actionPerformed(ActionEvent e) {
		final String fileType = extNameField.getText();
		if (fileType.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�������ļ����ͣ�", "", JOptionPane.WARNING_MESSAGE);
			return;
		}
		JFileChooser chooser = new JFileChooser();// �����ļ�ѡ����
		// ����ѡ�����Ĺ�����
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setMultiSelectionEnabled(false); // ��ֹѡ�����ļ���
		// ���ļ�ѡ����
		int result = chooser.showOpenDialog(this);
		// �����������ļ�
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
			DefaultTableModel model = (DefaultTableModel) table.getModel(); // ���Ĭ�ϱ��ģ��
			model.setRowCount(0); // ���model
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // ָ�����ڸ�ʽ
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
	 * ��������
	 * �����б�
	 * ��ʾ�ļ����е��ļ�
	 */
	protected void do_extNameField_caretUpdate(CaretEvent e) {
		if (dir == null)
			return;
		// ��ȡ�����������ļ�����
		File[] files = dir.listFiles();
		// ��ȡ��������ģ��
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0); // ���model
		for (File file : files) { // �����ļ�����
			// �������������
			Object[] row = { file.getName(), file.length(), new Date(file.lastModified()) };
			model.addRow(row); // ��������ݵ����ģ��
		}
	}
}
