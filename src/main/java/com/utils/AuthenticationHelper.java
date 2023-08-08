package com.utils;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.dto.EmployeeDTO;

@Component
public class AuthenticationHelper {
	
	public Boolean isAuthenticated(HttpSession session) {
		EmployeeDTO user = (EmployeeDTO) session.getAttribute("user");
		return user!=null;
	}

}
