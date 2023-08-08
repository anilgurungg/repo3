package com.config;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.dto.EmployeeDTO;
 

@Component
public class SessionInterceptor implements HandlerInterceptor {
	private static final List<String> ALLOWED_PATHS = Arrays.asList("/registration", "/login", "/validateLogin", "/employeeRegister");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestPath = request.getRequestURI();
        
        if (requestPath.startsWith("/images/") || requestPath.startsWith("/static/") || requestPath.startsWith("/webjars/")) {
            return true;
        }
        
        if (ALLOWED_PATHS.contains(requestPath)) {
            return true;  
        }

      
        EmployeeDTO user = (EmployeeDTO) request.getSession().getAttribute("user");
        if (user == null) {
        	request.setAttribute("notLoggedInMessage", "Please log in to access this page.");
            request.getRequestDispatcher("/login").forward(request, response);
//            response.sendRedirect("/login");  
            return false;  
        }
        return true;  
    }
}
