package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Transactions;
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
				String phoneno = resultSet.getString("Phoneno");

				customer = new Customer(FirstName, LastName, email, password,phoneno);
			}
		}
		return customer;

	}

	public static List eViewAccount(int id) throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where customerid= ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account accountTemp = new Account();
				accountTemp.setId(resultSet.getInt("id"));
				accountTemp.setAccountNumber(resultSet.getString("accountno"));
				accountTemp.setBalance(resultSet.getDouble("balance"));

				accountList.add(accountTemp);

			}
		}
		return accountList;
	}

	public static List<Transactions> eViewTransaction() throws SQLException {
		List<Transactions> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.id, c.FirstName, c.LastName, c.Email,a.accountno, a.balance, t.type , t.amount \r\n"
					+ "from transaction t\r\n" + "inner join account a \r\n" + "on accountId = a.id \r\n"
					+ "inner join customer c\r\n" + " on customerid = c.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transactions transactionTemp = new Transactions();
				transactionTemp.setCustomerId(resultSet.getInt("id"));
				transactionTemp.setFirstName(resultSet.getString("FirstName"));
				transactionTemp.setLastName(resultSet.getString("LastName"));
				transactionTemp.setAccountNumber(resultSet.getString("accountno"));
				transactionTemp.setBalance(resultSet.getDouble("balance"));
				transactionTemp.setType(resultSet.getString("type").charAt(0));
				transactionTemp.setAmount(resultSet.getDouble("amount"));
				transactionList.add(transactionTemp);

			}
		}
		return transactionList;

	}
}
