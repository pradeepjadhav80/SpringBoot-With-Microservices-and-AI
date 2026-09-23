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
	public List<Student> fetchAllStudent() 
	{
		//return studentRepository.findAllUsingJPQL();
		
		return studentRepository.findAllUsingSQL();
	}

	@Override
	public List<Student> findPercentageRangeStudent(Double start, Double end) {
		
		return studentRepository.findPercentageRangeUsingJPQL(start,end);
	}

	@Override
	public List<Object[]> findGenderNamePerStudent(Double per, Gender gender) {
		
		return studentRepository.findGenderNamePer(per,gender);
	}

}
