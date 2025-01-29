package com.sosun.dto;

import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message = "FirstName Alanı Boş Bırakılmaz!")
	@Min(value = 3,message = "FirstName alanı en az 3 karakter olmalı")
	@Max(value = 10,message = "FirstName alanı en fazla 10 karakter olmalı")
	private String firstName;
	@Size(min = 3,max = 30)
	private String lastName;
	
	private Date birthDate;
	
	@Email(message = "Mail Formatında giriniz!")
	private String email;
	
	@Size(min = 11,max = 11)
	@NotEmpty(message = "tckn alanı boş geçilmez!")
	private String tckn;
	

}
