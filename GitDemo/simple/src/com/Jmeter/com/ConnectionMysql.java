package com.Jmeter.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionMysql {
	/**
	 * 连接数据步骤：
	 * 1.加载数据库驱动
	 * 2.声明数据库地址的url
	 * 3.数据库的用户名、数据库的密码
	 * 4.建立数据库连接，获得连接对象conn(抛出异常即可)
	 * @param args
	 */
	
	public static void main(String[] args) {
		Connection connection;
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载数据库驱动
			System.out.println("加载数据库驱动成功");
			String url = "jdbc:mysql://deal.cosori.com:3306/cosori";// 声明数据库地址的url
			String user = "cosori";// 数据库的用户名
			String password = "cosori@EC#1221";// 数据库的密码
			// 建立数据库连接，获得连接对象conn(抛出异常即可)
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("连接数据库成功");
			// 生成一条mysql语句
			String sql = "INSERT INTO cutprice (`email`,`cutNum`,`status`,`confirmCode`,created_at,updated_at) VALUE ";
			// 向数据库中插入n条数据
			for (int i = 1; i <= 1; i++) {
				// 'zhangyunhe3@qq.com',3,2,34324234324,'2017-10-07 01:29:21','2017-11-07 01:29:21'
				sql = sql
						+ "('zhangyunhe3@qq.com',3,2,34324234324,'2017-10-07 01:29:21','2017-11-07 01:29:21'),";
			}
			sql = sql.substring(0, sql.length() - 1);

			Statement stmt = connection.createStatement();// 创建一个Statement对象
			stmt.executeUpdate(sql);// 执行sql语句
			System.out.println("插入到数据库成功");
			connection.close();
			System.out.println("关闭数据库成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
