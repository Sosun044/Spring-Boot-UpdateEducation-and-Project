package com.sosun.services;

import java.util.List;

import com.sosun.dto.DtoDepartment;
import com.sosun.dto.DtoEmployee;

public interface IEmployeeService {
	
	public List<DtoEmployee> findAllEmployees();

}
