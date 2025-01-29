package com.sosun.services;

import java.util.List;

import com.sosun.dto.DtoStudent;
import com.sosun.dto.DtoStudentIU;
import com.sosun.entities.Student;

public interface IStudentService {
	
	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
	
}
