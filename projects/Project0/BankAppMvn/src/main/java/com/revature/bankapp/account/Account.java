package com.revature.bankapp.account;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.TransactionDaoImpl;

public class Account {
	protected String accountNumber;
	protected double balance;
	protected int CustomerId;
	
	TransactionDaoImpl tdao = new TransactionDaoImpl();

	

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;

	}
	public double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Transaction Canont be Implied");}
		else if (balance >= amount) {
			balance-=amount;
			System.out.println("Transaction Successful");
			try {
				tdao.insert(new Transactions('w',amount));
				tdao.update(this);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			return balance;
	}
	
	public double deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Transaction Canont be Implied");}
		else if (balance >= amount) {
			balance+=amount;
			System.out.println("Transaction Successful");
			try {
				tdao.insert(new Transactions('d',amount));
				tdao.update(this);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			return balance;
	}
			
		
		
	
	public Account() {
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void transfer(double amount) {
		balance += amount;
		try {
			AccountDaoImpl.insertTransfer(new Transactions('C', amount));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			AccountDaoImpl.updateTransfer(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	}
