package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService 
{
	public Optional<Student> fetchById(Integer rno);
	public List<Student> fetchAll();
	
	/*-----------------Query Creation using Method Name Approach ---------*/
	
	public List<Student> fetchByGender(Gender gender);
	public List<Student> fetchByBirthDate(LocalDate d);
	public List<Student> fetchByBirthDateGreaterThan(LocalDate d);
	public List<Student> fetchByPerBetween(Double startPer,Double endPer);
	public List<Student> fetchByBirthDateBetween(LocalDate startDate,LocalDate endDate);
	public List<Student> fetchByBirthDateAfter(LocalDate date);
	public List<Student> fetchByBirthDateBefore(LocalDate date);
	public List<Student> fetchByNameStartingWithIgnoreCase(String name);
	public List<Student> fetchByGenderOrderByPer(Gender gender);
	public List<Student> fetchByGenderAndPerGreaterThanEqual(Gender gender,Double per);
	public Long countByGender(Gender gender);
	public Boolean existByRno(Integer rno);	
	
}
