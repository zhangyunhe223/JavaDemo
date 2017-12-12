package com.Chapter10.com;


import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class PhoneBook extends JFrame{
	/**
	 * 制作手机电话本
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private Map<String, String> map;
	
	public PhoneBook() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// 对窗体进行监控
				do_this_windowActived(e);
			}
		});
		
		setTitle("手机电话本");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,520,380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		// 窗体中添加
		JScrollPane jScrollPane = new JScrollPane();
		contentPane.add(jScrollPane,BorderLayout.CENTER);
		table = new JTable();
		jScrollPane.setViewportView(table);
	}
	
	// 完成对窗体激活事件进行监听
	protected void do_this_windowActived(WindowEvent e) {
		map = new HashMap<String,String>();
		map.put("按键01", "13883566822");
		map.put("按键02", "13883506824");
		map.put("按键03", "13883566826");
		map.put("按键04", "13883566827");
		map.put("按键05", "13883546828");
		map.put("按键06", "13883576823");
		map.put("按键07", "13883526821");
		map.put("按键08", "13883546824");
		map.put("按键09", "13883546824");
		// 获得表格模型
		DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
		// 设置表头
		defaultTableModel.setColumnIdentifiers(new Object[] {"姓名","手机"});
		// 获得键集合
		Set<String> set = map.keySet();
		// 获得键
		for (String string : set) {
			defaultTableModel.addRow(new Object[] {string,map.get(string)});
		}
		table.setModel(defaultTableModel);
		/*Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			defaultTableModel.addRow(new Object[] {name,map.get(name)});
		}
		table.setModel(defaultTableModel);*/
	}
}
