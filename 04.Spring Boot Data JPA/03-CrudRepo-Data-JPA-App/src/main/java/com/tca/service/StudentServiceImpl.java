package com.tca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Student;
import com.tca.repository.StudentRepository;

@Service(value="studentService")
class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public Student saveStudent(Student student) {
				
		return repo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return repo.save(student);		
	}

	@Override
	public Student saveOrUpdateStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Optional<Student> fetchById(Integer rno) {
		
		return repo.findById(rno);
	}

	@Override
	public List<Student> fetchAllStudent() 
	{
		return (List<Student>) repo.findAll();
	}

	@Override
	public Boolean deleteStudent(Integer rno) 
	{
		if(repo.existsById(rno))
		{
			repo.deleteById(rno);
			return true;
		}
		
		return false;
	}

	@Override
	public List<Student> saveAll(List<Student> students) {
		
		return (List<Student>) repo.saveAll(students);
	}

	@Override
	public Long countStudent() {
		
		return repo.count();
	}

	@Override
	public Boolean existStudentById(Integer rno) {
		
		return repo.existsById(rno);
	}

	@Override
	public List<Student> fetchAllStudentById(Integer rno) {
		
		return (List<Student>)repo.findAllById(List.of(rno));
	}

}
