package com.cg.obtrs.dao;

import com.cg.obtrs.dto.CustomerDTO;

public interface CustomerDAO 
{
    public String customerSignUp(CustomerDTO custDto);
    
    public String customerLoginIn(String userName, String password);
    
    public String generateTicket(CustomerDTO cust);
}
