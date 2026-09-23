package com.tca.service;

import java.util.List;

import com.tca.dto.StudentDTO;

public interface StudentService 
{
	public List<StudentDTO> findStudentNamePerGender();
}
