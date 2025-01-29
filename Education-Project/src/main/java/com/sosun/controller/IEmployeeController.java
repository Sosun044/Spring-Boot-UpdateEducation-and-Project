package com.sosun.controller;

import java.util.List;

import com.sosun.dto.DtoEmployee;

public interface IEmployeeController {
	public List<DtoEmployee> findAllEmployees();

}
