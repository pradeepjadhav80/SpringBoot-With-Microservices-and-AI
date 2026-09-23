package com.tca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> fetchAllByGreaterThanPercentageAndGender(Double per, Gender gender) {
		
		return studentRepository.findAllByGreaterThanPercentageAndGender(per, gender);
	}

	@Override
	public void modifyStudentByName(String name, Integer rno) {
		
		studentRepository.updateName(name, rno);
		
	}

	@Override
	public List<Object[]> findGenderAndName() {
		
		return studentRepository.findGenderAndName();
	}

	@Override
	public List<Object[]> countByGender() {
		
		return studentRepository.countByGender();
	}

}
