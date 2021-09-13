package com.revature.bankapp.account;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.DataManager;

public class ViewAccount  {
	//protected  List<String> accountList;

	//public ViewAccount(String accountNumber) {
		//super(accountNumber, 0);
		
		public static Account accountList() {
			for (int i=0;i < DataManager.accountList.size();i++) {
				System.out.println((i + 1) + "] " + Account.getAccountNumber());
			}
			return null;
			
		
	
	

		
			
		}
	}
	
	


