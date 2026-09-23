package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
	public Optional<Student> fetchById(Integer rno) {
		
		return studentRepository.findById(rno);
	}

	@Override
	public List<Student> fetchAll() {
		
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public List<Student> fetchByGender(Gender gender) {
		
		return studentRepository.findByGender(gender);
	}

	@Override
	public List<Student> fetchByBirthDate(LocalDate d) {
		
		return studentRepository.findByBirthDate(d);
	}

	@Override
	public List<Student> fetchByBirthDateGreaterThan(LocalDate d) {
		
		return studentRepository.findByBirthDateGreaterThan(d);
	}

	@Override
	public List<Student> fetchByPerBetween(Double startPer, Double endPer) {
		
		return studentRepository.findByPerBetween(startPer, endPer);
	}

	@Override
	public List<Student> fetchByBirthDateBetween(LocalDate startDate, LocalDate endDate) {
		
		return studentRepository.findByBirthDateBetween(startDate, endDate);
	}

	@Override
	public List<Student> fetchByBirthDateAfter(LocalDate date) {
		
		return studentRepository.findByBirthDateAfter(date);
	}

	@Override
	public List<Student> fetchByBirthDateBefore(LocalDate date) {
		
		return studentRepository.findByBirthDateBefore(date);
	}

	@Override
	public List<Student> fetchByNameStartingWithIgnoreCase(String name) {

		return studentRepository.findByNameStartingWithIgnoreCase(name);
	}

	@Override
	public List<Student> fetchByGenderOrderByPer(Gender gender) {

		return studentRepository.findByGenderOrderByPer(gender);
	}

	@Override
	public List<Student> fetchByGenderAndPerGreaterThanEqual(Gender gender, Double per) {
		
		return studentRepository.findByGenderAndPerGreaterThanEqual(gender, per);
	}

	@Override
	public Long countByGender(Gender gender) {

		return studentRepository.countByGender(gender);
	}

	@Override
	public Boolean existByRno(Integer rno) {
		
		return studentRepository.existsByRno(rno);
	}
	
}