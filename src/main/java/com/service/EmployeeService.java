package com.service;

import java.util.List;

import com.dto.EmployeeDTO;

public interface EmployeeService {

	public List<EmployeeDTO> getAllEmployees();

	public EmployeeDTO authenticate(String email, String password);

	public void  registerEmployee(EmployeeDTO employeeDTO);

	public void deleteEmployee(int employeeId);

	public EmployeeDTO getEmployeeById(int employeeId);

	public void updateEmployee(EmployeeDTO employeeDTO);

}
