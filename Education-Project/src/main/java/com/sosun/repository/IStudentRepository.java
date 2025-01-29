package com.sosun.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sosun.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{
	
	//Buraya kenid özel metodlarımızı yazarız
	//örneğin aşağidakiler var JpaRepository de fakat örnek olsun diye yaptım
	
	//HQL : Sınıfın ismi ve değişken isimleri kullanılarak sorgu yazılır
	//SQL : tablo ismi ve tablo içerisindeki kolon isimleri ile sorgu yazılır
	
	@Query(value = "from Student", nativeQuery = false)
	List<Student> findAllStudent();
	
	@Query(value = "from Student s WHERE s.id = :studentId")
	Optional<Student> findStudentById(Integer studentId); 

}
