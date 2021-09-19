package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	public int currentCustomerId;

	
	public int create (Customer customer) throws SQLException {
			System.out.println("Create Customer ");
			try (Connection connection = Util.getConnection()) {
				String sql = "insert into customer (FirstName, LastName, Email, Password) values (?, ?, ?, ?)";
				PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				statement.setString(1, customer.getFirstName());
				statement.setString(2, customer.getLastName());
				statement.setString(3, customer.getEmail());
				statement.setString(4, customer.getPassword());
				statement.executeUpdate();
				
				ResultSet rs = statement.getGeneratedKeys();
				if (rs.next()) {
					return rs.getInt(1);
				}
				return 0;
			}
				
	}
		public Customer getCustomerEmail(String Email) throws SQLException {
			Customer customer = null;
			
			try (Connection connection = Util.getConnection()){
				String sql = "select * from customer where Email = ?";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1,  Email);
				ResultSet resultSet = statement.executeQuery();
				while (resultSet.next()) {
					currentCustomerId = resultSet.getInt("id");
					String FirstName = resultSet.getString("FirstName");
					String LastName = resultSet.getString("LastName");
					String email = resultSet.getString("Email");
					String password = resultSet.getString("password");
					
					customer = new Customer(FirstName, LastName ,email, password);
				}
			}
			return customer;
			
		}
	}

