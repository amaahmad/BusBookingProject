package com.cg.obtrs.service;

import com.cg.obtrs.dto.CustomerDTO;

public interface CustomerService 
{
    public String customerSignUp(CustomerDTO custDto);

	public String customerLoginIn(String userName, String password);
}
