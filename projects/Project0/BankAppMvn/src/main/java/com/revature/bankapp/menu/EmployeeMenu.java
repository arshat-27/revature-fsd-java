package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

public class EmployeeMenu extends Menu {
	Scanner scanner = new Scanner(System.in);
	CustomerDaoImpl customerdao = new CustomerDaoImpl();

	public EmployeeMenu(String name) {
		super(name);
		addMenuItem("Register for Customer ");
		addMenuItem("View Customers");
		addMenuItem("View Accounts");
		addMenuItem("View Transactions");
		addMenuItem("Pending Accounts");
		addMenuItem("Logout");
	}

	@Override
	void handleAction() {
		switch(selection) {
		case 1 :
			System.out.println("\n===");
			System.out.println("Register new Customer");
			System.out.println("====\n");
			
			System.out.print("First Name: ");
			String firstName = scanner.nextLine();
			
			System.out.print("Last Name: ");
			String lastName = scanner.nextLine();

			System.out.print("Email: ");
			String email = scanner.nextLine();

			System.out.print("Password: ");
			String password = scanner.nextLine();
			
			try {
				customerdao.create(new Customer(firstName, lastName, email, password));
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("Customer added successfully.");
			displayMenuAndCaptureSelection();
			break;		
		}
		
		
	}
	

}
