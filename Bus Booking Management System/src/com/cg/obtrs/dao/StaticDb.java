package com.cg.obtrs.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

<<<<<<< HEAD
import com.cg.obtrs.dto.BookingDTO;
import com.cg.obtrs.dto.BusDTO;
=======
import com.cg.obtrs.dto.AdminDTO;
>>>>>>> branch 'master' of https://github.com/amaahmad/BusBookingProject.git
import com.cg.obtrs.dto.CustomerDTO;

public class StaticDb 
{
 static public ArrayList<CustomerDTO> custList = new ArrayList<>();
 
 static public Map<Integer,BusDTO> busList = new HashMap<>(); 
 static public ArrayList<CustomerDTO> custArr = new ArrayList<>();
 static public ArrayList<AdminDTO> adminArr=new ArrayList<>();
 

public static ArrayList<AdminDTO> getAdminArr() {
	return adminArr;
}

public static void setAdminArr(ArrayList<AdminDTO> adminArr) {
	StaticDb.adminArr = adminArr;
}



 static public Map<Integer, BookingDTO> bookingList = new HashMap<>();
	

public static ArrayList<CustomerDTO> getCustArr() {
	return custArr;
}

public static void setCustArr(ArrayList<CustomerDTO> custArr) {
	StaticDb.custArr = custArr;
	System.out.println("");
>>>>>>> branch 'master' of https://github.com/amaahmad/BusBookingProject.git
}


 
