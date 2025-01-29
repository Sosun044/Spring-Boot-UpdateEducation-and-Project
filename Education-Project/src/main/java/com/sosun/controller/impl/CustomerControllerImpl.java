package com.sosun.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sosun.controller.ICustomerController;
import com.sosun.dto.DtoCustomer;
import com.sosun.entities.Customer;
import com.sosun.services.impl.CustomerService;

// Müşteri işlemleri ile ilgili REST API Controller sınıfı
@RestController
@RequestMapping("/rest/api/customer") // '/rest/api/customer' URL yolu ile bu controller'a ulaşılabilir
public class CustomerControllerImpl implements ICustomerController {
	
	// Müşteri servisini enjekte etme
	@Autowired
	private CustomerService customerService;
	
	// Müşteri ID'sine göre müşteri bilgilerini döndüren GET endpoint
	@GetMapping(path = "/list/{id}") // URL yolu '/list/{id}' ile bir müşteri bilgisi alınabilir
	@Override
	public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
		// Müşteri servisine yönlendirerek belirtilen ID'ye sahip müşteri bilgilerini döner
		return customerService.findCustomerById(id);
	}
	
	// Yeni müşteri kaydeden POST endpoint
	@PostMapping(path = "/save") // URL yolu '/save' ile müşteri kaydı yapılabilir
	@Override
	public Customer saveCustomer(@RequestBody DtoCustomer dtoCustomer) {
		// Alınan DTO objesini müşteri servisine ileterek yeni bir müşteri kaydeder
		return customerService.saveCustomer(dtoCustomer);
	}

}
