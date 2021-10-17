package com.revature.bankapp.view;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.TransactionDaoImpl;
import com.revature.bankapp.model.Transactions;

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
