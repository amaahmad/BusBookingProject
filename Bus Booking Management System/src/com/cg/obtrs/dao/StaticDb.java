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

}




 
