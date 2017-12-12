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
	 * 制作电子词典
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
				// 对窗体进行监控
				do_this_windowActivated(e);
			}
		});
		
		// 使用构造方法实现Frame
		setTitle("制作电子词典");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,520,380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5 , 5 , 5 , 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		// 要查询的列表框
		JPanel jPanel = new JPanel();
		contentPane.add(jPanel,BorderLayout.NORTH);
		JLabel jLabel = new JLabel("请输入要查询的单词：");
		jPanel.add(jLabel);
		field = new TextField();
		jPanel.add(field);
		field.setColumns(10);
		
		// 点击查询
		JPanel jPanel2 = new JPanel();
		contentPane.add(jPanel2,BorderLayout.SOUTH);
		JButton button = new JButton("查询");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 点击事件
				do_button_actionPerformed(e);
			}
		});
		jPanel.add(button);
		
		// 翻译结果
		JScrollPane jScrollPane = new JScrollPane();
		contentPane.add(jScrollPane,BorderLayout.CENTER);
		
		area = new JTextArea();
		area.setEditable(false);
		jScrollPane.setViewportView(area);
	}

	// 完成窗体激活事件监听
	protected void do_this_windowActivated(WindowEvent e){
		map = new HashMap<String, String>();
		map.put("apple", "苹果");
		map.put("banana", "香蕉");
		map.put("strawberry", "草莓");
		map.put("orange", "橘子");
		map.put("苹果", "apple");
	}
	
	// 响应点击事件
	protected void do_button_actionPerformed(ActionEvent e) {
		// 获得用户输入的单词
		String text = field.getText();
		// 如果用户输入为空，则提示用户
		if (text.isEmpty()) {
			JOptionPane.showMessageDialog(this, "请输入要查询的单词！",null,JOptionPane.WARNING_MESSAGE);
			return;
		}
		String meaning = map.get(text);
		if (meaning == null) {
			JOptionPane.showMessageDialog(this, "要查询的单词不存在",null,JOptionPane.WARNING_MESSAGE);
			return;
		} else {
			area.setText(meaning);
		}
	}
}