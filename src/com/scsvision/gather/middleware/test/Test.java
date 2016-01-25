package com.scsvision.gather.middleware.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

public class Test {
	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// try {
		// // 加载MySql的驱动类
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// } catch (ClassNotFoundException e) {
		// System.out.println("找不到驱动程序类 ，加载驱动失败！");
		// e.printStackTrace();
		// }
		//
		// String url =
		// "jdbc:sqlserver://43.0.202.238:1433;databaseName=HNCJDB";
		// String username = "test1";
		// String password = "1234567";
		// try {
		// Connection con = DriverManager.getConnection(url, username,
		// password);
		// } catch (SQLException se) {
		// System.out.println("数据库连接失败！");
		// se.printStackTrace();
		// }
		// List<String> list = null;
		// for (String s : list) {
		// System.out.print("1");
		// }
		System.out
				.println(sdf.format(new Timestamp(System.currentTimeMillis())));
	}

}
