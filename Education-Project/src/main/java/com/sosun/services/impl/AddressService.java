package com.sosun.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sosun.dto.DtoAddress;
import com.sosun.dto.DtoCustomer;
import com.sosun.entities.Address;
import com.sosun.repository.IAdressRepository;
import com.sosun.services.IAddressService;

@Service
public class AddressService implements IAddressService{
	
	
	@Autowired
	private IAdressRepository adressRepository; 
	

	@Override
	public DtoAddress findAddresId(Long id) {
		DtoAddress dtoAddress = new DtoAddress();
		Optional<Address> optional =adressRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		Address address = optional.get();
		BeanUtils.copyProperties(address, dtoAddress);
		
		DtoCustomer dtoCustomer = new DtoCustomer();
		dtoCustomer.setId(address.getCustomer().getId());;
		dtoCustomer.setName(address.getCustomer().getName());
		
		dtoAddress.setDtoCustomer(dtoCustomer);
		return dtoAddress;
		
	}
	

}
