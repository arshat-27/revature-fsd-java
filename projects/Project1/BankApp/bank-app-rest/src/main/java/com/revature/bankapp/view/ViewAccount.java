package com.revature.bankapp.view;

import java.sql.SQLException;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.model.Account;

public class ViewAccount {
		AccountDaoImpl accountdao = new AccountDaoImpl();
	 	 
	public  Account accountListandbalance() {
		int i=1;
		try {
			for (Account account : accountdao.accountList()) {
				System.out.println((i) + "} " +" Account Number =  "+account.getAccountNumber() +"  Balance = "+ account.getBalance());
				i+=1;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}