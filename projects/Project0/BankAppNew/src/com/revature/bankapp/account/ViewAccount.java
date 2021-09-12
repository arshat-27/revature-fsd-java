package com.revature.bankapp.account;

import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.DataManager;

public class ViewAccount extends Account {
	protected  List<String> accountList;

	public ViewAccount(String accountNumber) {
		super(accountNumber, 0);
		accountList= new ArrayList<>();
		
		
	
	
}
	public  void displayAccounts() {
		for (int i=0;i<accountList.size();i++) {
			System.out.println((i + 1) + "] " + accountList.get(i));
			
			
		}
	}
	
	

}
