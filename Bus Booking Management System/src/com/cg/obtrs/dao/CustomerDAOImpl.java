package com.cg.obtrs.dao;

import com.cg.obtrs.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO 
{
  
	@Override
	public String customerSignUp(CustomerDTO custDto) 
	{
	   	 StaticDb.custList.add(custDto);
	   	 return "Signup Successfull";
    }

	@Override
	public String customerLoginIn(String userName, String password) {
		int flag=0;
		for(CustomerDTO cust : StaticDb.custList)
		{
			if(cust.getCustUserName().equals(userName) && cust.getCustPassword().equals(password))
			{
			 flag=1;
			  break;
			}
			  
		}
		if(flag==1)
			return "Login Successful";
		else
			return "Username or password is incorrect";
	}

	@Override
	public String generateTicket(CustomerDTO cust) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
