package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.account.Account;

public class DataManager {
	private static List<Customer> customerList = new ArrayList<>();
	private static List<Account> accountList = new ArrayList<>();
	
	static {
		customerList.add(new Customer("John", "Smith", "john", "123"));
	}

	public static void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	public static void addAccount(Account account) {
		accountList.add(account);
	}
	
	public static Customer getCustomerByEmail(String email) {
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(email)) {
				return customer;
			}
		}
		return null;
	}
}
