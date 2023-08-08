package com.dto;

public class EmployeeDTO {
	int employeeId;
	String employeeName;
	String date;
	String emailId;
	String password;
	int salary;
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(int employeeId, String employeeName, String date, String emailId, String password, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.date = date;
		this.emailId = emailId;
		this.password = password;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", date=" + date
				+ ", emailId=" + emailId + ", password=" + password + ", salary=" + salary + "]";
	}
	

}
