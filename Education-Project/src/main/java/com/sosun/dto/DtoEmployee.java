package com.sosun.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {
	public Long id;
	
	public String name;
	
	public DtoDepartment department;
	

}
