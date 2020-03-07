package com.cg.obtrs.dao;
import java.util.ArrayList;

import com.cg.obtrs.dto.CustomerDTO;

public class StaticDb 
{
 static public ArrayList<CustomerDTO> custArr = new ArrayList<>();

public static ArrayList<CustomerDTO> getCustArr() {
	return custArr;
}

public static void setCustArr(ArrayList<CustomerDTO> custArr) {
	StaticDb.custArr = custArr;
	
}
 
}
