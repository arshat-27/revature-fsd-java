package com.revature.bankapp.account;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.TransactionDaoImpl;

public class ViewTransaction {
	public static  Transactions TransactionList() {
		int i=1;
		try {
			for (Transactions t : TransactionDaoImpl.transactionList()) {
				System.out.println((i) + "} " +" amount =  "+t.getAmount() +"  Type = "+ t.getType());
				i+=1;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
