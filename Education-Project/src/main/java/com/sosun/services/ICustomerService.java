package com.sosun.services;

import com.sosun.dto.DtoCustomer;
import com.sosun.entities.Customer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);
	
	public Customer saveCustomer(DtoCustomer dtoCustomer);
}
