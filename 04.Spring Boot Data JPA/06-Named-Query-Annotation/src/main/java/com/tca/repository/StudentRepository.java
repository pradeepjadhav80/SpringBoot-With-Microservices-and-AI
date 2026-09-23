package com.tca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.tca.entity.Gender;
import com.tca.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student,Integer>
{
	public List<Student> findAllByGreaterThanPercentageAndGender(Double per,Gender gender);
	
	@Modifying
	@Transactional
	public void updateName(String name,Integer rno);
	
	public List<Object[]> findGenderAndName();
	
	public List<Object[]> countByGender();
	
}
