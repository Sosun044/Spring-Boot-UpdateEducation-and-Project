package com.sosun.controller;

import com.sosun.dto.DtoCustomer;
import com.sosun.entities.Customer;

public interface ICustomerController {
	
	public DtoCustomer findCustomerById(Long id);
	
	public Customer saveCustomer(DtoCustomer dtoCustomer);

}
