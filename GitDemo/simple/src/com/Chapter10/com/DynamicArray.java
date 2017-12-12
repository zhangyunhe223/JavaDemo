package com.Chapter10.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class DynamicArray extends JFrame{
	/**
	 * 用动态数组保存学生信息
	 */
	private static final long serialVersionUID = 1L; 
	
	private JTextField textField; // 输入姓名的文本框 
	private List<String> arraylist = new ArrayList<String>(); // 存储输入姓名的集合 
	private JList<String> list; 
	
	/*
	 * 使用构造方法实现Frame
	 */
	public DynamicArray() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 520, 380); // 设置边界大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("用动态数组保存学生姓名"); // 设置窗体框名
		
		// 设置背景组件
		final BackgroundPanel backgroundPanel = new BackgroundPanel();
		backgroundPanel.setBounds(0,0,510,380); // 设置边界
		getContentPane().add(backgroundPanel); // 将背景组件添加到总组件中
		
		// 添加一个滚动组件
		JScrollPane scrollPane = new JScrollPane();
		backgroundPanel.add(scrollPane,BorderLayout.CENTER);
		scrollPane.setBounds(10,10,300,280); // 设置大小
		
		list = new JList<>(); // 创建一个列表控件
		scrollPane.setViewportView(list); // 创建一个视口（如果有必要）并设置其视图
		
		final JPanel panel = new JPanel();  
        scrollPane.setColumnHeaderView(panel); 
        
        final JLabel label  = new JLabel("学生姓名：");
        panel.add(label);
        
        textField = new JTextField();
        textField.setColumns(10);
        panel.add(textField);
        
        final JButton button1 = new JButton();  
        button1.setBounds(350, 30, 100, 30);  
        button1.setText("添加学生");  
        button1.addActionListener(new ActionListener(){//添加事件监听  
            public void actionPerformed(ActionEvent e){  
                do_button1_actionPerformed(e);//调用该方法  
            }  
        });  
        backgroundPanel.add(button1); 
        
        final JButton button2 = new JButton();  
        button2.setBounds(350, 100, 100, 30);  
        backgroundPanel.add(button2);  
        button2.setText("删除学生");  
        button2.addActionListener(new ActionListener(){//添加事件监听  
            public void actionPerformed(ActionEvent e){  
                do_button2_actionPerformed(e);  
            }  
        });       
	}
	protected void do_button1_actionPerformed(ActionEvent e){  //点击添加学生按钮函数  
        textField.requestFocusInWindow(); //获得创建新窗体的焦点，焦点设为姓名输入框  
        textField.selectAll();  //选择文本框，准备下次输入  
        String text = textField.getText();//获得文本框输入的内容  
        if(text.isEmpty()){  
            return;  
        }
        
        // 通过ListIterator倒叙排列
		ListIterator<String> iterator2 = arraylist.listIterator();       
		iterator2.add(text);  //将内容加到数组集合 
		
        repalceModel();   //把数组集合的内容显示到界面列表控件中  
    }  
      
    protected void do_button2_actionPerformed(ActionEvent e){  
        Object value = list.getSelectedValue(); //获取列表控件的选择项  
        arraylist.remove(value); //从数组集合中删除该选择项  
        repalceModel(); //把数组集合的内容显示到界面列表控件中  
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })  
    private void repalceModel(){  
        // 为列表控件设置数据模型显示数组集合中的数据  
        list.setModel(new AbstractListModel(){  
              
            private static final long serialVersionUID = -3406879889366471211L;  
            @Override  
            public int getSize(){//获取数组大小  
                return arraylist.size();  
            }  
            @Override  
            public Object getElementAt(int index){//获取指定索引元素  
                return arraylist.get(index);  
            }  
        });  
    } 
}