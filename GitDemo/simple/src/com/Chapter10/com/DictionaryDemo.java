package com.Chapter10.com;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class DictionaryDemo extends JFrame{
	/**
	 * �������Ӵʵ�
	 */
	private static final long serialVersionUID = 1L; 
	private static TextField field;
	private static Map<String, String> map;
	private static JTextArea area;
	private JPanel contentPane;
	
	public DictionaryDemo() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// �Դ�����м��
				do_this_windowActivated(e);
			}
		});
		
		// ʹ�ù��췽��ʵ��Frame
		setTitle("�������Ӵʵ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,520,380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5 , 5 , 5 , 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		// Ҫ��ѯ���б��
		JPanel jPanel = new JPanel();
		contentPane.add(jPanel,BorderLayout.NORTH);
		JLabel jLabel = new JLabel("������Ҫ��ѯ�ĵ��ʣ�");
		jPanel.add(jLabel);
		field = new TextField();
		jPanel.add(field);
		field.setColumns(10);
		
		// �����ѯ
		JPanel jPanel2 = new JPanel();
		contentPane.add(jPanel2,BorderLayout.SOUTH);
		JButton button = new JButton("��ѯ");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����¼�
				do_button_actionPerformed(e);
			}
		});
		jPanel.add(button);
		
		// ������
		JScrollPane jScrollPane = new JScrollPane();
		contentPane.add(jScrollPane,BorderLayout.CENTER);
		
		area = new JTextArea();
		area.setEditable(false);
		jScrollPane.setViewportView(area);
	}

	// ��ɴ��弤���¼�����
	protected void do_this_windowActivated(WindowEvent e){
		map = new HashMap<String, String>();
		map.put("apple", "ƻ��");
		map.put("banana", "�㽶");
		map.put("strawberry", "��ݮ");
		map.put("orange", "����");
		map.put("ƻ��", "apple");
	}
	
	// ��Ӧ����¼�
	protected void do_button_actionPerformed(ActionEvent e) {
		// ����û�����ĵ���
		String text = field.getText();
		// ����û�����Ϊ�գ�����ʾ�û�
		if (text.isEmpty()) {
			JOptionPane.showMessageDialog(this, "������Ҫ��ѯ�ĵ��ʣ�",null,JOptionPane.WARNING_MESSAGE);
			return;
		}
		String meaning = map.get(text);
		if (meaning == null) {
			JOptionPane.showMessageDialog(this, "Ҫ��ѯ�ĵ��ʲ�����",null,JOptionPane.WARNING_MESSAGE);
			return;
		} else {
			area.setText(meaning);
		}
	}
}