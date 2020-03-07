package com.cg.obtrs.dao;

import com.cg.obtrs.dto.BookingDTO;
import com.cg.obtrs.dto.BusDTO;
import com.cg.obtrs.dto.CustomerDTO;
import com.cg.obtrs.exception.CustomException;

public interface BookingDAO 
{
   public String generateTicket(CustomerDTO customer, BusDTO bus, BookingDTO booking) throws CustomException;

   public int refundMoney() throws CustomException;
   
   public String displayFare(int age, BusDTO bus) throws CustomException;
   
   public String checkSeatAvailability(BookingDTO booking, BusDTO bus) throws CustomException;
   
   public String cancelBooking(int busId) throws CustomException;
} 
