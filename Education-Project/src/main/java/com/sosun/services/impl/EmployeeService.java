package com.sosun.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sosun.dto.DtoDepartment;
import com.sosun.dto.DtoEmployee;
import com.sosun.entities.Employee;
import com.sosun.repository.IEmployeeRepository;
import com.sosun.services.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	
	@Override
	public List<DtoEmployee> findAllEmployees() {
		List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
		List<Employee> emplooyeList =employeeRepository.findAll();
		if(emplooyeList != null && !emplooyeList.isEmpty() ) {
			for (Employee employee : emplooyeList) {
				DtoEmployee dtoEmployee = new DtoEmployee();
				BeanUtils.copyProperties(employee, dtoEmployee);
				
				dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),employee.getDepartment().getDeparmtentName()));
				dtoEmployeeList.add(dtoEmployee);
			}
		}
		return dtoEmployeeList;
	}

}
