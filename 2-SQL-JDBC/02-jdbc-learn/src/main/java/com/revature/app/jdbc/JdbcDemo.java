package com.revature.app.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			// Driver driver = new Driver();
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb", "root",
					"arshat123");
			System.out.println(connection.getClass().getName());
			System.out.println("Connection Successful");
			String sql = " insert into department (name) values ('Innovation')";

			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);

			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
