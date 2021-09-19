package com.revature.bankapp.main;

import com.revature.bankapp.menu.CustomerMenu;

public class BankApp {

	public static void main(String[] args) {
		CustomerMenu menu = new CustomerMenu("Main Menu");
		menu.displayMenuAndCaptureSelection();
	}

}
