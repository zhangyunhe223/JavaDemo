package com.Chapter11.com;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class SqlExceptionTest {
	/**
	 * ��������
	 * ���ݿ�����쳣
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1.���ݿ��ַURL
		 * 2.�����������
		 * 3.���ݿ�����
		 * 4.��������
		 * 5.�ر�����
		 */
		String URL = "jdbc:mysql://deal.cosori.com:3306/cosori";
		String DEIVER = "com.mysql.jdbc.Driver";
		String USERNAME = "cosori";
		String PASSWORD = "cosori@EC#1221";
		Connection connection = null;
		
			// ����jdbc����
			try {
				Class.forName(DEIVER);
				// ��������
				connection = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
				System.out.println("�������ݿ�ɹ�!");
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
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�Ҳ������쳣��");
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("sql����쳣");
			} finally {
				try {
					connection.close();
					System.out.println("�ͷ���Դ�ɹ���");
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("�ͷ���Դʧ�ܣ�");
				}
			}
	}

}
