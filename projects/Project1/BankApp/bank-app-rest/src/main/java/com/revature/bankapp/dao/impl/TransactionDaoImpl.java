package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Transactions;
import com.revature.bankapp.dao.TransactionDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;

public class TransactionDaoImpl implements TransactionDao {
	

	public void insert(Transactions transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, accountid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, AccountDaoImpl.currentAccountId);
			statement.executeUpdate();

		}

	}

	public void update(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, AccountDaoImpl.currentAccountId);
			statement.executeUpdate();
		}

	}

	public static List<Transactions> transactionList() throws SQLException {
		List<Transactions> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from transaction where accountid = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, AccountDaoImpl.currentAccountId);
			
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transactions t = new Transactions();
				t.setType(resultSet.getString("type").charAt(0));
				t.setAmount(resultSet.getDouble("amount"));
				t.setAccountId(resultSet.getInt("accountId"));
				transactionList.add(t);
				

			}
		}

		return transactionList;
	}

	public long showBalance(long accountId) throws AppException {
		long balanceReturned = 0;
		try (Connection connection = Util.getConnection()) {

			String sql = "select balance from account where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,(int)accountId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				balanceReturned = (long) rs.getInt("balance");
			}

		}
		catch (SQLException e) {
//			LOGGER.error("Getting Customer Details",e);
			throw new AppException(e);
		}
		return balanceReturned;

	}
	
}