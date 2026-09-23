package com.tca.service;

import java.util.List;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService 
{
	public List<Student> findAllByGreaterThanPercentageAndGender(Gender gender,Double per);
	public void updateStudent(String name,Integer rno);
	public List<Object[]> findGenderAndName();
	public List<Object[]> countByGender();
}
