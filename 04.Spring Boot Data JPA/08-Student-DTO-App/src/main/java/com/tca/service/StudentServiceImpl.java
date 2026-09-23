package com.tca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.dto.StudentDTO;
import com.tca.entity.Student;
import com.tca.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentDTO> findStudentNamePerGender() 
	{
		List<Student> list = (List<Student>) studentRepository.findAll();
		List<StudentDTO> studentList = new ArrayList<>();
		
		for(Student ob : list)
		{
			studentList.add(new StudentDTO(ob.getName(),ob.getPer(),ob.getGender()));
		}
		
		return studentList;
	}

}
