package com.cg.obtrs.service;

import com.cg.obtrs.dao.CustomerDAOImpl;
import com.cg.obtrs.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService 
{

	@Override
	public String customerSignUp(CustomerDTO custDto) 
	{
		return new CustomerDAOImpl().customerSignUp(custDto);
	}

	@Override
	public String customerLogin(String userName, String password) {
	
		return new CustomerDAOImpl().customerLogin(userName, password);
	}
   
}
