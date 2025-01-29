package com.sosun.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sosun.controller.IHomeController;
import com.sosun.dto.DtoHome;
import com.sosun.services.impl.HomeService;

// Ev bilgileri ile ilgili REST API Controller sınıfı
@RestController
@RequestMapping("/rest/api/home") // '/rest/api/home' URL yolu ile bu controller'a ulaşılabilir
public class HomeController implements IHomeController {

	// Ev servisini enjekte etme
	@Autowired
	private HomeService homeService;
	
	// Ev bilgilerini ID'ye göre listeleyen GET endpoint
	@GetMapping(path = "/list/{id}") // URL yolu '/list/{id}' ile belirtilen ID'ye sahip evin bilgisi alınabilir
	@Override
	public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
		// Ev servisine yönlendirerek belirli bir ID'ye sahip evin bilgilerini döner
		return homeService.findHomeById(id);
	}
}
