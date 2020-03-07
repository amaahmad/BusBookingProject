package com.cg.obtrs.dao;

import com.cg.obtrs.dto.AdminDTO;
 	
public interface AdminDAO {

	 public String adminSignUp(AdminDTO adminDto);
	    
	 public String adminLogin(String userName, String password);
	 
	 
}
