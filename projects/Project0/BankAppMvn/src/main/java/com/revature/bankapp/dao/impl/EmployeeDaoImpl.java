package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.dao.EmployeeDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public Employee getEmployeeUserName(String userName) throws SQLException {
		Employee employee = null;

		try (Connection connection = Util.getConnection()) {
			String sql = "select * from employee where Username = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userName);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("Name");
				String username = resultSet.getString("UserName");
				String password = resultSet.getString("Password");

				employee = new Employee(name, username, password);
			}
		}
		return employee;
	}

	public Customer getCustomerName(String Email) throws SQLException {
		Customer customer = null;

		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer where Email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, Email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				//currentCustomerId = resultSet.getInt("id");
				String FirstName = resultSet.getString("FirstName");
				String LastName = resultSet.getString("LastName");
				String email = resultSet.getString("Email");
				String password = resultSet.getString("password");

				customer = new Customer(FirstName, LastName, email, password);
			}
		}
		return customer;

	}
}
