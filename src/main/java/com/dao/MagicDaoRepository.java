package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;

public interface MagicDaoRepository extends JpaRepository<EmployeeEntity, Integer > {

	Optional<EmployeeEntity> findByEmailIdAndPassword(String email, String password);

}
