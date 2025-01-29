package com.sosun.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sosun.controller.IAdressController;
import com.sosun.dto.DtoAddress;
import com.sosun.services.impl.AddressService;

// Adres ile ilgili işlemleri yöneten controller sınıfı
@RestController
@RequestMapping("/rest/api/address") // '/rest/api/address' URL yolu ile bu controller'a ulaşılabilir
public class AdressController implements IAdressController {

	// Adres servisinin enjekte edilmesi
	@Autowired
	private AddressService addressService;
	
	// Adres ID'sine göre adres bilgilerini döndüren GET endpoint
	@Override
	@GetMapping(path = "/list/{id}") // URL yolu '/list/{id}' ile bir adres bilgisi alınabilir
	public DtoAddress findAddresId(@PathVariable(name = "id") Long id) {
		// Adres servisine yönlendirme yaparak belirtilen ID'ye sahip adresi döner
		return addressService.findAddresId(id);
	}

}
