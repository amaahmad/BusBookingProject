package com.cg.obtrs.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.obtrs.dto.BookingDTO;
import com.cg.obtrs.dto.BusDTO;

import com.cg.obtrs.dto.AdminDTO;

import com.cg.obtrs.dto.CustomerDTO;

public class StaticDb 
{
 static public ArrayList<CustomerDTO> custList = new ArrayList<>();
 
 static public Map<Integer,BusDTO> busList = new HashMap<>(); 

 static public ArrayList<AdminDTO> adminArr=new ArrayList<>();
 
 static public Map<Integer, BookingDTO> bookingList = new HashMap<>();
	
 
 //Pre-populated Bus List Data
static{
	busList.put(111, new BusDTO("Delhi","Lucknow","Volvo",900.0F,"16(B)"));
	busList.put(120, new BusDTO("Mumbai","Pune","AC Bus",1200.0F,"17(F)"));
	busList.put(109, new BusDTO("Ahemdabad","Gandhinagar","Non-AC Bus",1050.0F,"18(G)"));
	busList.put(112, new BusDTO("Talawade","Ahmednagar","Double-Decker",500.0F,"02(B)"));
}

//Pre-populated Customer List Data
static{
	custList.add(new CustomerDTO("Amaan Ahmad",7894561235L,"amaan.ahmad@gmail.com",1231,"amaahmad","am@anahmad123"));
	custList.add(new CustomerDTO("Yash Bhatia",7984651324L,"yash.bhatia@gmail.com",1241,"ybhatia","y@$hbhatia"));
	custList.add(new CustomerDTO("Shivani Sharma",7964581325L,"shivani.sharma@gmail.com",1272,"ssharma","shivani1235"));
	
}
}

 
