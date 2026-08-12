package com.tca.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.tca.model.Student;

public class StudentRepository 
{
	@Autowired
	Map<String,Student> hm;
	
	public Student findById(String studentId)
	{
		return hm.get(studentId);
	}
	
	public Map<String,Student> findAll()
	{
		return hm;
	}
}
