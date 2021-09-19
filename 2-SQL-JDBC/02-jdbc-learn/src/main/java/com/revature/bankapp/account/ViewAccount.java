package com.revature.bankapp.account;

import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.DataManager;

public class ViewAccount {

	public static Account accountListandbalance() {
		// Account account=new Account();
		// for (int i = 0; i < DataManager.accountList.size(); i++) {
		// System.out.println((i + 1) + "] " + Account.getAccountNumber());
		for (Account account : DataManager.accountList) {
			int i=1;
			System.out.println((i + 1) + "} " +" Account Number =  "+account.getAccountNumber() +"  Balance = "+ account.getBalance());
			i+=1;

		}
		return null;

	}
}
