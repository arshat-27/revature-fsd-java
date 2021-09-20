package com.revature.bankapp.account;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.TransactionDaoImpl;
import com.revature.bankapp.model.DataManager;

public class ViewAccount {
		AccountDaoImpl accountdao = new AccountDaoImpl();
	 	 
	public  Account accountListandbalance() {
		int i=1;
		try {
			for (Account account : accountdao.accountList()) {
				System.out.println((i + 1) + "} " +" Account Number =  "+account.getAccountNumber() +"  Balance = "+ account.getBalance());
				i+=1;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
