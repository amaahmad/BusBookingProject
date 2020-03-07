package com.cg.obtrs.service;

import com.cg.obtrs.dao.AdminDAOImpl;
import com.cg.obtrs.dao.CustomerDAOImpl;
import com.cg.obtrs.dto.AdminDTO;

public class AdminServiceImpl implements AdminService{

	@Override
	public String adminSignUp(AdminDTO adminDto) {
		return new AdminDAOImpl().adminSignUp(adminDto);
	}
	

	@Override
	public String adminLogin(String userName, String password) {
		return new AdminDAOImpl().adminLogin(userName, password);
		}
}
