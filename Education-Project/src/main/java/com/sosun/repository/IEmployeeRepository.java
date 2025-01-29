package com.sosun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sosun.entities.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
	

}
