package com.tca.service;

import java.util.List;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService 
{
	public List<Student> fetchAllStudent();
	public List<Student> findPercentageRangeStudent(Double start,Double end);
	
	public List<Object[]> findGenderNamePerStudent(Double per,Gender gender);
}
