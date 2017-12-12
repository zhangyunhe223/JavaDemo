package com.Chapter10.com;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = -4595347311922711984L;
	private JTextField textField_3;
	private JTextField textField_1;
	private JComboBox comboBox_1;
	private JTextField textField;
	private JComboBox cityComboBox;
	private JComboBox comboBox;

	/**
	 * Launch the application
	 *
	 * @param args
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// ���ô���ϵͳ���
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//Nimbus���jdk6 update10�汾�Ժ�ĲŻ����

					//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//��ǰϵͳ���

					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");//Motif���������

					//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());//��ƽ̨��Java���
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public MainFrame() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 518, 379);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ȡĬ�ϵ���/��
		String province = (String) getProvince()[0];
		setTitle("����ָ��ʡ/ֱϽ�в�ѯ��Ӧ������");

		final BackgroundPanel backgroundPanel = new BackgroundPanel();
		backgroundPanel.setBounds(0, 0, 510, 380);
		getContentPane().add(backgroundPanel);

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(36, 126, 438, 70);
		backgroundPanel.add(panel);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "��ס��", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
				null, null));
		cityComboBox = new JComboBox();
		cityComboBox.setBounds(245, 25, 124, 27);
		panel.add(cityComboBox);

		cityComboBox.setModel(new DefaultComboBoxModel(getCity(province)));

		comboBox = new JComboBox();
		comboBox.setBounds(25, 25, 124, 27);
		panel.add(comboBox);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent e) { // ѡ��״̬�����¼�
				itemChange();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(getProvince())); // ���ʡ����Ϣ

		final JLabel label = new JLabel();
		label.setText("ʡ/ֱϽ��");
		label.setBounds(155, 30, 66, 18);
		panel.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("��/��");
		label_1.setBounds(375, 30, 37, 18);
		panel.add(label_1);
	}

	/**
	 * ��ȡʡ��ֱϽ�У�������
	 *
	 * @return
	 */
	public Object[] getProvince() {
		Map<String, String[]> map = CityMap.model;// ��ȡʡ����Ϣ���浽Map��
		Set<String> set = map.keySet(); // ��ȡMap�����еļ�������Set���Ϸ���
		Object[] province = set.toArray(); // ת��Ϊ����
		return province; // ���ػ�ȡ��ʡ����Ϣ
	}

	/**
	 * ��ȡָ��ʡ��Ӧ����/��
	 *
	 * @param selectProvince
	 * @return
	 */
	public String[] getCity(String selectProvince) {
		Map<String, String[]> map = CityMap.model; // ��ȡʡ����Ϣ���浽Map��
		String[] arrCity = map.get(selectProvince); // ��ȡָ������ֵ
		return arrCity; // ���ػ�ȡ����/��
	}

	private void itemChange() {
		String selectProvince = (String) comboBox.getSelectedItem();
		cityComboBox.removeAllItems(); // �����/���б�
		String[] arrCity = getCity(selectProvince); // ��ȡ��/��
		cityComboBox.setModel(new DefaultComboBoxModel(arrCity)); // ���������/���б��ֵ
	}

}