package com.sosun.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sosun.controller.IStudentController;
import com.sosun.dto.DtoStudent;
import com.sosun.dto.DtoStudentIU;
import com.sosun.services.IStudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{
	
	// IStudentService ile öğrenci işlemlerini gerçekleştirmek için
	@Autowired
	private IStudentService studentService;
	
	// Yeni öğrenci kaydetmek için metod
	@PostMapping(path = "/save")
	@Override
	public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dboStudentIU) {
		// Öğrenci kaydını IStudentService üzerinden yapıyoruz
		return studentService.saveStudent(dboStudentIU);
	}
	
	// Tüm öğrencilerin listesini almak için metod
	@GetMapping(path = "/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		// IStudentService üzerinden tüm öğrenci listesini alıyoruz
		return studentService.getAllStudents();
	}
	
	// Öğrenciyi ID'ye göre arayıp almak için metod
	@GetMapping(path = "/list/{id}")
	@Override
	public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
		// ID'ye göre öğrenci bilgisini alıyoruz
		return studentService.getStudentById(id);
	}
	
	// Öğrenciyi ID'ye göre silmek için metod
	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		// IStudentService üzerinden öğrenci silme işlemi gerçekleştiriyoruz
		studentService.deleteStudent(id);
	}
	
	// Öğrenci bilgisini güncellemek için metod
	@PutMapping(path = "/update/{id}")
	@Override
	public DtoStudent updateStudent(@PathVariable(name = "id") Integer id, @RequestBody DtoStudentIU dtoStudentIU) {
		// Öğrenci bilgilerini IStudentService üzerinden güncelliyoruz
		return studentService.updateStudent(id, dtoStudentIU);
	}
}
