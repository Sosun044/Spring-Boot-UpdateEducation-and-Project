package com.sosun.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sosun.controller.IEmployeeController;
import com.sosun.dto.DtoEmployee;
import com.sosun.services.impl.EmployeeService;

// Çalışan işlemleri ile ilgili REST API Controller sınıfı
@RestController
@RequestMapping("rest/api/employee") // '/rest/api/employee' URL yolu ile bu controller'a ulaşılabilir
public class EmployeeController implements IEmployeeController {
	
	// Çalışan servisini enjekte etme
	@Autowired
	private EmployeeService employeeService;
	
	// Tüm çalışanları listeleyen GET endpoint
	@GetMapping(path = "/list") // URL yolu '/list' ile çalışanların listesi alınabilir
	@Override
	public List<DtoEmployee> findAllEmployees() {
		// Çalışan servisine yönlendirerek tüm çalışan bilgilerini döner
		return employeeService.findAllEmployees();
	}
}
