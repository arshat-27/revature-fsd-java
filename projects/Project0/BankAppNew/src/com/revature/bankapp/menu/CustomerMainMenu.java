package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.account.Account;
import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.form.Form;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.DataManager;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("View Accounts");
		addMenuItem("Create Account");
		addMenuItem("Back To Main Menu");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch(selection) {
		case 1:
			ViewAccount.accountListandbalance();
			displayMenuAndCaptureSelection();
			break;
			
			
			
		case 2:
			System.out.println("\n===");
			System.out.println("Create Account");
			System.out.println("====\n");
			
			System.out.print("Enter Account Number: ");
			String accountNumber = scanner.nextLine();
			
			System.out.print("Enter Balance: ");
			double balance = scanner.nextDouble();
			
			DataManager.addAccount(new Account(accountNumber,balance));
			System.out.println("Account added successfully.");
			displayMenuAndCaptureSelection();
			break;
			
		case 3:
			MainMenu menu = new MainMenu("Logged out \n====\nMain menu");
			menu.displayMenuAndCaptureSelection();
			break;
			
		case 4:
			System.out.println("Thank You Visit Again");
			break;
		}
		
		
	}

}
