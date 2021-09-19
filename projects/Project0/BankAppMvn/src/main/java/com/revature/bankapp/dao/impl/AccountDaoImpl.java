package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.menu.TransactionMenu;
import com.revature.bankapp.model.Customer;

public class AccountDaoImpl implements AccountDao {
	CustomerDaoImpl customerdaoimpl = new CustomerDaoImpl();
	public static int currentAccountId;
	public static int transferAccountId;

	@Override
	public int create(Account account) throws SQLException {
		System.out.println("Create Account ");
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into account (accountno,balance,customerid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, account.getAccountNumber());
			statement.setDouble(2, account.getBalance());
			statement.setInt(3,customerdaoimpl.currentCustomerId);
			statement.executeUpdate();

			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		}
	}

	public List<Account> accountList() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where customerid = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, customerdaoimpl.currentCustomerId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setAccountNumber(resultSet.getString("accountno"));
				account.setBalance(resultSet.getDouble("balance"));
				accountList.add(account);

			}
		}

		return accountList;

	}
	
	TransactionMenu tmenu = new TransactionMenu("Transaction Menu");
	public Account currentAccount() throws SQLException {
		Account account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where accountno = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, tmenu.accNumber);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				currentAccountId = resultSet.getInt("id");
				String accNumber = resultSet.getString("accountno");
				Double balance = resultSet.getDouble("balance");

				account = new Account(accNumber, balance);
			}
		}
		return account;
	}
}