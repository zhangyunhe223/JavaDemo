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
	 * �ö�̬���鱣��ѧ����Ϣ
	 */
	private static final long serialVersionUID = 1L; 
	
	private JTextField textField; // �����������ı��� 
	private List<String> arraylist = new ArrayList<String>(); // �洢���������ļ��� 
	private JList<String> list; 
	
	/*
	 * ʹ�ù��췽��ʵ��Frame
	 */
	public DynamicArray() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 520, 380); // ���ñ߽��С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�ö�̬���鱣��ѧ������"); // ���ô������
		
		// ���ñ������
		final BackgroundPanel backgroundPanel = new BackgroundPanel();
		backgroundPanel.setBounds(0,0,510,380); // ���ñ߽�
		getContentPane().add(backgroundPanel); // �����������ӵ��������
		
		// ���һ���������
		JScrollPane scrollPane = new JScrollPane();
		backgroundPanel.add(scrollPane,BorderLayout.CENTER);
		scrollPane.setBounds(10,10,300,280); // ���ô�С
		
		list = new JList<>(); // ����һ���б�ؼ�
		scrollPane.setViewportView(list); // ����һ���ӿڣ�����б�Ҫ������������ͼ
		
		final JPanel panel = new JPanel();  
        scrollPane.setColumnHeaderView(panel); 
        
        final JLabel label  = new JLabel("ѧ��������");
        panel.add(label);
        
        textField = new JTextField();
        textField.setColumns(10);
        panel.add(textField);
        
        final JButton button1 = new JButton();  
        button1.setBounds(350, 30, 100, 30);  
        button1.setText("���ѧ��");  
        button1.addActionListener(new ActionListener(){//����¼�����  
            public void actionPerformed(ActionEvent e){  
                do_button1_actionPerformed(e);//���ø÷���  
            }  
        });  
        backgroundPanel.add(button1); 
        
        final JButton button2 = new JButton();  
        button2.setBounds(350, 100, 100, 30);  
        backgroundPanel.add(button2);  
        button2.setText("ɾ��ѧ��");  
        button2.addActionListener(new ActionListener(){//����¼�����  
            public void actionPerformed(ActionEvent e){  
                do_button2_actionPerformed(e);  
            }  
        });       
	}
	protected void do_button1_actionPerformed(ActionEvent e){  //������ѧ����ť����  
        textField.requestFocusInWindow(); //��ô����´���Ľ��㣬������Ϊ���������  
        textField.selectAll();  //ѡ���ı���׼���´�����  
        String text = textField.getText();//����ı������������  
        if(text.isEmpty()){  
            return;  
        }
        
        // ͨ��ListIterator��������
		ListIterator<String> iterator2 = arraylist.listIterator();       
		iterator2.add(text);  //�����ݼӵ����鼯�� 
		
        repalceModel();   //�����鼯�ϵ�������ʾ�������б�ؼ���  
    }  
      
    protected void do_button2_actionPerformed(ActionEvent e){  
        Object value = list.getSelectedValue(); //��ȡ�б�ؼ���ѡ����  
        arraylist.remove(value); //�����鼯����ɾ����ѡ����  
        repalceModel(); //�����鼯�ϵ�������ʾ�������б�ؼ���  
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })  
    private void repalceModel(){  
        // Ϊ�б�ؼ���������ģ����ʾ���鼯���е�����  
        list.setModel(new AbstractListModel(){  
              
            private static final long serialVersionUID = -3406879889366471211L;  
            @Override  
            public int getSize(){//��ȡ�����С  
                return arraylist.size();  
            }  
            @Override  
            public Object getElementAt(int index){//��ȡָ������Ԫ��  
                return arraylist.get(index);  
            }  
        });  
    } 
}