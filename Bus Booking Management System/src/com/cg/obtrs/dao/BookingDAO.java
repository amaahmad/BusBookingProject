package com.cg.obtrs.dao;

import com.cg.obtrs.dto.CustomerDTO;
import com.cg.obtrs.exception.CustomException;

public interface BookingDAO 
{
   public String generateTicket(CustomerDTO customer) throws CustomException;
} 
