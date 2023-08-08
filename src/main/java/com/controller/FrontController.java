package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
import com.service.EmployeeService;
import com.utils.AuthenticationHelper;

@Controller
public class FrontController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	AuthenticationHelper authenticationHelper;
	
	
	@GetMapping({"/", "/login"}) 
		public String getLoginPage(@RequestParam(required = false) String error, Model model) {
//		
//		if(error != null) {
//			model.addAttribute("errorMessage", "You are not logged in!!");
//			System.out.println("Error logg in!!");
//		}
		
		return "userLogin";
		}
	
	@PostMapping("/validateLogin") 
	public String validateLogin(@RequestParam String email,@RequestParam String password, Model model, HttpSession session) {
		EmployeeDTO employeeDTO=employeeService.authenticate(email,password);
		System.out.println(employeeDTO);
		if(employeeDTO!=null) {
			session.setAttribute("user", employeeDTO);
			   model.addAttribute("employeeDTO", employeeDTO);
			   return "userView";  
		   }else {
			   
			   model.addAttribute("message", "Incorrect Credentials. Please Try again!");
			   return "userLogin";  
		   }  
	}
	
	
	@GetMapping("/viewEmployee") 
	public String viewEmployeeById(@RequestParam String employeeId , Model model ) {
		EmployeeDTO employeeDTO = employeeService.getEmployeeById(Integer.parseInt(employeeId));
	
		 
		if(employeeDTO!=null) {
		 
			   model.addAttribute("employeeDTO", employeeDTO);
			   return "userView";  
		   }else {
			   
			   model.addAttribute("message", "Employee Doesnot exist");
			   return "redirect:/getAllEmployees";
		   }  
	}
	
	@GetMapping("/getAllEmployees")
	public String getAllEmployees(Model model, HttpSession session) {
		System.out.println("get all employee controller");
		 
//		if(!authenticationHelper.isAuthenticated(session) ) {
//			model.addAttribute("message1", "You are not logged in!!");
//			System.out.println("Error logg in!!");
//			 return "redirect:/login?error=true";
//		}
		   
		List<EmployeeDTO> employees =  employeeService.getAllEmployees();
		
		System.out.println(employees);
		model.addAttribute("employeeDTOs", employees);
		
		return "allUsers";
	}
	
	@GetMapping( "/registration") 
	public String getRegistrationPage() {
	return "userRegistration";
	}
	
	@PostMapping("/employeeRegister")
	public String registerEmployee(@ModelAttribute EmployeeDTO employeeDTO, Model model) {
		employeeService.registerEmployee(employeeDTO);
		model.addAttribute("message", "User Added Successfully");
		return "userRegistration";
	}
	
	@GetMapping( "/deleteEmployee") 
	public String deleteEmployee(@RequestParam String employeeId, Model model) {
		
		employeeService.deleteEmployee( Integer.parseInt(employeeId));
		model.addAttribute("message", "Employee deleted!!");
		return "redirect:/getAllEmployees";
	}
	
	@GetMapping( "/updateEmployee")
	public String updateEmployee(@RequestParam String employeeId, Model model) {
		EmployeeDTO employeeDTO = employeeService.getEmployeeById(Integer.parseInt(employeeId));
		model.addAttribute("employee",employeeDTO);
		return "userUpdate";
	}
	
	@PostMapping("/employeeUpdate")
	public String employeeUpdate(@ModelAttribute EmployeeDTO employeeDTO, Model model) {
		employeeService.updateEmployee(employeeDTO);
		model.addAttribute("message", "User updated Successfully");
		return "redirect:/getAllEmployees";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		 session.invalidate();
		return "redirect:/login";
		}
	
}
