package com.revature.bankapp.dao;

import java.sql.SQLException;

import com.revature.bankapp.account.Account;

public interface AccountDao {
	
	int create(Account account) throws SQLException;

}
