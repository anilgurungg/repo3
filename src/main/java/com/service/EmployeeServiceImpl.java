package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MagicDaoRepository;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	MagicDaoRepository magicDaoRepository;
	
	

	@Override
	public List<EmployeeDTO> getAllEmployees() {
	 	List<EmployeeEntity> employeeEntities =  magicDaoRepository.findAll();
	 	List<EmployeeDTO> employeeDtos =  new ArrayList<>();
	 	
	 	if(employeeEntities.size() > 0 ) {
	 		for(EmployeeEntity temp:employeeEntities) {
	 			EmployeeDTO employeeDto = new EmployeeDTO();
	 			BeanUtils.copyProperties(temp, employeeDto);
	 			employeeDtos.add(employeeDto);
	 		}
	 	}
	 	
		return employeeDtos;
	}

	@Override
	public EmployeeDTO authenticate(String email, String password) {
		Optional<EmployeeEntity> optional=magicDaoRepository.findByEmailIdAndPassword(email,password);
		EmployeeDTO employeeDTO=null;
	
	if(optional.isPresent()) {
		 
		EmployeeEntity	 employeeEntity=optional.get();
		
		employeeDTO=new EmployeeDTO();
		BeanUtils.copyProperties(employeeEntity,employeeDTO);
		
		return employeeDTO;   
	}else {
		return employeeDTO;	 
	}
	}

	@Override
	public void registerEmployee(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		magicDaoRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		magicDaoRepository.deleteById(employeeId);
		
		
	}

	@Override
	public EmployeeDTO getEmployeeById(int employeeId) {
		Optional<EmployeeEntity> optional=magicDaoRepository.findById(employeeId);
		EmployeeDTO employeeDTO=null;
		
		if(optional.isPresent()) {
			 
			EmployeeEntity	 employeeEntity=optional.get();
			
			employeeDTO=new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity,employeeDTO);
			
			return employeeDTO;   
		}else {
			return employeeDTO;	 
		}
	}

	@Override
	public void updateEmployee(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		magicDaoRepository.save(employeeEntity);
		
	}

}
