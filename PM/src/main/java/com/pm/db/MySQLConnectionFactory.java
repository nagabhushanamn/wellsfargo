package com.pm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/pm";
		String user = "root";
		String password = "root";

		return DriverManager.getConnection(url, user, password);

	}

}
