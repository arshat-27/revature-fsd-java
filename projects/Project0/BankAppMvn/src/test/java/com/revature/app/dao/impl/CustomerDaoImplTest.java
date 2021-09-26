package com.revature.app.dao.impl;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

class CustomerDaoImplTest {

	@Test
	void testCreate_Success() {
		Customer customer = new Customer("Maria", "John", "maria@gmail.com", "pass","phoneno");
		CustomerDao dao = new CustomerDaoImpl();
		try {
			dao.create(customer);
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Creating customer failed.");
		}

	}

	@Test
	void testGet_Email() {
		Customer customer = new Customer("Maria", "John", "maria@gmail.com", "pass","phoneno");
		CustomerDaoImpl dao = new CustomerDaoImpl();
		try {

			dao.getCustomerEmail("maria@gmail.com");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
