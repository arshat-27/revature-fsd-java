package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.account.Transactions;
import com.revature.bankapp.dao.TransactionDao;
import com.revature.bankapp.dao.Util;

public class TransactionDaoImpl implements TransactionDao {
	AccountDaoImpl accdao = new AccountDaoImpl();

	public void insert(Transactions transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, accountid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, accdao.currentAccountId);
			statement.executeUpdate();

		}

	}

	public void update(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, accdao.currentAccountId);
			statement.executeUpdate();
		}

	}
}
