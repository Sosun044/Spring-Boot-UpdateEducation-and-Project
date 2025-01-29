package com.sosun.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sosun.dto.DtoAddress;
import com.sosun.dto.DtoCustomer;
import com.sosun.entities.Address;
import com.sosun.entities.Customer;
import com.sosun.repository.IAdressRepository;
import com.sosun.repository.ICustomerRepository;
import com.sosun.services.ICustomerService;

@Service
public class CustomerService implements ICustomerService{
	
	DtoCustomer dtoCustomer = new DtoCustomer();
	DtoAddress dtoAddress = new DtoAddress();
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IAdressRepository adressRepository;
	
	@Override
	public DtoCustomer findCustomerById(Long id) {
		Optional<Customer> optional= customerRepository.findById(id);
		
		if(optional.isEmpty()) {
			return null;
		}
		
		Customer customer = optional.get();
		Address address = optional.get().getAddress();
		
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(address, dtoAddress);
		
		dtoCustomer.setAddress(dtoAddress);
		return dtoCustomer;
	}

	@Override
	public Customer saveCustomer(DtoCustomer dtoCustomer) {
		Customer customer = new Customer();
		customer.setName(dtoCustomer.getName());
		if(dtoCustomer.getAddress() !=null) {
			Address address = new Address();
			address.setDescription(dtoCustomer.getAddress().getDescription());
			address = adressRepository.save(address);
			customer.setAddress(address);
		}
		
		return customerRepository.save(customer);
	}
	

}
