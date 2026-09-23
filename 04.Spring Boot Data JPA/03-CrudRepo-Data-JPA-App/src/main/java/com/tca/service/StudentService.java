package com.tca.service;

import java.util.List;
import java.util.Optional;

import com.tca.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public Student saveOrUpdateStudent(Student student);
	public Optional<Student> fetchById(Integer rno);
	public List<Student> fetchAllStudent();
	public List<Student> fetchAllStudentById(Integer rno);
	public Boolean deleteStudent(Integer rno);
	public List<Student> saveAll(List<Student> students);
	public Long countStudent();
	public Boolean existStudentById(Integer rno);
}
