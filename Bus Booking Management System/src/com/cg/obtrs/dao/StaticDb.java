package com.cg.obtrs.dao;
import java.util.ArrayList;

import com.cg.obtrs.dto.AdminDTO;
import com.cg.obtrs.dto.CustomerDTO;

public class StaticDb 
{
 static public ArrayList<CustomerDTO> custArr = new ArrayList<>();
 static public ArrayList<AdminDTO> adminArr=new ArrayList<>();
 

public static ArrayList<AdminDTO> getAdminArr() {
	return adminArr;
}

public static void setAdminArr(ArrayList<AdminDTO> adminArr) {
	StaticDb.adminArr = adminArr;
}

public static ArrayList<CustomerDTO> getCustArr() {
	return custArr;
}

public static void setCustArr(ArrayList<CustomerDTO> custArr) {
	StaticDb.custArr = custArr;
	
}


 
}
