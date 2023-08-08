package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Autowired
	private SessionInterceptor sessionInterceptor;
	
	@Autowired
    private NoCacheInterceptor noCacheInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		
		registry.addInterceptor(sessionInterceptor).excludePathPatterns("/login", "/registration", "/validateLogin", "/employeeRegister");
		
		  registry.addInterceptor(noCacheInterceptor);
		
	}

	 
	
	
	
}
