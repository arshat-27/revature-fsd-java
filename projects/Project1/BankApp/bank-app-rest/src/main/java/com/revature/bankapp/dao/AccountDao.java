package com.revature.bankapp.dao;

import java.sql.SQLException;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.exception.AppException;

public interface AccountDao {
	
	int create(Account account) throws SQLException;

}
