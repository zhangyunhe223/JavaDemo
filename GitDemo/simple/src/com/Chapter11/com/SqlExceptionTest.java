package com.Chapter11.com;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class SqlExceptionTest {
	/**
	 * 范例二：
	 * 数据库操作异常
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1.数据库地址URL
		 * 2.添加数据驱动
		 * 3.数据库名字
		 * 4.插入数据
		 * 5.关闭数据
		 */
		String URL = "jdbc:mysql://deal.cosori.com:3306/cosori";
		String DEIVER = "com.mysql.jdbc.Driver";
		String USERNAME = "cosori";
		String PASSWORD = "cosori@EC#1221";
		Connection connection = null;
		
			// 加载jdbc驱动
			try {
				Class.forName(DEIVER);
				// 建立连接
				connection = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
				System.out.println("连接数据库成功!");
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
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("找不到类异常！");
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("sql语句异常");
			} finally {
				try {
					connection.close();
					System.out.println("释放资源成功！");
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("释放资源失败！");
				}
			}
	}

}
