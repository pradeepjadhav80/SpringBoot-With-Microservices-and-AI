package com.tca.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{
	public List<Student> findByGender(Gender gender);
	
	public List<Student> findByBirthDate(LocalDate date);
	
	public List<Student> findByBirthDateGreaterThan(LocalDate d);
	
	public List<Student> findByPerBetween(Double startPer,Double endPer);
	
	public List<Student> findByBirthDateBetween(LocalDate startDate,LocalDate endDate);
	
	public List<Student> findByBirthDateAfter(LocalDate date);
	
	public List<Student> findByBirthDateBefore(LocalDate date);

	public List<Student> findByNameStartingWithIgnoreCase(String s);
	
	public List<Student> findByGenderOrderByPer(Gender gender);
	
	public List<Student> findByGenderAndPerGreaterThanEqual(Gender gender,Double per);
	public Long countByGender(Gender gender);
	public Boolean existsByRno(Integer rno);
	
	
}
