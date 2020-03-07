package com.cg.obtrs.dao;

import java.sql.Time;
import java.util.Date;

import com.cg.obtrs.dto.BookingDTO;
import com.cg.obtrs.dto.BusDTO;
import com.cg.obtrs.dto.CustomerDTO;
import com.cg.obtrs.exception.CustomException;

public class BookingDAOImpl implements BookingDAO 
{
	@Override
	//Function to generateTicket
	public String generateTicket(CustomerDTO customer, BusDTO bus, BookingDTO booking) throws CustomException
	{
		String custName = customer.getCustName();
		String source = bus.getSourceStation();
		String destination = bus.getDestinationStation();
	    int distanceInKms = booking.getDistanceInKms();
		float fare = bus.getFare();
		int busId = bus.getBusId();
		Date boardingTime = booking.getBoardingTime();
		Date dropTime = booking.getDropTime();
		String seatno = bus.getSeatNo();
		int bookingId = booking.getBookingId();
		booking.setBookingId(bookingId++);
	    return "";
	}
	//Function that refundsMoney on cancellation or booking failure.
	@Override
	public int refundMoney() throws CustomException {
		
		return 0;
	}

	@Override
	public String displayFare(int age, BusDTO bus) throws CustomException {
		float busFare, discountedFare=0;
		int busId= bus.getBusId();
		BusDTO busDto = StaticDb.busList.get(busId);
        busFare = busDto.getFare();
		if(age<8)
		{
            float discount = (0.60f*busFare);
            discountedFare = busFare-discount;            
		}
		else
		{
			 discountedFare= busFare;
		}
		return "Rs."+ discountedFare;
	}
	@Override
	public String checkSeatAvailability(BookingDTO booking, BusDTO bus) {
		
		BusDTO busDetails = StaticDb.bookingList.get(bus.getBusId())
	    
	}
	

	
	
}
