package com.revature.bankapp.account;

public class Account {
		protected static String accountNumber;
		protected double balance;
		
		public Account(String accountNumber,double balance) {
			this.accountNumber = accountNumber;
			this.balance = balance;
			
		}
		public static String getAccountNumber() {
			return accountNumber;
		}
		public double getBalance() {
			return balance;
		}
		
}
