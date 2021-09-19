package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemoPrepared {

	public static void main(String[] args) {
		try {
			// Driver driver = new Driver();
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb", "root",
					"arshat123");
			System.out.println("Connection Successful");
			String sql = " insert into department (name) values (?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,"Research");
			statement.executeUpdate();
			
			statement.setString(1,"Statistics");
			statement.executeUpdate();

			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}

