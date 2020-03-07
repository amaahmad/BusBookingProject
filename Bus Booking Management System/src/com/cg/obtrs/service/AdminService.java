package com.cg.obtrs.service;

import com.cg.obtrs.dto.AdminDTO;

public interface AdminService {
	public String adminSignUp(AdminDTO adminDto);

	public String adminLogin(String userName, String password);
}
