package com.Jmeter.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionMysql {
	/**
	 * �������ݲ��裺
	 * 1.�������ݿ�����
	 * 2.�������ݿ��ַ��url
	 * 3.���ݿ���û��������ݿ������
	 * 4.�������ݿ����ӣ�������Ӷ���conn(�׳��쳣����)
	 * @param args
	 */
	
	public static void main(String[] args) {
		Connection connection;
		try {
			Class.forName("com.mysql.jdbc.Driver");// �������ݿ�����
			System.out.println("�������ݿ������ɹ�");
			String url = "jdbc:mysql://deal.cosori.com:3306/cosori";// �������ݿ��ַ��url
			String user = "cosori";// ���ݿ���û���
			String password = "cosori@EC#1221";// ���ݿ������
			// �������ݿ����ӣ�������Ӷ���conn(�׳��쳣����)
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("�������ݿ�ɹ�");
			// ����һ��mysql���
			String sql = "INSERT INTO cutprice (`email`,`cutNum`,`status`,`confirmCode`,created_at,updated_at) VALUE ";
			// �����ݿ��в���n������
			for (int i = 1; i <= 1; i++) {
				// 'zhangyunhe3@qq.com',3,2,34324234324,'2017-10-07 01:29:21','2017-11-07 01:29:21'
				sql = sql
						+ "('zhangyunhe3@qq.com',3,2,34324234324,'2017-10-07 01:29:21','2017-11-07 01:29:21'),";
			}
			sql = sql.substring(0, sql.length() - 1);

			Statement stmt = connection.createStatement();// ����һ��Statement����
			stmt.executeUpdate(sql);// ִ��sql���
			System.out.println("���뵽���ݿ�ɹ�");
			connection.close();
			System.out.println("�ر����ݿ�ɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
